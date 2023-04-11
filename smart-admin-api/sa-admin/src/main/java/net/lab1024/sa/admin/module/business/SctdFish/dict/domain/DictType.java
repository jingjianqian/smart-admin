package net.lab1024.sa.admin.module.business.SctdFish.dict.domain;

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
 * 字典类型表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("DictType")
public class DictType implements Serializable {

    /**
     * 主键，自增长
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 字典名称
     */
    @TableField("name")
    private String name;

    /**
     * 描述
     */
    @TableField("remark")
    private String remark;

    /**
     * 创建时间(时间戳)
     */
    @TableField("createTime")
    private Long createTime;

    /**
     * 更新时间(时间戳)
     */
    @TableField("updateTime")
    private Long updateTime;

    /**
     * 删除状态：0-否，1-是
     */
    @TableField("isDelete")
    private Integer isDelete;


}
