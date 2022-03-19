package com.aj.test;

import com.aj.test.mybatis.MybatisTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jun.An3
 * @date 2022/03/07
 */
@ComponentScan(basePackages = "com.aj.test.beanpostprocessor")
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				context = new AnnotationConfigApplicationContext(Main.class);
//		BeanD beanD = context.getBean(BeanD.class);
//		beanD.print();

//		LC la = context.getBean(LC.class);
//		la.printInfo();

//		System.out.println(BeanA.class.getName());

//		final Object mybatisFactoryBean = context.getBean("mybatisFactoryBean");
//		System.out.println(context.getBean("&mybatisFactoryBean"));
//		System.out.println(context.getBean("mybatisFactoryBean"));
//		System.out.println(context.getBean("mybatisFactoryBean").getClass());

//		MybatisTest bean = context.getBean(MybatisTest.class);
//		bean.test();



		context.close();
	}

}
