package com.aj.test.mybatis;

import com.aj.test.mybatis.mapper.MybatisMapper;
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
public class MybatisFactoryBean implements FactoryBean {

	@Override
	public Object getObject() throws Exception {

		return Proxy.newProxyInstance(MybatisFactoryBean.class.getClassLoader(), new Class[]{MybatisMapper.class}, new InvocationHandler() {
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
		return MybatisMapper.class;
	}

}
