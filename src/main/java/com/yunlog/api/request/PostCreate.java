package com.yunlog.api.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostCreate {
    @NotBlank(message = "제목은 필수 입력")
    private String title;
    @NotBlank(message = "내용도 필수 입력")
    private String content;
}
