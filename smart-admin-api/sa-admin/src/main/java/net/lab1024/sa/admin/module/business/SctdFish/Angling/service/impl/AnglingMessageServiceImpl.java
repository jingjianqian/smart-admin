package net.lab1024.sa.admin.module.business.SctdFish.Angling.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import net.lab1024.sa.admin.module.business.SctdFish.Angling.dao.AnglingMessageMapper;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingMessage;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingMessageService;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 钓场及时讯息表 服务实现类
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Service
public class AnglingMessageServiceImpl extends ServiceImpl<AnglingMessageMapper, AnglingMessage> implements AnglingMessageService {

    @Override
    public Result queryList() {
        return null;
    }

    @Override
    public Result queryById(Long Id) {
        return null;
    }

    @Override
    public Result queryByPage(QueryPageBean queryPageBean) {
        return null;
    }

    @Override
    public Result add(AnglingMessage message) {
        return null;
    }

    @Override
    public Result edit(AnglingMessage message) {
        return null;
    }

    @Override
    public Result delete(Long Id) {
        return null;
    }
}
