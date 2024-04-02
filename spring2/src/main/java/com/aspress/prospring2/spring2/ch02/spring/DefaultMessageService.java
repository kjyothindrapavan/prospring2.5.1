package com.aspress.prospring2.spring2.ch02.spring;

import com.aspress.prospring2.spring2.ch02.decoupled.MessageDestination;
import com.aspress.prospring2.spring2.ch02.decoupled.MessageSource;

public class DefaultMessageService implements MessageService {
	private MessageSource source;
	private MessageDestination destination;
	
	public void execute() {
		destination.write(source.getMessage());
	}
	
	public void setSource(MessageSource source) {this.source = source;}
	public void setDestination(MessageDestination destination) {this.destination = destination;}

}
