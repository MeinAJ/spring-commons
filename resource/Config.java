/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.aj.test.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Config
 *
 * @author Jun.An3
 * @date 2022/03/12
 */
@Configuration
public class Config {

	@Bean
	public BeanB bb(){
		System.out.println("BeanB()-bb");
		return new BeanB();
	}

}
