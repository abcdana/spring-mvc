package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello Dana's World!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "Get Method";
    }

    @PostMapping("/hello")
    @ResponseBody
    public String post(){
        return "Post Method";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "Put Method";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "Delete Method";
    }

}
