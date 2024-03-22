package com.aspress.prospring2.spring2.ch02.decoupled.destination;

import com.aspress.prospring2.spring2.ch02.decoupled.MessageDestination;

public class StdoutMessageDestination implements MessageDestination {

	public void write(String message) {
		System.out.println(message);
	}
	
}
