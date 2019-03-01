package com.techie.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean,DisposableBean{
	
	private String message;
	private Integer messageId;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is going thru initialization...");
	}
	@Override
	public void destroy() throws Exception {
        System.out.println("bean is going to destroy...");		
	}
	
	

}
