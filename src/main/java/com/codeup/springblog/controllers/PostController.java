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
    public String viewIndexPage(Model view) {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Post 1", "Body 1"));
        posts.add(new Post("Post 2", "Body 2"));
        posts.add(new Post("Post 3", "Body 3"));
        view.addAttribute("Posts", posts);
        return "/posts/index";
    }

    // View a particular post by id
    @GetMapping("/posts/{id}")
    public String getSinglePost(@PathVariable int id, Model view) {
        Post post = new Post("Post Title", "Post Body");
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
