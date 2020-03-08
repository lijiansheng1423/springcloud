package com.itheima.controller;

import com.itheima.entity.User;
import com.itheima.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user/{pid}")
    public String getUser(@PathVariable("pid") Integer id) {
        log.info("开始查询{}用户信息", id);
        try {
            User user = userService.getUser(id);
            if(user ==null){
                return " not found user where id ="+ id;
            }
            return user.toString();
        }catch (EntityNotFoundException ex){
            return " not found user where id ="+ id;
        }

    }

    @DeleteMapping("/user/{pid}")
    public int deleteUser(@PathVariable("pid") Integer id) {
        log.info("开始删除{}用户信息", id);
        int result = userService.deleteUser(id);
        return result;
    }


    @PostMapping("/user/save")
    public String saveUser(@RequestBody User user) {
        log.info("开始新增用户{}用户信息", user);
        User user1 = userService.insertUser(user);
        return user1.toString();
    }
}
