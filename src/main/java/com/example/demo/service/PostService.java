package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>(List.of(
            new Post(0L, "post1", new Date()),
            new Post(1L, "post2", new Date()),
            new Post(2L, "post3", new Date())
    ));
    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts() {
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

    public void create(final String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
