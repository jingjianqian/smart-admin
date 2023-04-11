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
 * 助农推广表
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("AgriculturalPromotion")
public class AgriculturalPromotion implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 宣传图片路径
     */
    @TableField("picPath")
    private String picPath;


}
