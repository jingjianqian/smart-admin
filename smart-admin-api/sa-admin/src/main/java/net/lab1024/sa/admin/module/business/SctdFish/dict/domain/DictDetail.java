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
 * 字典详情表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("DictDetail")
public class DictDetail implements Serializable {

    /**
     * 主键，自增长
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 字典id
     */
    @TableField("dictId")
    private Long dictId;

    /**
     * 父级id
     */
    @TableField("pid")
    private Long pid;

    /**
     * 字典标签
     */
    @TableField("label")
    private String label;

    /**
     * 字典值
     */
    @TableField("value")
    private String value;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 创建时间(时间戳)
     */
    @TableField("createTime")
    private Long createTime;

    /**
     * 修改时间(时间戳)
     */
    @TableField("updateTime")
    private Long updateTime;

    /**
     * 删除状态：0-否，1-是
     */
    @TableField("isDelete")
    private Integer isDelete;


}
