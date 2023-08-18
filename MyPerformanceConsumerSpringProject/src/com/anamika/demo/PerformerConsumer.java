package com.anamika.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.producer.Performer;

public class PerformerConsumer {

	public static void main(String[] args) {
	
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("myperform.xml","performance.xml");
		Performer performer1=(Performer)springContainer.getBean("Joker");
		performer1.perform();
		
		

	}

}
