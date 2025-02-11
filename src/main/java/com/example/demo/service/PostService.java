package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Post;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<>();

    {
        posts.add(new Post("post 1", new Date()));
        posts.add(new Post("post 2", new Date()));
        posts.add(new Post("post 3", new Date()));
    }


    public Post[] listAllPosts() {
        return posts.toArray(new Post[posts.size()]);

    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
