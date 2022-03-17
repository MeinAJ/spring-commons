package com.aj.test.mybatis.mapper;

/**
 * MybatisMapper
 *
 * @author Jun.An3
 * @date 2022/03/17
 */
public interface MybatisMapper {

	@Update(value = "select * from t_user")
	void update();

}
