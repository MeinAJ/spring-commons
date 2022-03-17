/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

/**
 * @author Jun.An3
 * @date 2022/03/12
 */
@DependsOn(value = "a")
@Component("b")
public class BeanB {

	public BeanB() {
		System.out.println("BeanB()");
	}

	@PostConstruct
	public void init(){
		System.out.println("BeanB#init()");
	}
}
