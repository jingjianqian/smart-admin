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
 * 团钓成员表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("TeamFishMember")
public class TeamFishMember implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 团钓用户
     */
    @TableField("userId")
    private Long userId;


}
