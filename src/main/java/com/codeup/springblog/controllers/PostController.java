package com.codeup.springblog.controllers;

import com.codeup.springblog.Repositories.PostRepository;
import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository postsDao;

    public PostController(PostRepository postsDao) {
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

    @GetMapping("/posts/{id}")
    public String getPostById(@PathVariable long id, Model model) {
        Post postSing = postsDao.getOne(id);
        model.addAttribute("title", postSing.getTitle());
        model.addAttribute("body", postSing.getBody());
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }

    @GetMapping("/posts/edit/{id}")
//    @ResponseBody
    public String editPostForm(@PathVariable long id, @PathVariable String title) {
        Post post = postsDao.getOne(id);
        post.setTitle(title);
        postsDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("posts/delete/{id}")
//    @ResponseBody
    public String deletePost(@PathVariable long id) {
        Post post = postsDao.getOne(id);
        postsDao.delete(post);
        return "redirect:/posts";
    }

}