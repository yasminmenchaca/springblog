package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

//    @GetMapping("/home")
//    public String welcome() {
//        return "home";
//    }

//    @GetMapping("/hello/{name}")
//    public String sayHello(@PathVariable String name, Model model) {
//        model.addAttribute("name", name);
//        return "hello";
//    }

    @GetMapping("/fruit")
    public String fruit(Model model) {
        List<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("apple");
        fruitBasket.add("pineapple");
        fruitBasket.add("mango");
        fruitBasket.add("pear");
        model.addAttribute("fruitBasket", fruitBasket);
        return "fruit";
    }
}
