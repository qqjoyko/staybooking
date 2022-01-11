package com.laioffer.staybooking.model;

public class Token {// 不存在数据库里面 目的只是为了返回给前端一个json格式的token
    private final String token;

    public Token(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
