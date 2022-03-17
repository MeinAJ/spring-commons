package com.aj.test.mybatis;

/**
 * MybatisConfig
 *
 * @author Jun.An3
 * @date 2022/03/17
 */
@MybatisScan(value = "com.aj.test.mybatis.mapper")
public class MybatisConfig {

	public MybatisConfig() {
		System.out.println("MybatisConfig()");
	}

}
