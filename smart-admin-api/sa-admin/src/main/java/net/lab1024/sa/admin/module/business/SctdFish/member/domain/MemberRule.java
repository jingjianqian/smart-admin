package net.lab1024.sa.admin.module.business.SctdFish.member.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("MemberRule")
public class MemberRule implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 会员福利
     */
    @TableField("benefit")
    private String benefit;

    /**
     * 会员制度内容
     */
    @TableField("content")
    private String content;

    /**
     * 会员年费，单位：元/年
     */
    @TableField("annualFee")
    private Double annualFee;

    /**
     * 能否加入会员: 0-否  1-是
     */
    @TableField("isCanJoin")
    private Integer isCanJoin;

    /**
     * 加入会员的开始时间
     */
    @TableField("joinStartTime")
    private Long joinStartTime;

    /**
     * 加入会员的结束时间
     */
    @TableField("joinEndTime")
    private Long joinEndTime;

    /**
     * 允许加入的期限，单位：月
     */
    @TableField("joinDuration")
    private Integer joinDuration;


}
