package com.myAthleticBody.controller;

import com.myAthleticBody.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*In this controller we return pages*/
@Controller
public class IndexController {
    @GetMapping()
    public String indexPage() {
        return "index";
    }

    @GetMapping("admin/users/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "users/new";
    }

}
