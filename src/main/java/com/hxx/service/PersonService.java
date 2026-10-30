package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.domain.Person;

public interface PersonService extends IService<Person> {

    Page<Person> findByPage(Page<Person> page, String name);
}
