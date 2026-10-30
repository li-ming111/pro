package com.hxx.utils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

//result
@Data
public class R {
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    private R() {
    }

    public static R ok() {
        R r = new R();
        r.setCode(200);
        r.setMessage("成功");
        return r;
    }

    public static R error() {
        R r = new R();
        r.setCode(201);
        r.setMessage("失败");
        return r;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    public R data(String key, Object value) {
        this.getData().put(key, value);
        return this;
    }

    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}









































