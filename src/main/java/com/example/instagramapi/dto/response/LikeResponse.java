package com.example.instagramapi.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LikeResponse {
    private boolean liked;
    private Long likeCount;

    public static LikeResponse of(boolean liked, Long likeCount){
        return LikeResponse.builder()
                .liked(liked)
                .likeCount(likeCount)
                .build();
    }

}
