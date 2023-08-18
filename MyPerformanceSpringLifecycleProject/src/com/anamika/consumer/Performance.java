package com.anamika.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.producer.Performer;

public class Performance {

	public static void main(String[] args) {
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
		
//		Performer performer1=(Performer)springContainer.getBean("juggler1");
//		performer1.perform();
//		
//		Performer performer2=(Performer)springContainer.getBean("juggler2");
//		performer2.perform();
		
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
		springContainer.registerShutdownHook();
		
	}

}
