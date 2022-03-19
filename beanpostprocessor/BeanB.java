/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.beanpostprocessor;

import org.springframework.stereotype.Component;

/**
 * BeanA
 *
 * @author Jun.An3
 * @date 2022/03/12
 */
@Component("b")
public class BeanB {

	public BeanB() {
		System.err.println("BeanB()");
	}

	public void print() {
		System.err.println("BeanB#print()");
	}

}
