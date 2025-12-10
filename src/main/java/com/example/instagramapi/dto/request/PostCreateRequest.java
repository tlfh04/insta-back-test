package com.example.instagramapi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostCreateRequest {
    @NotBlank(message = "내용은 필수입니다.")
    @Size(max = 2000,message = "내용은 2000자 까지.")
    private String content;

    private String imageUrl;
}
