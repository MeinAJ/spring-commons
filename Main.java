package com.aj.test;

import com.aj.test.lookup.LA;
import com.aj.test.lookup.LC;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jun.An3
 * @date 2022/03/07
 */
@ComponentScan(basePackages = "com.aj.test.lookup")
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				context = new AnnotationConfigApplicationContext(Main.class);
//		BeanD beanD = context.getBean(BeanD.class);
//		beanD.print();

		LC la = context.getBean(LC.class);
		la.printInfo();

		context.close();
	}

}
