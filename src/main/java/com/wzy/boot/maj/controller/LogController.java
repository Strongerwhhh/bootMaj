package com.wzy.boot.maj.controller;


import com.wzy.boot.maj.domain.User;
import com.wzy.boot.maj.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/log")
public class LogController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String login_account, String login_password, Model model, HttpSession session){
        User user = userRepository.findByIdAndPwd(login_account, login_password);
        if(user==null){
            model.addAttribute("error_msg","登录失败！账号或密码错误");
            return "welcome";
        }
        session.setAttribute("user",user);
        return "home";
    }

    @RequestMapping(value = "logup",method = RequestMethod.POST)
    public String logup(String logup_account,String logup_password,HttpSession session){
        User user=new User();
        user.setId(logup_account);
        user.setPwd(logup_password);
        user.setImg("img");
        userRepository.save(user);
        return "home";
    }

    @RequestMapping(value = "checkAccount",method = RequestMethod.POST)
    @ResponseBody
    public boolean checkAccount(String logup_account){
        Optional<User> byId = userRepository.findById(logup_account);
        return byId.isPresent();
    }
}
