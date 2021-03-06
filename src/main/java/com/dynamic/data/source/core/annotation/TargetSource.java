package com.dynamic.data.source.core.annotation;

import com.dynamic.data.source.core.CommonConstant;

import java.lang.annotation.*;

/**
 * @author mqz
 * @description 切面指向数据源位置
 * @since 2020/4/27
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetSource {

    /**默认master数据源-参考application配置详情*/
    String value() default CommonConstant.master;

}
