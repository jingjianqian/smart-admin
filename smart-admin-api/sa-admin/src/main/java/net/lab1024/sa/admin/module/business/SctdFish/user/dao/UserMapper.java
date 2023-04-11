package net.lab1024.sa.admin.module.business.SctdFish.user.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.lab1024.sa.admin.module.business.SctdFish.user.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
