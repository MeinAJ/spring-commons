package com.aj.test.beanDefinition;

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
		System.out.println("CustomBeanFactoryPostProcessor()");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		final AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");
		final int autowireMode = beanDefinition.getAutowireMode();
		System.out.println(autowireMode);
		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
	}

}
