package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String landing() {
        return  "This is the landing page!";
    }

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }


//    @GetMapping("/fruit")
//    public String fruit(Model model) {
//        List<String> fruitBasket = new ArrayList<>();
//        fruitBasket.add("apple");
//        fruitBasket.add("pineapple");
//        fruitBasket.add("mango");
//        fruitBasket.add("pear");
//        model.addAttribute("fruitBasket", fruitBasket);
//        return "fruit";
//    }
}
