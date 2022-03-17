package com.aj.test.mybatis;

import com.aj.test.mybatis.annotation.MybatisUpdate;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.core.annotation.AnnotationUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * MybatisFactoryBean
 *
 * @author Jun.An3
 * @date 2022/03/17
 */
public class MybatisFactoryBean implements FactoryBean {

	private final Class interfacz;

	public MybatisFactoryBean(Class clazz) {
		this.interfacz = clazz;
	}

	@Override
	public Object getObject() {

		return Proxy.newProxyInstance(MybatisFactoryBean.class.getClassLoader(), new Class[]{this.interfacz}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if (Object.class.equals(method.getDeclaringClass())) {
					return method.invoke(this, args);
				} else {
					System.err.println("代理方法：" + interfacz.getName());
					final Method[] methods = interfacz.getMethods();
					for (Method mapperMethod : methods) {
						final MybatisUpdate annotation1 = AnnotationUtils.findAnnotation(mapperMethod, MybatisUpdate.class);
						System.err.println("update value:" + annotation1.value());
					}
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
