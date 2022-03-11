package com.aj.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * com.aj.test1.Test1
 *
 * @author Jun.An3
 * @date 2022/03/07
 */
@ComponentScan(basePackages = "com.aj.test")
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				context = new AnnotationConfigApplicationContext(Main.class);
		context.close();
	}

}
