/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.beanpostprocessor;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

/**
 * BeanA
 *
 * @author Jun.An3
 * @date 2022/03/12
 */
@Component("a")
public class BeanA {

	public BeanA() {
		System.err.println("BeanA()");
	}

	@PostConstruct
	public void initMethods(){
		System.err.println("BeanA#@PostConstruct");
	}
}
