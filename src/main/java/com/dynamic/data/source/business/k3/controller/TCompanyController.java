package com.dynamic.data.source.business.k3.controller;


import com.dynamic.data.source.business.k3.service.ITCompanyService;
import com.dynamic.data.source.core.CommonConstant;
import com.dynamic.data.source.core.annotation.TargetSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 珍岛分所有的公司及分公司表 前端控制器
 * </p>
 *
 * @author mqz
 * @since 2020-09-08
 */
@RestController
@RequestMapping("/k3/t-company")
@Slf4j
public class TCompanyController {

    @Autowired
    private ITCompanyService itCompanyService;

    @PostMapping("/list")
    @TargetSource(value = CommonConstant.k3)
    public Object list(){
        return itCompanyService.getLimitList();
    }


}
