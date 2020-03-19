package com.codeup.springblog.controllers;

import com.codeup.springblog.Repositories.PostRepository;
import com.codeup.springblog.Repositories.UserRepository;
import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    private PostRepository postsDao;
    private UserRepository usersDao;

    public PostController(PostRepository postsDao, UserRepository usersDao) {
        this.postsDao = postsDao;
        this.usersDao = usersDao;
    }

    @GetMapping("/posts")
    public String getPosts(Model model) {
        model.addAttribute("posts", postsDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable long id, Model model) {
        Post post = postsDao.getOne(id);
        User user = usersDao.getOne(id);
        model.addAttribute("title", post.getTitle());
        model.addAttribute("body", post.getBody());
        model.addAttribute("email", user.getEmail());
        return "posts/show";
    }

    @GetMapping("/posts/create")
//    @ResponseBody
    public String getCreatePostForm() {
//        User user = usersDao.getOne(1L); // just use the first user in the db
//        Post post = new Post();
//        post.setTitle("Quarantine Blues");
//        post.setBody("I've been at home since Saturday.");
//        post.setUser(user);
//        usersDao.save(user);
//        postsDao.save(post);
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@RequestParam String title, @RequestParam String body) {
        Post newPost = new Post();
        newPost.setTitle(title);
        newPost.setBody(body);
        usersDao.getOne(1L);
        newPost.setUser(usersDao.getOne(1L));
        postsDao.save(newPost);
        return "redirect:/posts";
    }

    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable long id) {
        // delete post
        postsDao.deleteById(id);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editForm(@PathVariable long id, Model model) {
        Post postToEdit = postsDao.getOne(id);
        model.addAttribute("post", postToEdit);
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, @RequestParam String title, @RequestParam String body) {
        Post editedPost = postsDao.getOne(id);
        editedPost.setTitle(title);
        editedPost.setBody(body);
        postsDao.save(editedPost);
        return "redirect:/posts";
    }

}