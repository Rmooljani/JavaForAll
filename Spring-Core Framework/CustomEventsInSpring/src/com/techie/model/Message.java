package com.techie.model;

public class Message {
	
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
	public String toString() {
		return "Message [message=" + message + ", messageId=" + messageId + "]";
	}
	
	

}
