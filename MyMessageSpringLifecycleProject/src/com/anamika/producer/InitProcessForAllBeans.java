package com.anamika.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitProcessForAllBeans implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("6. Pre-initialization of "+ bean.getClass() + " of: "+ beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("9. Post-initialization of "+ bean.getClass() + " of: "+ beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
