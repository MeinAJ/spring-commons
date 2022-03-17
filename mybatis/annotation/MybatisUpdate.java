package com.aj.test.mybatis.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Jun.An3
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MybatisUpdate {

	String value();

}
