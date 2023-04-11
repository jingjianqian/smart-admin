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
 * 钓场会员表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("Member")
public class Member implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户标识
     */
    @TableField("userId")
    private Long userId;

    /**
     * 是否在线: 0-否 1-是
     */
    @TableField("state")
    private Integer state;

    /**
     * 是否是会员:0-否  1-是
     */
    @TableField("isMember")
    private Integer isMember;

    /**
     * 是否禁钓：0-否 1-是
     */
    @TableField("isForbid")
    private Integer isForbid;

    /**
     * 禁钓起始时间
     */
    @TableField("forbidStartTime")
    private Long forbidStartTime;

    /**
     * 禁钓结束时间
     */
    @TableField("forbidEndTime")
    private Long forbidEndTime;

    /**
     * 禁钓时长，单位：h
     */
    @TableField("forbidDuration")
    private Integer forbidDuration;


}
