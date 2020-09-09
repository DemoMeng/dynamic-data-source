package com.dynamic.data.source.business.master.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author mqz
 * @since 2020-09-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "userId", type = IdType.AUTO)
    private Long userId;

    @TableField("companyId")
    private Long companyId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户状态 1:待注册账号 2:已注册但未认证  3:个人认证 4: 企业认证 5:专业版 ;
     */
    private Integer status;

    @TableField("agentFlag")
    private Integer agentFlag;

    private Integer identity;

    /**
     * 根据该用户所生成的token
     */
    private String token;

    /**
     * 最后登录的时间
     */
    @TableField("lastLoginTime")
    private LocalDateTime lastLoginTime;

    /**
     * 用户创建时间
     */
    @TableField("createdAt")
    private LocalDateTime createdAt;

    /**
     * 用户修改时间
     */
    @TableField("updatedAt")
    private LocalDateTime updatedAt;

    /**
     * 微信账号
     */
    @TableField("WeChat")
    private String WeChat;

    @TableField("headPortrait")
    private String headPortrait;

    /**
     * 微信使用
     */
    @TableField("openId")
    private String openId;

    /**
     * 个人升级为企业标志值
     */
    private Integer ptoc;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
