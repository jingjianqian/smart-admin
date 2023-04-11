package net.lab1024.sa.admin.module.business.SctdFish.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import net.lab1024.sa.admin.module.business.SctdFish.member.domain.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 钓场会员表 Mapper 接口
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {

}
