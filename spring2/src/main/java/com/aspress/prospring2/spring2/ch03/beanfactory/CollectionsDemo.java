package com.aspress.prospring2.spring2.ch03.beanfactory;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CollectionsDemo {
	private Map map;
	private Properties props;
	private Set set;
	private List list;
	
	
	
	
	public static void main(String args[]) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("/META-INF/ch03/collectionsdemo1-context.xml"));
		CollectionsDemo instance = (CollectionsDemo)factory.getBean("collectionsDemo");
		instance.displayInfo();
	}
	
	public void setMap(Map map) {
		this.map = map;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	
	public void displayInfo() {
		Iterator i = map.keySet().iterator();
		System.out.println("Map Contents\n");
		while(i.hasNext()) {
			Object key = i.next();
			System.out.println("Key: "+key+" - value: "+map.get(key));
		}
		
		i=props.keySet().iterator();
		System.out.println("\nProperties contents:\n");
		while(i.hasNext()) {
			String key = i.next().toString();
			System.out.println("key: "+key+" -value: "+props.getProperty(key));
		}
		i=set.iterator();
		System.out.println("\nSet Contents:\n");
		while(i.hasNext()) {
			System.out.println("Value: "+i.next());
		}
		i=list.iterator();
		while(i.hasNext()) {
			System.out.println("Value: "+i.next());
		}
	}
	

}
