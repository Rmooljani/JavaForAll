package com.techie.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanPostProcessor1 implements BeanPostProcessor,Ordered {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor1:postProcessBeforeInitialization" +beanName + "bean: " +bean);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("MyBeanPostProcessor1:postProcessAfterInitialization" +beanName + "bean: " +bean);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
