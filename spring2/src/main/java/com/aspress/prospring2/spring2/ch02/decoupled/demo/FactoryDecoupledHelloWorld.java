package com.aspress.prospring2.spring2.ch02.decoupled.demo;

import com.aspress.prospring2.spring2.ch02.decoupled.MessageDestination;
import com.aspress.prospring2.spring2.ch02.decoupled.MessageSource;
import com.aspress.prospring2.spring2.ch02.decoupled.beanfactory.BeanFactory;

public class FactoryDecoupledHelloWorld {
	public static void main(String... args) {
		BeanFactory beanFactory = new BeanFactory("/META-INF/helloworld-context.properties");
		MessageSource source = (MessageSource) beanFactory.getBean("source");
		MessageDestination destination = (MessageDestination) beanFactory.getBean("destination");
		destination.write(source.getMessage());
	}

}
