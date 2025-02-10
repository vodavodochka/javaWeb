package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Post;

import java.util.Iterator;

@Service
public class PostService {
    public Post[] listAllPosts() {
        Post post1 = new Post("Post №1");
        Post post2 = new Post("Post №2");
        Post post3 = new Post("Post №3");

        return new Post[] {post1, post2, post3};
    }
}
