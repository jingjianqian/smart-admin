package net.lab1024.sa.admin.module.business.SctdFish.user.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("UserRole")
public class UserRole implements Serializable {


    /**
     * 角色id
     */
    @TableId("roleId")
    private Integer roleId;

    /**
     * 用户id
     */
    @TableField("userId")
    private Integer userId;

}
