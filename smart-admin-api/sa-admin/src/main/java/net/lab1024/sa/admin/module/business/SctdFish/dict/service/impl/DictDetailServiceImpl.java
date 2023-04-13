package net.lab1024.sa.admin.module.business.SctdFish.dict.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingInfo;
import net.lab1024.sa.admin.module.business.SctdFish.dict.dao.DictDetailMapper;
import net.lab1024.sa.admin.module.business.SctdFish.dict.domain.DictDetail;
import net.lab1024.sa.admin.module.business.SctdFish.dict.service.DictDetailService;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典详情表 服务实现类
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Service
public class DictDetailServiceImpl extends ServiceImpl<DictDetailMapper, DictDetail> implements DictDetailService {


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
    public Result add(DictDetail detail) {
        return null;
    }

    @Override
    public Result edit(DictDetail detail) {
        return null;
    }

    @Override
    public Result delete(Long Id) {
        return null;
    }
}
