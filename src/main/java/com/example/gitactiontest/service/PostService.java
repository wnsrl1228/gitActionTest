package com.example.gitactiontest.service;

import com.example.gitactiontest.domain.Post;
import com.example.gitactiontest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService (PostRepository a) {
        this.postRepository = a;
    }

    public Post create(int id, String title) {
        Post post = new Post(id, title);
        postRepository.save(post);
        return post;
    }
}
