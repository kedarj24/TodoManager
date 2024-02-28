package com.lcwd.first.TodoApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @RequestMapping("/todos")
    public List<String> justtest(){
        return Arrays.asList("Learn Java","Learn Spring","Develop Projects"
                ,"Learn Junit","Learn Mockito");
    }
}

