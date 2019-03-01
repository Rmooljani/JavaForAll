package com.techie.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("message")
@Scope("singleton")
public class Message {
	
	private Integer messageId;
	private String message;
	
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
