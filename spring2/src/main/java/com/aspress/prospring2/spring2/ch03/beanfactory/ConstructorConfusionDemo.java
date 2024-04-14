package com.aspress.prospring2.spring2.ch03.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ConstructorConfusionDemo {
	
	private String someValue;
	
	public ConstructorConfusionDemo(String someValue) {
		System.out.println("ConstructorConfusionDemo(String) called");
		this.someValue = someValue;
	}
	
	public ConstructorConfusionDemo(int someValue) {
		System.out.println("ConstructorConfusionDemo(int) called");
		this.someValue = "Number: " + Integer.toString(someValue);
	}
	
	public static void main(String... args) {
		XmlBeanFactory bf = 
				new XmlBeanFactory(new ClassPathResource("/META-INF/ch03/beanfactorydemo3-context.xml"));
		
		ConstructorConfusionDemo cc = (ConstructorConfusionDemo) bf.getBean("constructorconfusion");
		System.out.println(cc);
		
	}
	
	public String toString() {
		return someValue;
	}

}
