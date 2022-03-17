package com.aj.test.mybatis;

import com.aj.test.mybatis.annotation.MybatisScan;
import com.aj.test.mybatis.mapper.MybatisMapper;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import java.util.Map;
import java.util.Set;

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
		final Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(MybatisScan.class.getName());
		if (annotationAttributes != null) {
			Object value = annotationAttributes.get("value");
			if (value != null) {
				String mapperPath = (String) value;
				final Set<Class<?>> classes = ClassUtils.getClasses(mapperPath);
				for (Class<?> aClass : classes) {
					if (aClass.getName().toLowerCase().endsWith("mapper") && aClass.isInterface()) {
						registerBeanDefinition(registry, aClass);
					}
				}
			}
		}
	}

	private void registerBeanDefinition(BeanDefinitionRegistry registry, Class<?> clazz) {
		if (clazz == null) {
			throw new NullPointerException("clazz为空");
		}
		final BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition();
		final AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		beanDefinition.setBeanClass(MybatisFactoryBean.class);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(clazz);
		System.out.println(clazz.getSimpleName());
		registry.registerBeanDefinition("mybatis" + clazz.getSimpleName(), beanDefinition);
	}

}
