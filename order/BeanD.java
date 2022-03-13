/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * BeanA
 *
 * @author Jun.An3
 * @date 2022/03/12
 */
@Component("d")
public class BeanD {

	@Autowired
	private List<BaseBean> baseBeans;

	public BeanD() {
		System.out.println("BeanD()");
	}

	public void print() {
		System.out.println("print()");
	}

}
