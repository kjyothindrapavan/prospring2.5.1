package com.aspress.prospring2.spring2.ch02.decoupled.source;

import com.aspress.prospring2.spring2.ch02.decoupled.MessageSource;

public class SimpleMessageSource implements MessageSource {
	private final String message;
	
	public SimpleMessageSource() {
		this("Hello, world.");
	}
	
	public SimpleMessageSource(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
