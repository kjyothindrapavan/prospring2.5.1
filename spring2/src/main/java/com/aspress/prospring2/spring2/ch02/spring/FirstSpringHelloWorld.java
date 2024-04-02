package com.aspress.prospring2.spring2.ch02.spring;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.aspress.prospring2.spring2.ch02.decoupled.MessageDestination;
import com.aspress.prospring2.spring2.ch02.decoupled.MessageSource;

public class FirstSpringHelloWorld {
	
	public static void main(String... args) {
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new PropertiesBeanDefinitionReader(bf);
		reader.loadBeanDefinitions(new ClassPathResource("/META-INF/helloworld2-context.properties"));
		MessageSource source = (MessageSource)bf.getBean("source");
		MessageDestination destination = (MessageDestination)bf.getBean("destination");
		
		destination.write(source.getMessage());
	}
}
