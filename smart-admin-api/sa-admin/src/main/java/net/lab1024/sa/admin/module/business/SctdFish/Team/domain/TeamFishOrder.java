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
 * 团钓订单表(支付)
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("TeamFishOrder")
public class TeamFishOrder implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 团钓支付人
     */
    @TableField("userId")
    private Long userId;

    /**
     * 支付金额，单位：元
     */
    @TableField("payMoney")
    private Double payMoney;

    /**
     * 支付状态：0-失败  1-成功
     */
    @TableField("state")
    private Integer state;


}
