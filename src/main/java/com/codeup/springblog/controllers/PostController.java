package com.codeup.springblog.controllers;


import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    // model all posts
    @GetMapping("/posts")
    public String viewIndexPage(Model model) {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1, "Post 1", "Body 1"));
        posts.add(new Post(2, "Post 2", "Body 2"));
        posts.add(new Post(3, "Post 3", "Body 3"));
        model.addAttribute("Posts", posts);
        return "/posts/index";
    }

    // model a particular post by id
    @GetMapping("/posts/{id}")
    public String getSinglePost(@PathVariable int id, Model model) {
        Post post = new Post(id,"Post Title", "Post Body");
        model.addAttribute("title", post.getTitle());
        model.addAttribute("body", post.getBody());
        return "/posts/show";
    }

    // model the "Create Post" form
    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm() {
        return "model the form for creating a post";
    }

    // Submit the "Create Post" form
    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }

}
