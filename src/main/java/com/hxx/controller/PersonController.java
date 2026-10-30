package com.hxx.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hxx.domain.Person;
import com.hxx.service.PersonService;
import com.hxx.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Tag(name = "人员管理")
@RestController
public class PersonController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private PersonService personService;

    @Operation(summary = "分页显示", description = "分页显示")
    @GetMapping("/show")
    public R show(Page page, String name) {
        personService.findByPage(page, name);
        return R.ok().data("list", page.getRecords())
                .data("total", page.getTotal());
    }

    //保存
    @Operation(summary = "保存", description = "保存")
    @PostMapping("/save")
    public R save(@RequestBody Person person) {
        personService.save(person);
        return R.ok();
    }

    @Operation(summary = "更新", description = "更新")
    @PutMapping("/update")
    public R update(@RequestBody Person person) {
        personService.updateById(person);
        return R.ok();
    }

    @Parameter(name = "id", description = "删除", in = ParameterIn.PATH,
            required = true)
    @Operation(summary = "删除", description = "删除")
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable("id") long id) {
        personService.removeById(id);
        return R.ok();
    }
}



































