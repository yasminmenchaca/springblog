package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// This controller should listen for requests for several routes that correspond to basic arithmetic operations and produce the result of the arithmetic.

@Controller
public class MathController {
    @RequestMapping(path = "/add/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int add(@PathVariable int num1, @PathVariable int num2) {
        return (num1 + num2);
    }

    @RequestMapping(path = "/subtract/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int subtract(@PathVariable int num1, @PathVariable int num2) {
        return (num1 - num2);
    }

    @RequestMapping(path = "/multiply/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int multiply(@PathVariable int num1, @PathVariable int num2) {
        return (num1 * num2);
    }

    @RequestMapping(path = "/divide/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int divide(@PathVariable int num1, @PathVariable int num2) {
        return (num1 / num2);
    }
}
