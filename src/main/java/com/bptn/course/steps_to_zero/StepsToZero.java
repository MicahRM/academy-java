package com.bptn.course.steps_to_zero;

public class StepsToZero {
	
	public static int numberOfSteps(int num) {
        int steps = 0;
        
        while(num!=0){    //created while loop to iterate until num == 0/ loop indefinitely and terminate when num == 0
            if(num % 2 ==0){  //if statement to first determine if num is even, if so then the number is divided by 2 and steps is incremented by 1.
                num = num/2;  //statement to divide num by 2 and assign the new value to the local variable num within this loop.
                steps++;      //increments the step counter by 1.
            }else{        //else statement to handle when the local variable num has now become odd.
                num = num-1;   //statement that decrements the local variable num by 1 given that it is odd.
                steps++;       //increments the step counter by 1.
            }
        }

        // Fill in the code below based on the problem statement

        return steps;
    }

	public static void main(String[] args) {
		
		//test 1
		int num = 123;
		int steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce" + num + "to zero is: " + steps);
		
		
		// test 2
		num = 14;
		steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce" + num + "to zero is: " + steps);

	}

}
