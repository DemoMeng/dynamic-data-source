package com.dynamic.data.source.business.k3.service;

import com.dynamic.data.source.business.k3.entity.TCompany;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 珍岛分所有的公司及分公司表 服务类
 * </p>
 *
 * @author mqz
 * @since 2020-09-08
 */
public interface ITCompanyService extends IService<TCompany> {

    Object getLimitList();
}
