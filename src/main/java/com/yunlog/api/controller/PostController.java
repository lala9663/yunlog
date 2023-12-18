package com.yunlog.api.controller;

import com.yunlog.api.request.PostCreate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    // SSR -> jsp, thymeleaf, mustache, freemarker
    // SPA ->
    // vue, nuxt
    // react, next

    // Http Method
    // GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT

    // 글 등록
    // POST

    @PostMapping ("/posts")
    public String post(@RequestBody PostCreate params) {
        return "Hello World";
    }
}
