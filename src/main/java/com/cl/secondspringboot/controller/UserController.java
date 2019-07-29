package com.cl.secondspringboot.controller;

import com.cl.secondspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser/{id}")
    public String selectUser (@PathVariable int id, Model model){
        model.addAttribute("name", userService.selectUser(id).toString());
        return "greets";
    }

}
