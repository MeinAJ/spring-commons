package com.aj.test.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author Jun.An3
 * @date 2022/03/07
 */
@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public CustomBeanFactoryPostProcessor() {
		System.err.println("CustomBeanFactoryPostProcessor()");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		final AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition)
				beanFactory.getBeanDefinition("a");
		final int autowireMode = beanDefinition.getAutowireMode();
		System.err.println("a#autowireMode修改前:" + autowireMode);
		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
		System.err.println("a#autowireMode修改后:" + beanDefinition.getAutowireMode());

		final String scope = beanDefinition.getScope();
		System.err.println("a#scope修改前:" + scope);
	}

}
