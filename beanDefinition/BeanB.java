package com.aj.test.beanDefinition;

import org.springframework.stereotype.Component;

/**
 * A
 *
 * @author Jun.An3
 * @date 2022/03/08
 */
@Component("b")
public class BeanB {

	public BeanB() {
		System.out.println("BeanB()");
	}

	private Long a;

	public Long getA() {
		return a;
	}

	public void setA(Long a) {
		this.a = a;
	}

}
