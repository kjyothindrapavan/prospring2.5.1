package com.aspress.prospring2.spring2.ch02.decoupled.demo;

import com.aspress.prospring2.spring2.ch02.decoupled.MessageDestination;
import com.aspress.prospring2.spring2.ch02.decoupled.MessageSource;
import com.aspress.prospring2.spring2.ch02.decoupled.destination.StdoutMessageDestination;
import com.aspress.prospring2.spring2.ch02.decoupled.source.SimpleMessageSource;

public class DecoupledHelloWorld {
	
	public static void main(String... args) {
		MessageSource source = new SimpleMessageSource("Hello, world.");
		MessageDestination destination = new StdoutMessageDestination();
		
		destination.write(source.getMessage());
	}

}
