package com.example.demo.controller;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Post;

@Controller
public class PostsViewController {
    @Autowired
    PostService postsService = new PostService();
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        Post[] posts = postsService.listAllPosts();

        model.addAttribute("posts", posts);
        return "list";
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Здесь будет страница поста №" + id;
    }
}
