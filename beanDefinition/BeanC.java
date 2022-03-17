/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.beanDefinition;

import com.aj.test.order.BaseBean;
import org.springframework.stereotype.Component;

/**
 * BeanA
 *
 * @author Jun.An3
 * @date 2022/03/12
 */
@Component("c")
public class BeanC extends BaseBean {

	public BeanC() {
		System.out.println("BeanC()");
	}

}
