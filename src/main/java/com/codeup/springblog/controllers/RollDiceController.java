package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.messageresolver.IMessageResolver;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll-dice";
    }

    @PostMapping("/roll-dice")
    public String checkDice(@RequestParam int num, Model model) {
        int random = (int) (Math.random() * 6 + 1);
        model.addAttribute("num", num);
        model.addAttribute("random", random);
//        model.addAttribute("message", message);
        return "roll-dice";
    }


}