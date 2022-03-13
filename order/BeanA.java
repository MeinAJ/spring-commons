/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.order;

import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * BeanA
 *
 * @author Jun.An3
 * @date 2022/03/12
 */
@Order(2)
@Component("a")
public class BeanA extends BaseBean implements PriorityOrdered {

	public BeanA() {
		System.out.println("BeanA()");
	}

	@Override
	public int getOrder() {
		return 1;
	}

}
