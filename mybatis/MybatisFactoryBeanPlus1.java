package com.aj.test.mybatis;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * MybatisFactoryBean
 *
 * @author Jun.An3
 * @date 2022/03/17
 */
//@Component
public class MybatisFactoryBeanPlus1 implements FactoryBean {

	private final Class interfacz;

	public MybatisFactoryBeanPlus1(Class clazz){
		this.interfacz = clazz;
	}

	@Override
	public Object getObject() throws Exception {

		return Proxy.newProxyInstance(MybatisFactoryBeanPlus1.class.getClassLoader(), new Class[]{this.interfacz}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if (Object.class.equals(method.getDeclaringClass())) {
					return method.invoke(this, args);
				} else {
					method.invoke(this, args);
					return null;
				}
			}
		});
	}

	@Override
	public Class<?> getObjectType() {
		return this.interfacz;
	}

}
