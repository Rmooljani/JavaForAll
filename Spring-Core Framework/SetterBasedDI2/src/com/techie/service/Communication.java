package com.techie.service;

import com.techie.message.Messaging;

public class Communication {
	
	private Messaging message;

	public Communication(Messaging message) {
		super();
		this.message = message;
	}
	
	
	
	public Messaging getMessage() {
		return message;
	}



	public void setMessage(Messaging message) {
		this.message = message;
	}



	public void communicate() {
		message.sendMessage();
	}

}
