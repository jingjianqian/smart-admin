package net.lab1024.sa.admin.module.business.SctdFish.Angling.domain;

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
 * 钓场表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("AnglingDetail")
public class AnglingDetail implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 钓场名字
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
     * 钓场距离，单位:KM
     */
    @TableField("distance")
    private Double distance;

    /**
     * 鱼的种类
     */
    @TableField("fishName")
    private String fishName;

    /**
     * 钓场图片
     */
    @TableField("picPath")
    private String picPath;

    /**
     * 钓场联系电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 钓场介绍
     */
    @TableField("remark")
    private String remark;


}
