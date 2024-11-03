package com.sparta.springmvc.request;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Star {

    String name;
    int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
