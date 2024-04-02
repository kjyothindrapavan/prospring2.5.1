package com.aspress.prospring2.spring2.ch02.spring;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class DISpringHelloWorld {
	
	public static void main(String... args) {
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new PropertiesBeanDefinitionReader(bf);
		reader.loadBeanDefinitions(new ClassPathResource("/META-INF/helloworld3-context.properties"));
		MessageService service = (MessageService) bf.getBean("service");
		service.execute();
	}

}
