package com.aspress.prospring2.spring2.ch03.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aspress.prospring2.spring2.ch03.di.Oracle;

public class XmlBeanFactoryDemo {
	
	public static void main(String... args) {
		XmlBeanFactory bf = new XmlBeanFactory(
				new ClassPathResource("/META-INF/ch03/beanfactorydemo1-context.xml"));
		Oracle oracle = (Oracle)bf.getBean("oracle");
		System.out.println("Meaning of life is " + oracle.defineMeaningOfLife());
	}

}
