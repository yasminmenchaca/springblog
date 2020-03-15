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

    // View all posts
    @GetMapping("/posts")
    @ResponseBody
    public String viewIndexPage(Model view) {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Test", "test"));
        posts.add(new Post("Test 2", "test 2"));
        posts.add(new Post("Test 3", "Test 3"));
        view.addAttribute("Posts", posts);
        return "/posts/index";
    }

    // View a particular post by id
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getSinglePost(@PathVariable int id, Model view) {
        Post post = new Post("ID Test", "Test");
        view.addAttribute("Post", post);
        return "/posts/show";
    }

    //  // View the "Create Post" form
    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm() {
        return "view the form for creating a post";
    }

    // Submit the "Create Post" form
    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }

}
