package com.codeup.springblog.controllers;

import com.codeup.springblog.Repositories.PostRepository;
import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IModel;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    private final PostRepository postsDao;

    public PostController(PostRepository postsDao){
        this.postsDao = postsDao;
    }

//    @GetMapping("/posts")
//    public String getPosts(Model model){
//        ArrayList<Post> postList = new ArrayList<>();
//        postList.add(new Post(2, "Second Post", "askdfhkashdfkjahsdf"));
//        postList.add(new Post(3, "Third Post", "some more text..."));
//
//        model.addAttribute("posts", postList);
//        return "posts/index";
//    }

    @GetMapping("/posts")
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postsDao.findAll());
        return "posts/index";
    }


//    @GetMapping("/posts/{id}")
//    public String getPostById(@PathVariable int id, Model model){
//        Post postExample = new Post(id, "Europa's First Post", "Remote Learning Today!");
//        model.addAttribute("title", postExample.getTitle());
//        model.addAttribute("body", postExample.getBody());
//        return "posts/show";
//    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm(){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }

    @RequestMapping(path="/posts", method=RequestMethod.DELETE)
    @ResponseBody
    public String deletePost(){
        return "DELETE!!";
    }
}