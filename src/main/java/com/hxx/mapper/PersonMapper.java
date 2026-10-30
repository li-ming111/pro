package com.hxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxx.domain.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper extends BaseMapper<Person> {
}
