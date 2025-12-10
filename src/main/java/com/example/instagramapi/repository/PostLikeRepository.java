package com.example.instagramapi.repository;

import com.example.instagramapi.entity.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostLikeRepository extends JpaRepository<PostLike, Long> {
    // 좋아요 조회
    Optional<PostLike> findByUserIdAndPostId(Long userId, Long postId);

    // 좋아요 여부
    boolean existsByUserIdAndPostId(Long userId, Long postId);
    
    // 좋아요 갯수
    long countByPostId(Long postId);
}
