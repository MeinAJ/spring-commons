/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.beanpostprocessor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

/**
 * TestInitializingBean
 *
 * @author Jun.An3
 * @date 2022/03/19
 */
@Component
public class TestInitializingBean implements InitializingBean {

	@PostConstruct
	public void initMethod(){
		System.out.println("TestInitializingBean#initMethod()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("TestInitializingBean#afterPropertiesSet");
	}

}
