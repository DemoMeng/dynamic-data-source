package com.dynamic.data.source.business.k3.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 珍岛分所有的公司及分公司表
 * </p>
 *
 * @author mqz
 * @since 2020-09-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TCompany extends Model<TCompany> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 各公司名称
     */
    private String companyName;

    /**
     * 统一信用代码
     */
    private String creditCode;

    /**
     * 公司负责人手机号码
     */
    private String managerPhone;

    /**
     * 公司状态0.正常营业1.停止营业
     */
    private Integer companyStatus;

    /**
     * 公司编号
     */
    private String companyCode;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
