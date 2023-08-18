package com.anamika.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.demo.Employee;
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
//		System.out.println("*************************************");
//		
//		Performer performer1=(Performer)springContainer.getBean("juggler1");
//		
//		Performer performer2=(Performer)springContainer.getBean("juggler1");
//		
//		System.out.println("Juggler 1: performer 1 :"+ performer1);
//		System.out.println("Juggler 1: performer 2 :"+ performer2);
//		
//		Performer performer3=(Performer)springContainer.getBean("juggler2");
//		
//		Performer performer4=(Performer)springContainer.getBean("juggler2");
//		
//		System.out.println("Juggler 2: performer 3 :"+ performer3);
//		System.out.println("Juggler 2: performer 4 :"+ performer4);
		
		Employee emp1=(Employee) springContainer.getBean("salaried");
		emp1.showEmployee();

	}

}
