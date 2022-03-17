package com.aj.test.mybatis.annotation;

import com.aj.test.mybatis.MybatisImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Jun.An3
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Import(MybatisImportBeanDefinitionRegistrar.class)
public @interface MybatisScan {

	String value();

}
