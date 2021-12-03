package com.myAthleticBody.controller;

import com.myAthleticBody.dao.Dao;
import com.myAthleticBody.dao.impl.UserDaoImpl;
import com.myAthleticBody.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/*Controller describe REST API with Users, CRUD operation for access from another service*/
@RestController
@RequestMapping("/users")
public class UsersController {
    private final Dao dao;

    @Autowired
    public UsersController(Dao dao) {
        this.dao = dao;
    }

    @GetMapping()
    @ResponseBody
    @Autowired
    public List getUsers(UserDaoImpl dao) {
        List<User> list = dao.getAll();
        return list;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Object getById(@PathVariable("id") long id, UserDaoImpl dao) {
        //if (id != 0)
        return dao.get(id);
    }

    @PostMapping()

    public RedirectView createUser(@ModelAttribute("user") User user) {
        dao.save(user);
        return new RedirectView("users");
    }


}
