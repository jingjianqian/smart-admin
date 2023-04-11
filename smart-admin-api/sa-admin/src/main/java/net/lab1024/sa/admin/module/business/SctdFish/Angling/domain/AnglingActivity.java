package net.lab1024.sa.admin.module.business.SctdFish.Angling.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 钓场活动表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("AnglingActivity")
public class AnglingActivity implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 活动标题
     */
    @TableField("title")
    private String title;

    /**
     * 活动内容
     */
    @TableField("content")
    private String content;

    /**
     * 活动状态:0-过期  1-进行
     */
    @TableField("state")
    private Integer state;

    /**
     * 活动创建时间
     */
    @TableField("createTime")
    private Long createTime;

    /**
     * 活动更新时间
     */
    @TableField("updateTime")
    private Long updateTime;

    /**
     * 是否删除：0-否  1-是
     */
    @TableField("isDelete")
    private Integer isDelete;


}
