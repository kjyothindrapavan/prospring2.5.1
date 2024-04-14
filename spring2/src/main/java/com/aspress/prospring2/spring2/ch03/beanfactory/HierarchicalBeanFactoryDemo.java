package com.aspress.prospring2.spring2.ch03.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HierarchicalBeanFactoryDemo {
	
	public static void main(String args[]) {
		XmlBeanFactory parentFactory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/ch03/injectdemo2-context.xml"));
		XmlBeanFactory childFactory = new XmlBeanFactory(
				new ClassPathResource("/META-INF/ch03/injectdemo3-context.xml"), parentFactory);
			
		
        System.out.println(parentFactory.getBean("injectSimpleParent"));
        System.out.println(childFactory.getBean("injectSimpleChild"));
        System.out.println(childFactory.getBean("injectSimpleChild2"));
				
	}

}
