package com.aspress.prospring2.spring2.ch03.ioc;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.aspress.prospring2.spring2.ch02.spring.MessageService;

public class ContextualizedDependencyLookupDemo {
	
	private static Set<ManagedComponent> components = new HashSet<>();
	
	private static class MessageServiceComponent implements ManagedComponent {
		
		private MessageService service;
		
		public void lookup(BeanFactory container) {
			this.service = (MessageService)container.getBean("service");
		}
		
		public void run() {
			this.service.execute();
		}
		
	}
	
	public static void main(String... args) {
		BeanFactory bf = getBeanFactory();
		MessageServiceComponent msc = new MessageServiceComponent();
		registerComponent(msc);
		allowComponentToLookUp(bf);
		msc.run();
	}
	
	private static void allowComponentToLookUp(BeanFactory bf) {
		for(ManagedComponent component : components) {
			component.lookup(bf);
		}
	}
	
	private static void registerComponent(ManagedComponent component) {
		components.add(component);
	}
	
	private static BeanFactory getBeanFactory() {
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new PropertiesBeanDefinitionReader(bf);
		reader.loadBeanDefinitions(new ClassPathResource("/META-INF/ch03/ioc-pull-context.properties"));
		return bf;
	}

}
