package com.dynamic.data.source.business.k3.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dynamic.data.source.business.k3.entity.TCompany;
import com.dynamic.data.source.business.k3.mapper.TCompanyMapper;
import com.dynamic.data.source.business.k3.service.ITCompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司表 服务实现类
 * </p>
 *
 * @author mqz
 * @since 2020-09-08
 */
@Service
public class TCompanyServiceImpl extends ServiceImpl<TCompanyMapper, TCompany> implements ITCompanyService {

    @Override
    public Object getLimitList() {
        LambdaQueryWrapper<TCompany> la = new LambdaQueryWrapper<>();
        la.last("LIMIT 5");
        return list(la);
    }
}
