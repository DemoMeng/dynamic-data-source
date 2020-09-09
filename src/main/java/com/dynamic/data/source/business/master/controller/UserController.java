package com.dynamic.data.source.business.master.controller;


import com.dynamic.data.source.business.master.service.IUserService;
import com.dynamic.data.source.core.annotation.TargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author mqz
 * @since 2020-09-08
 */
@RestController
@RequestMapping("/master/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/list")
    @TargetSource()
    public Object list(){
        return userService.getLimitList();
    }



}
