package net.lab1024.sa.admin.module.business.SctdFish.Angling.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import net.lab1024.sa.admin.module.business.SctdFish.Angling.dao.AnglingInfoMapper;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingInfo;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingInfoService;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 钓场通知公告表 服务实现类
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Service
public class AnglingInfoServiceImpl extends ServiceImpl<AnglingInfoMapper, AnglingInfo> implements AnglingInfoService {

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
    public Result add(AnglingInfo info) {
        return null;
    }

    @Override
    public Result edit(AnglingInfo info) {
        return null;
    }

    @Override
    public Result delete(Long Id) {
        return null;
    }
}
