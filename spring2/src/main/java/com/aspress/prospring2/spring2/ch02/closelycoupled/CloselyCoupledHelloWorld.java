package com.aspress.prospring2.spring2.ch02.closelycoupled;

import java.io.PrintStream;

final class MessageSource {
	private final String message;
	public MessageSource(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}

class MessageDestination {
	public void write(PrintStream out, String msg) {
		out.println(msg);
	}
}


public class CloselyCoupledHelloWorld {
	public static void main(String... args) {
		MessageSource source = new MessageSource("Hello, world.");
		MessageDestination destination = new MessageDestination();
		destination.write(System.out, source.getMessage());
	}
}
