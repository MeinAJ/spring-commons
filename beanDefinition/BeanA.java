package com.aj.test.beanDefinition;

import org.springframework.stereotype.Component;

/**
 * A
 *
 * @author Jun.An3
 * @date 2022/03/08
 */
@Component("a")
public class BeanA {

	private BeanB beanB;

	public BeanA() {
		System.out.println("BeanA()");
	}

	public BeanA(BeanB beanB){
		this.beanB = beanB;
		System.out.println("BeanA(BeanB beanB)");
	}

	public void setB(BeanB beanB){
		this.beanB = beanB;
		System.out.println("setB(BeanB beanB)");
	}

	private Long a;

	public Long getA() {
		return a;
	}

	public void setA(Long a) {
		this.a = a;
	}

}
