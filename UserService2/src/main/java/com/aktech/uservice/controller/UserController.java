package com.aktech.uservice.controller;


import com.aktech.uservice.Vo.ResTemplate;
import com.aktech.uservice.entity.User;
import com.aktech.uservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User AddUser(@RequestBody User user){
        log.info("inside  AddUser ");
        return userService.adduser(user );
    }

    @GetMapping("/{id}")
    public ResTemplate getUserWithDepartment(@PathVariable Long id) {
        log.info("inside  getUserWithDepartment ");
        return  userService.getUserWithDepartment(id);
    }

}
