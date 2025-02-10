package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsViewController {
    @ResponseBody
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list() {
        return "Здесь будет главная страница";
    }
}
