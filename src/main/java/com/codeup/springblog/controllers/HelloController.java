package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class HelloController {
    // The first step in building our application will be to define a controller and define what routes the controller responds to. Luckily, Spring gives us a very easy way to do this. The following code defines a controller that responds to requests for /hello:
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }

    //    Spring allows us to use path variables, that is, variables that are part of the URI of a request, as opposed to being passed as a query string, or as part of the request body. Here is an example of a method that uses a path variable:
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // If the path variable we are looking for is not a string, we can simply define the parameter with a different type.
//    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String addOne(@PathVariable int number) {
//        return number + " plus one is " + (number + 1) + "!";
//    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return "number" + number + " plus one is " + (number + 1) + "!";
    }

}
