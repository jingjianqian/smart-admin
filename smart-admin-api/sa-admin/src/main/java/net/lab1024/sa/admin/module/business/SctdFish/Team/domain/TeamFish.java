package net.lab1024.sa.admin.module.business.SctdFish.Team.domain;

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
 * 团钓表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("TeamFish")
public class TeamFish implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 钓场名称
     */
    @TableField("anglingName")
    private String anglingName;

    /**
     * 钓场地址
     */
    @TableField("address")
    private String address;

    /**
     * 位置
     */
    @TableField("location")
    private String location;

    /**
     * 钓场位置，单位：km
     */
    @TableField("distance")
    private Double distance;

    /**
     * 团钓开始时间
     */
    @TableField("startTime")
    private Long startTime;

    /**
     * 团钓结束时间
     */
    @TableField("endTime")
    private Long endTime;

    /**
     * 鱼的种类
     */
    @TableField("fishName")
    private String fishName;

    /**
     * 团钓活动详情
     */
    @TableField("activityDetail")
    private String activityDetail;

    /**
     * 团钓费用，单位：元
     */
    @TableField("cost")
    private Double cost;

    /**
     * 团钓是否完成支付：0-否 1-是
     */
    @TableField("isFinishPay")
    private Integer isFinishPay;


}
