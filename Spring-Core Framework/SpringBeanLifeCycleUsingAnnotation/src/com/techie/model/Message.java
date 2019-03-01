package com.techie.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message{
	
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
	
	@PreDestroy
	public void init() throws Exception {
		System.out.println("Bean is going thru initialization...");
	}
	@PostConstruct
	public void destroy() throws Exception {
        System.out.println("bean is going to destroy...");		
	}
	
	

}
