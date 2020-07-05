package edu.hrbeu.blog.controller.admin;

import edu.hrbeu.blog.entity.User;
import edu.hrbeu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String loginVerify(){
        List<User> users = userService.listUser();
        return users.toString();

    }


}
