package com.example.gitactiontest.service;

import com.example.gitactiontest.repository.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostServiceTest {

    @Autowired
    public PostService postService;
    @Autowired
    public PostRepository postRepository;

    @BeforeEach
    void beforeEach() {
        PostRepository.posts = new ArrayList<>();
    }

    @Test
    @DisplayName("게시글 생성 성공")
    void create() {
        int before = postRepository.size();
        postService.create(1, "제목");
        assertThat(postRepository.size()).isEqualTo(before+2);
    }
    // 테스트 중

}