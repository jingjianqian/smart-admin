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
 * 钓场及时讯息表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("AnglingMessage")
public class AnglingMessage implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 及时讯息图片
     */
    @TableField("picPath")
    private String picPath;

    /**
     * 及时讯息内容
     */
    @TableField("content")
    private String content;


}
