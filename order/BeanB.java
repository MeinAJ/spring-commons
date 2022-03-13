/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.order;

import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * BeanA
 *
 * @author Jun.An3
 * @date 2022/03/12
 */
@Order(1)
@Component("b")
public class BeanB extends BaseBean implements PriorityOrdered {

	public BeanB() {
		System.out.println("BeanB()");
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
