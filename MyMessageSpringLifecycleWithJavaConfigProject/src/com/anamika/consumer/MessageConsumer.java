package com.anamika.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.config.MessageConfiguration;
import com.anamika.producer.Message;

public class MessageConsumer {

	public static void main(String[] args) {
//	ApplicationContext springContainer=new ClassPathXmlApplicationContext("message.xml");
	
//	AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("message.xml");
	AbstractApplicationContext springContainer=new AnnotationConfigApplicationContext(MessageConfiguration.class);
	springContainer.registerShutdownHook();
	
	System.out.println("*************************************");
	
	Message message1=(Message)springContainer.getBean("SMS1");
	Message message2=(Message)springContainer.getBean("SMS1");
	
	System.out.println("Message 1:"+message1);
	System.out.println("Message 2:"+message2);
//	message1.send();
//	
	Message message3=(Message)springContainer.getBean("SMS2");
//	message2.send();
	
	
	}
}
