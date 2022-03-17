package com.aj.test.mybatis.mapper;

import com.aj.test.mybatis.annotation.Update;

/**
 * MybatisMapper
 *
 * @author Jun.An3
 * @date 2022/03/17
 */
public interface MybatisMapper {

	@Update(value = "select * from t_user")
	void print();

}
