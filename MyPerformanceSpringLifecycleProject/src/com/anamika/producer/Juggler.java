package com.anamika.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Juggler implements Performer, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private int balls;
	
	private String beanName;
	
	public Juggler() {
		System.out.println("1. Juggler's constructor is called");
	}

	public void setBalls(int balls) {
		System.out.println("2. Juggler's setter method is called");
		this.balls = balls;  
	}

	@Override
	public void perform() {
		System.out.println(beanName + " Juggler is juggling "+balls+" Balls!");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("3. Setting the beanName to : "+ name);
		this.beanName=name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. Setting the bean factory(if any) of : "+beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("5. Setting the application factory(if any) of : "+beanName);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7. Common init method for all jugglers and this is for "+ beanName);
	}
	
	public void customInitForBean1() {
		System.out.println("8. Custom init for "+ beanName);
	}
	
	public void customInitForBean2() {
		System.out.println("8. Custom init for "+ beanName);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destruction 1 : destroy : "+ beanName);
	}
	
	private void customDestroyForBean1() {
		System.out.println("Destruction 2: destroying method 1 of : "+beanName);
	}
	
	private void customDestroyForBean2() {
		System.out.println("Destruction 2: destroying method 2 of : "+beanName);
	}

}
