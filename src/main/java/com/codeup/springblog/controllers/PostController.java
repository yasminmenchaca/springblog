package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "Hello from /posts!";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsId() {
        return "Hello from /posts/{id}!";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreateGet() {
        return "Hello from postsCreateGet!";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postsCreatePost() {
        return "Hello from postsCreatePost!";
    }

}
