/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * BeanA
 *
 * @author Jun.An3
 * @date 2022/03/12
 */
@Component("a")
public class BeanA implements ApplicationContextAware, InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("BeanA#afterPropertiesSet");
	}

	@PostConstruct
	public void initMethod() {
		System.err.println("BeanA#initMethod()");
	}

	@PreDestroy
	public void destroy() {
		System.err.println("BeanA#destroy()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.err.println("BeanA#setApplicationContext");
	}

}
