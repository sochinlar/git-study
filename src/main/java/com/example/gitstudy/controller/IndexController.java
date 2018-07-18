package com.example.gitstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    @ResponseBody
    public Object index(){
<<<<<<< HEAD
        System.out.println("test delete branch");
=======
>>>>>>> d7e04242d9b4f8ac7852cd0f4d9eae650ba3491b
        return "welcome to git-study";
    }
}
