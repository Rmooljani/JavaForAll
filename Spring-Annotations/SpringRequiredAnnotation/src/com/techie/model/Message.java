package com.techie.model;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Message {
	
	private Integer messageId;
	
	private String message;
	
	public Integer getMessageId() {
		return messageId;
	}
	@Required
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	@Required
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", message=" + message + "]";
	}
	
	

}
