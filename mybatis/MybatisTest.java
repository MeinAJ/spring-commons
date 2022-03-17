/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.mybatis;

import com.aj.test.mybatis.mapper.MybatisTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * MybatisTest
 *
 * @author Jun.An3
 * @date 2022/03/17
 */
@Component
public class MybatisTest {

	@Autowired
	private MybatisTestMapper mybatisMapper;

	public void test() {
		String result = mybatisMapper.print();
		System.err.println("result-----------" + result);

		result = mybatisMapper.print();
		System.err.println("result-----------" + result);
	}

}
