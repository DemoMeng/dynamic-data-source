package com.dynamic.data.source.business.k2.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dynamic.data.source.business.k2.entity.TMsg;
import com.dynamic.data.source.business.k2.mapper.TMsgMapper;
import com.dynamic.data.source.business.k2.service.ITMsgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 短信发送内容 服务实现类
 * </p>
 *
 * @author mqz
 * @since 2020-09-09
 */
@Service
public class TMsgServiceImpl extends ServiceImpl<TMsgMapper, TMsg> implements ITMsgService {

    @Override
    public Object getLimitList() {
        LambdaQueryWrapper<TMsg> la = new LambdaQueryWrapper<>();
        la.last("LIMIT 5");
        return list(la);
    }
}
