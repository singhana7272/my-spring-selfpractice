package com.anamika.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.demo.Circle;
import com.anamika.producer.Performer;

public class Performance {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
		Performer performer1=(Performer)springContainer.getBean("edsheeran");
		performer1.perform();
		
		
		Performer performer2=(Performer)springContainer.getBean("Joker1");
		performer2.perform();
		
		Performer performer6=(Performer)springContainer.getBean("Joker2");
		performer6.perform();
		
		Performer performer3=(Performer)springContainer.getBean("michaeljackson");
		performer3.perform();
		
		Performer performer4=(Performer)springContainer.getBean("guitarist");
		performer4.perform();
		
		Performer performer5=(Performer)springContainer.getBean("drummer");
		performer5.perform();
		
		Circle cir=(Circle)springContainer.getBean("dummyCircle");
		System.out.println(cir.getPi());
		
	}

}
