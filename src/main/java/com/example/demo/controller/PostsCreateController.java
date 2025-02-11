package com.example.demo.controller;


import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsCreateController {
    @Autowired
    PostService postsService = new PostService();

    @RequestMapping(path="/new", method = RequestMethod.GET)
    public String create() {
        return "create";
    }


    @RequestMapping(path="/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        postsService.create(text);
        return "redirect:/";
    }
}
