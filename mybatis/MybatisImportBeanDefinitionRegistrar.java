package com.aj.test.mybatis;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MybatisImportBeanDefinitionRegistrar
 *
 * @author Jun.An3
 * @date 2022/03/17
 */
public class MybatisImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry,
										BeanNameGenerator importBeanNameGenerator) {
		final BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition();
		final AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		beanDefinition.setBeanClass(MybatisFactoryBeanPlus1.class);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(MybatisMapper.class);
		registry.registerBeanDefinition(MybatisMapper.class.getSimpleName(), beanDefinition);
	}

}
