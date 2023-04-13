package net.lab1024.sa.admin.module.business.SctdFish.Angling.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.dao.AnglingDetailMapper;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingActivity;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingDetail;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingDetailService;
import net.lab1024.sa.common.common.domain.PageResult;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private AnglingDetailMapper mapper;

    @Override
    public Result queryList() {
        List<AnglingDetail> list = this.list();
        return new Result<>(200, "查询成功!", list);
    }

    @Override
    public Result queryById(Long Id) {
        AnglingDetail detail = this.getById(Id);
        return new Result<>(200, "查询成功!", detail);
    }

    @Override
    public Result queryByPage(QueryPageBean queryPageBean) {
        Integer pageSize = queryPageBean.getPageSize();
        Integer currentPage = queryPageBean.getCurrentPage();
        String[] queryTerms = queryPageBean.getQueryTerms();
        String city = ""; //城市搜索条件
        String anglingName = ""; //按照名称进行模糊查询

        IPage page = new Page(currentPage,pageSize);
        QueryWrapper<AnglingDetail> queryWrapper = new QueryWrapper();

        if (queryTerms.length>=1) {
            city = queryTerms[0];
        }else{
            anglingName = queryTerms[1];
        }
        if (!city.equals("")&&city!=null){
            queryWrapper.like("location", city);
        }

        if (!anglingName.equals("")&&anglingName!=null){
            queryWrapper.like("anglingName", anglingName);
        }

        page = mapper.selectPage(page, queryWrapper);
        PageResult pageResult = new PageResult<AnglingDetail>(page.getCurrent(), page.getSize(), page.getTotal(), page.getPages(), page.getRecords(), null);
        return new Result<PageResult>(200,"分页查询成功!",pageResult);
    }

    @Override
    public Result add(AnglingDetail detail) {
        try {
            boolean b = this.save(detail);
            if (b){
                return new Result<>(200,"添加成功!",null);
            }else{
                return new Result<>(403,"添加失败!",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(403,"添加时出现异常!",null);
        }


    }

    @Override
    public Result edit(AnglingDetail detail) {
        try{
            boolean b = this.updateById(detail);
            if (b){
                return new Result<>(200,"修改成功!",null);
            }else{
                return new Result<>(403,"修改失败!",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(403,"修改时出现异常!",null);
        }

    }


    @Override
    public Result delete(Long Id) {
        try{
            boolean b = this.removeById(Id);
            if (b){
                return new Result<>(200,"修改成功!",null);
            }else{
                return new Result<>(403,"修改失败!",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(403,"修改时出现异常!",null);
        }
    }
}
