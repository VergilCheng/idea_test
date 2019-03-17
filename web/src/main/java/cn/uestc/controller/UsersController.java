package cn.uestc.controller;

import cn.uestc.pojo.Users;
import cn.uestc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users) {
        this.usersService.addUser(users);
        return "ok";
    }
}
