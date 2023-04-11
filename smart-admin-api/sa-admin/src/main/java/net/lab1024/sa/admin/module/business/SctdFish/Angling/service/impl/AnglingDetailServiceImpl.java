package net.lab1024.sa.admin.module.business.SctdFish.Angling.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.dao.AnglingDetailMapper;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingDetail;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingDetailService;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 钓场表 服务实现类
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Service
public class AnglingDetailServiceImpl extends ServiceImpl<AnglingDetailMapper, AnglingDetail> implements AnglingDetailService {

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
    public Result add(AnglingDetail detail) {
        return null;
    }

    @Override
    public Result edit(AnglingDetail detail) {
        return null;
    }

    @Override
    public Result delete(Long Id) {
        return null;
    }
}
