package com.jk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/19.
 */
@RestController
@RequestMapping("/UserController")
public class UserController {
    @RequestMapping("/UserList")
    public String UserList(){
        return "Hello word";
    }
}
