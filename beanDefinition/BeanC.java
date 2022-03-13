package com.aj.test.beanDefinition;

import org.springframework.stereotype.Component;

/**
 * A
 *
 * @author Jun.An3
 * @date 2022/03/08
 */
@Component("c")
public class BeanC {

	public BeanC() {
		System.out.println("BeanC()");
	}

	private Long a;

	public Long getA() {
		return a;
	}

	public void setA(Long a) {
		this.a = a;
	}

}
