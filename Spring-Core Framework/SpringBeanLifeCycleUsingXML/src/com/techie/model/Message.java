package com.techie.model;

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
	
	public void init() throws Exception {
		System.out.println("Bean is going thru initialization...");
	}
	
	public void destroy() throws Exception {
        System.out.println("bean is going to destroy...");		
	}
	
	

}
