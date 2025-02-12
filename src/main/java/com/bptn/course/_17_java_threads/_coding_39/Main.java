package com.bptn.course._17_java_threads._coding_39;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5,1,4,3,6,2));

	        // Create a t1 and t2 of MyThread class here.
		 
		 MyThread t1 = new MyThread("T1", list);
		 MyThread t2 = new MyThread("T2", list);

	        // Start t1 and t2 threads here
		 t1.start();
		 t2.start();
	        // Run the join() method from t1 and t2 threads here
		 
		 try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		

	        // Print out the list variable here.
		 
		 System.out.println(list);
	    

	}

}



/*
 * scenario 1 - both threads are executing sequentially
 * 
 * t1 = 5,1,4,3,6,2,7
 * t2 = 5,1,4,3,6,2,7,8
 * 
 * final output = 5,1,4,3,6,2,7,8
 * 
 * 
 * scenario 2 - both threads accessing the same list at the same time
 * 
 * t1 = 5,1,4,3,6,2,7
 * t2 = 5,1,4,3,6,2,7,7
 * 
 * final output = 5,1,4,3,6,2,7,7
 * 
 * 
 */
