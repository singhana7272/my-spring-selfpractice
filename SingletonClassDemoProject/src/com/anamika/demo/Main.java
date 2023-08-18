package com.anamika.demo;

public class Main {

	public static void main(String[] args) {
		MySingletonClassDemo ob1=MySingletonClassDemo.getInstance();
		System.out.println("ob1:"+ob1);
		
		MySingletonClassDemo ob2=MySingletonClassDemo.getInstance();
		System.out.println("ob2:"+ob2);
	}

}
