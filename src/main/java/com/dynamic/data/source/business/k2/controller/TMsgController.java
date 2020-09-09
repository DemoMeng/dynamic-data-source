package com.dynamic.data.source.business.k2.controller;


import com.dynamic.data.source.business.k2.service.ITMsgService;
import com.dynamic.data.source.core.annotation.TargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 短信发送内容 前端控制器
 * </p>
 *
 * @author mqz
 * @since 2020-09-09
 */
@RestController
@RequestMapping("/k2/t-msg")
public class TMsgController {

    @Autowired
    private ITMsgService msgService;

    @PostMapping("/list")
    @TargetSource(value = "k2")
    public Object list(){
        Object o = msgService.getLimitList();
        return o;
    }

}
