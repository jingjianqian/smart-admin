package net.lab1024.sa.admin.module.business.SctdFish.member.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.lab1024.sa.admin.module.business.SctdFish.member.domain.MemberOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 会员订单表(支付) Mapper 接口
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Mapper
public interface MemberOrderMapper extends BaseMapper<MemberOrder> {

}
