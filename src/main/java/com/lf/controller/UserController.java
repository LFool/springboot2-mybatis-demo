package com.lf.controller;

import com.lf.model.User;
import com.lf.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

/*
    User selectUserById(int id);
    List<User> selectAllUser();
    int addUser(User user);
    int updateUser(User user);
    public int deleteUser(int id);
*/

    @ResponseBody
    @PostMapping("/selectUserById")
    public User selectUserById(int id){
        return userService.selectUserById(id);
    }

    @ResponseBody
    @PostMapping("/selectAllUser")
    public List<User> selectAllUser(){
        return userService.selectAllUser();
    }


    @ResponseBody
    @PostMapping("/addUser")
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @PostMapping("/updateUser")
    public int updateUser(User user){
        return userService.updateUser(user);
    }

    @ResponseBody
    @PostMapping("/deleteUser")
    public int deleteUser(int id){
        return userService.deleteUser(id);
    }



}
