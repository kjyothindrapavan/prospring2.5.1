package com.aspress.prospring2.spring2.ch03.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.aspress.prospring2.spring2.ch02.spring.MessageService;

public class DependencyPullDemo {
	public static void main(String... args) {
		BeanFactory bf = getBeanFactory();
		
		MessageService service = (MessageService) bf.getBean("service");
		service.execute();
	}
	
	private static BeanFactory getBeanFactory() {
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new PropertiesBeanDefinitionReader(bf);
		reader.loadBeanDefinitions(new ClassPathResource("/META-INF/ch03/ioc-pull-context.properties"));
		return bf;
	}

}
