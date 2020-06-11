package com.example.hellospringboot.controller;

import com.example.hellospringboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author ls
 * @Date 2020/06/11 16:04:56
 * @Description
 * @Version 1.0
 **/
@Controller
public class MainController {
    @RequestMapping(value = {"","index"},method = RequestMethod.GET)
    public String index(Model model){
        User user=new User();
        user.setUsername("Romantic");
        model.addAttribute("user",user);
        return "index";
    }
}
