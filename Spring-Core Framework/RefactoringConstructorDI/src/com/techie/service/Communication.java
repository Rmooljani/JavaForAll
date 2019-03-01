package com.techie.service;

import com.techie.message.Messaging;

public class Communication {
	
	private Messaging message;

	public Communication(Messaging message) {
		super();
		this.message = message;
	}
	
	public void communicate() {
		message.sendMessage();
	}

}
