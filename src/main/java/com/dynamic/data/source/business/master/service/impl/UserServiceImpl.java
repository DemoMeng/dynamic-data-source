package com.dynamic.data.source.business.master.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dynamic.data.source.business.master.entity.User;
import com.dynamic.data.source.business.master.mapper.UserMapper;
import com.dynamic.data.source.business.master.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author mqz
 * @since 2020-09-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public Object getLimitList() {
        LambdaQueryWrapper<User> la = new LambdaQueryWrapper<>();
        la.last("LIMIT 5");
        return list(la);
    }
}
