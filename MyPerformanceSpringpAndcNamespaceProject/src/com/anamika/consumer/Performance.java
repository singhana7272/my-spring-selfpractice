package com.anamika.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.producer.Performer;

public class Performance {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performance.xml");
		Performer performer1=(Performer)springContainer.getBean("edsheeran");
		performer1.perform();
		
		
		Performer performer2=(Performer)springContainer.getBean("Joker");
		performer2.perform();
		
		
		Performer performer3=(Performer)springContainer.getBean("michaeljackson");
		performer3.perform();
		
		Performer performer4=(Performer)springContainer.getBean("guitarist");
		performer4.perform();
		
	}

}
