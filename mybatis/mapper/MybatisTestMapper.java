package com.aj.test.mybatis.mapper;

import com.aj.test.mybatis.annotation.MybatisMapper;
import com.aj.test.mybatis.annotation.MybatisUpdate;

/**
 * MybatisMapper
 *
 * @author Jun.An3
 * @date 2022/03/17
 */
@MybatisMapper
public interface MybatisTestMapper {

	@MybatisUpdate(value = "select * from t_user")
	String print();

}
