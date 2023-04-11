package net.lab1024.sa.admin.module.business.SctdFish.Angling.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingMessage;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 钓场及时讯息表 Mapper 接口
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Mapper
public interface AnglingMessageMapper extends BaseMapper<AnglingMessage> {

}
