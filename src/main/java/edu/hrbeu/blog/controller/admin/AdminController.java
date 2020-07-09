package edu.hrbeu.blog.controller.admin;

import edu.hrbeu.blog.entity.User;
import edu.hrbeu.blog.mapper.UserMapper;
import edu.hrbeu.blog.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/loginVerify.do")//,method = RequestMethod.POST)

    @ResponseBody
    public String loginVerify(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<>();
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.getUserByName(userName);
        System.out.println(user);
        if (user == null){
            map.put("code",0);
            map.put("msg","用户名无效！");
        } else if(!user.getUserPass().equals(password)){
            map.put("code",0);
            map.put("msg","密码错误！");
        }else {
            map.put("code",1);
            map.put("msg","");
            request.getSession().setAttribute("user",user);
            user.setUserLastLoginTime(new Date());
            //userService.updateUser(user);
        }
        String result =new JSONObject(map).toString();
        return result;



    }

    @RequestMapping("")
    public String index(){
        return "success";
    }


}
