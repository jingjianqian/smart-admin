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
 * 用户表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("User")
public class User implements Serializable {

    /**
     * 主键，自增长
     */
    @TableId("id")
    private Long id;

    /**
     * 用户名
     */
    @TableField("userName")
    private String userName;

    /**
     * 密码
     */
    @TableField("passwd")
    private String passwd;

    /**
     * 头像
     */
    @TableField("avatarId")
    private Long avatarId;

    /**
     * 昵称
     */
    @TableField("nickName")
    private String nickName;

    /**
     * 性别:1-男，0-女
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 身份证
     */
    @TableField("idCard")
    private String idCard;

    /**
     * 手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 账号状态：1启用、0禁用
     */
    @TableField("enable")
    private Integer enable;

    /**
     * 创建日期(时间戳)
     */
    @TableField("createTime")
    private Long createTime;

    /**
     * 修改日期(时间戳)
     */
    @TableField("updateTime")
    private Long updateTime;

    /**
     * 所属角色
     */
    @TableField("roleId")
    private Long roleId;

    /**
     * 微信id
     */
    @TableField("wxId")
    private String wxId;

    /**
     * 删除状态：0-否，1-是
     */
    @TableField("isDelete")
    private Integer isDelete;


}
