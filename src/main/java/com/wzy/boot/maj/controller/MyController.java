package com.wzy.boot.maj.controller;

import com.wzy.boot.maj.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String welcome(){return "welcome";}

    @RequestMapping("/home")
    public String home(){return "home";}

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello","hello sping boot");
        return "index";
    }

    @RequestMapping("/index")
    public String index(){return "index";}

    @RequestMapping("/index1")
    public String index1(){return "index1";}
}
