package com.anamika.demo;

public class MySingletonClassDemo {
	
	private static MySingletonClassDemo instance;
	
	private MySingletonClassDemo() {
		
	}
	
	public void show() {
		System.out.println("Hi I am show method from MySingletonClassDemo");
	}

	public static MySingletonClassDemo getInstance() {
		if(instance==null)
			instance=new MySingletonClassDemo();
		return instance;
	}
	
	

}
