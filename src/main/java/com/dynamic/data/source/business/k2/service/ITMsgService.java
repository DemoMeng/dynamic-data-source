package com.dynamic.data.source.business.k2.service;

import com.dynamic.data.source.business.k2.entity.TMsg;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 短信发送内容 服务类
 * </p>
 *
 * @author mqz
 * @since 2020-09-09
 */
public interface ITMsgService extends IService<TMsg> {

    Object getLimitList();
}
