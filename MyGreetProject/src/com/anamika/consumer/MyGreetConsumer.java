package com.anamika.consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.anamika.producer.GoodMorning;
import com.anamika.producer.Greet;

public class MyGreetConsumer {

	public static void main(String[] args) {
	
		Resource resource=new ClassPathResource("Greet.xml");
		BeanFactory springContainer=new XmlBeanFactory(resource);
		
		Greet greet=(Greet)springContainer.getBean("eve");
		greet.wish();
		
	}

}
