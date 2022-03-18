package com.aj.test.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * TestBeanPostProcessor
 *
 * @author Jun.An3
 * @date 2022/03/18
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 执行到这一步，就已经完成了bean的创建，以及属性的注入
	 * 在这里可以替换bean对象，比如使用Proxy，动态代理，做一些事情
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Object result = bean;
		if ("a".equals(beanName)) {
			System.err.println("BeanA原生的Bean：" + bean);
			result = new BeanA();
			System.err.println("BeanA新的Bean：" + result);
		}
		return result;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("a".equals(beanName)) {
			final BeanA beanA = (BeanA) bean;
			System.err.println("拿到BeanA的Bean：" + beanA);
		}
		return bean;
	}

}
