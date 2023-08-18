package com.anamika.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SMS implements Message, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean{
	
	private long senderNo;
	private long receiverNo;
	
	private String beanName;

	public SMS() {
		System.out.println("1. SMS constructor call");
	}

	public void setSenderNo(long senderNo) {
		System.out.println("2. SMS setter call");
		this.senderNo = senderNo;
	}
	
	public void setReceiverNo(long receiverNo) {
//		System.out.println("2. SMS setter call");
		this.receiverNo = receiverNo;
	}

	@Override
	public void send() {
		System.out.println(beanName+"'s sender mail is "+senderNo +" and receiver mail is "+receiverNo);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("3. Setting the beanName to : "+name);
		this.beanName=name;
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. Setting the bean factory (if any) of : "+beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("5. Setting the application factory (if any) of : "+beanName);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7. Common init method for all the SMS's and this is for "+beanName);
	}
	
	private void customInitForBean1() {
		System.out.println("8. Custom init method for : "+beanName);
	}
	
	private void customInitForBean2() {
		System.out.println("8. Custom init method for : "+beanName);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("10. Destruction 1: to destroy "+beanName);
	}
	
	private void customDestroyForBean1() {
		System.out.println("11. Destruction 2: to destroy method 1 of :"+beanName);
	}
	
	private void customDestroyForBean2() {
		System.out.println("11. Destruction 2: to destroy method 2 of :"+beanName);
	}
}
