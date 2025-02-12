package com.bptn.course._17_java_threads._coding_39;

import java.util.List;

public class MyThread extends Thread {
	
	
	//declare an instance variable of type List<Integer>
	
	
	private List<Integer> list;
	
	
	
	//create a parameterized constructor
	
	public MyThread(String name, List<Integer> list) {
		
		super(name);
		this.list = list;		
	}
	
	
	
	//override the run() method here 
	
	@Override
	public void run() {
		
		ListUtils.insertNextId(list);
	}


}
