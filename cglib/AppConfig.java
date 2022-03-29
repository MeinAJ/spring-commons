package com.aj.test.cglib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public BeanA beanA() {
		System.err.println("Appconfig#x()");
		return new BeanA();
	}

	@Bean
	public BeanB beanB() {
		beanA();
		return new BeanB();
	}

}