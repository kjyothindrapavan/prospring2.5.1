package com.aspress.prospring2.spring2.ch03.beanfactory;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.aspress.prospring2.spring2.ch03.di.Oracle;

public class BeanFactoryDemo {
	
	public static void main(String... args) {
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new PropertiesBeanDefinitionReader(bf);
		
		reader.loadBeanDefinitions(new ClassPathResource("/META-INF/ch03/beanfactorydemo1-context.properties"));
		Oracle oracle = (Oracle)bf.getBean("oracle");
		System.out.println("Meaning of life is " + oracle.defineMeaningOfLife());
	}

}
