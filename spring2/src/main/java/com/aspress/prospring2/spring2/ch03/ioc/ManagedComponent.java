package com.aspress.prospring2.spring2.ch03.ioc;

import org.springframework.beans.factory.BeanFactory;

public interface ManagedComponent {
	void lookup(BeanFactory container);
}
