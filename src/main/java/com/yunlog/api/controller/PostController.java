package com.yunlog.api.controller;

import com.yunlog.api.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class PostController {
    // SSR -> jsp, thymeleaf, mustache, freemarker
    // SPA ->
    // vue, nuxt
    // react, next

    // Http Method
    // GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT
    @PostMapping("/posts")
    public Map<String, String> post(@RequestBody @Valid PostCreate params, BindingResult bindingResult) {

        log.info("params={}", params.toString());

        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            FieldError firstFieldError = fieldErrors.get(0);
            String fieldName = firstFieldError.getField();  // title
            String errorMessage = firstFieldError.getDefaultMessage(); // ... 에러 메세지..

            Map<String, String> error = new HashMap<>();

            error.put(fieldName, errorMessage);

            return error;
        }

        return Map.of();
    }
}
