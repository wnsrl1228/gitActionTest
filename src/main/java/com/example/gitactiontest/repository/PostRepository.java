package com.example.gitactiontest.repository;

import com.example.gitactiontest.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PostRepository {
    public static ArrayList<Post> posts = new ArrayList<>();

    public void save(Post post) {
        posts.add(post);
    }
    public int size() {
        return posts.size();
    }
}
