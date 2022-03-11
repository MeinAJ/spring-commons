package com.aj.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * com.aj.test1.Test1
 *
 * @author Jun.An3
 * @date 2022/03/07
 */
@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public CustomBeanFactoryPostProcessor(){
		System.out.println("Test1创建");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		final AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");
		final int autowireMode = beanDefinition.getAutowireMode();
		System.out.println(autowireMode);
		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
	}

}
