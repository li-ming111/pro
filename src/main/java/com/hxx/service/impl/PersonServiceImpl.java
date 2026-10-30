package com.hxx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.domain.Person;
import com.hxx.mapper.PersonMapper;
import com.hxx.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

    @Autowired
    private PersonMapper personMapper;
    @Override
    public Page<Person> findByPage(Page<Person> page, String name) {
        return personMapper.selectPage(page,new LambdaQueryWrapper<Person>()
                .like(!name.isEmpty(),Person::getUsername,name)
        );
    }
}


























