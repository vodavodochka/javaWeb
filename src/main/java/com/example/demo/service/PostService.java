package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Post;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();
    Long id = 0L;

    {
        posts.add(new Post(id++,"post" + id, new Date()));
        posts.add(new Post(id++, "post" + id, new Date()));
        posts.add(new Post(id++,"post" + id, new Date()));
    }


    public List<Post> listAllPosts() {
        return posts;

    }

    public void create(String text) {
        posts.add(new Post(id++, text, new Date()));
    }
}
