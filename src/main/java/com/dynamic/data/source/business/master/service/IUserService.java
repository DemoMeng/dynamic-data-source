package com.dynamic.data.source.business.master.service;

import com.dynamic.data.source.business.master.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author mqz
 * @since 2020-09-08
 */
public interface IUserService extends IService<User> {

    Object getLimitList();
}
