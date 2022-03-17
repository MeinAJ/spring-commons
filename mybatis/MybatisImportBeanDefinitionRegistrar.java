package com.aj.test.mybatis;

import com.aj.test.mybatis.mapper.Update;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.type.AnnotationMetadata;
import java.lang.reflect.Method;
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
//		final BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition();
//		final AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
//		beanDefinition.setBeanClass(MybatisFactoryBeanPlus1.class);
//		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(MybatisMapper.class);
//		registry.registerBeanDefinition(MybatisMapper.class.getSimpleName(), beanDefinition);

		final Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(MybatisScan.class.getName());
		if (annotationAttributes != null) {
			Object value = annotationAttributes.get("value");
			if (value != null) {
				String mapperPath = (String) value;
				final Set<Class<?>> classes = ClassUtils.getClasses(mapperPath);
				for (Class<?> aClass : classes) {

					if (aClass.getName().toLowerCase().endsWith("mapper") && aClass.isInterface()) {
						System.err.println(aClass.getName());

						final Method[] methods = aClass.getMethods();
						for (Method method : methods) {

							final Update annotation1 = AnnotationUtils.findAnnotation(method, Update.class);
							System.err.println("update value:" + annotation1.value());

						}
					}
				}
			}
		}
	}

}
