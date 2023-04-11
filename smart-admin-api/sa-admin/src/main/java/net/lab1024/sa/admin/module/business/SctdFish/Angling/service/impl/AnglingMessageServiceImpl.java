package net.lab1024.sa.admin.module.business.SctdFish.Angling.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import net.lab1024.sa.admin.module.business.SctdFish.Angling.dao.AnglingMessageMapper;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingInfo;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingMessage;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingMessageService;
import net.lab1024.sa.common.common.domain.PageResult;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<AnglingMessage> list = this.list();
        return new Result<>(200, "查询成功!", list);
    }

    @Override
    public Result queryById(Long Id) {
        AnglingMessage info = this.getById(Id);
        return new Result<>(200, "查询成功!", info);
    }

    @Override
    public Result queryByPage(QueryPageBean queryPageBean) {
        Integer pageSize = queryPageBean.getPageSize();
        Integer currentPage = queryPageBean.getCurrentPage();
        Page page = new Page(currentPage,pageSize);
        page = this.page(page, null);
        PageResult pageResult = new PageResult<AnglingMessage>(page.getCurrent(), page.getSize(), page.getTotal(), page.getPages(), page.getRecords(), page.getRecords().isEmpty());
        return new Result<PageResult>(200,"分页查询成功!",pageResult);
    }

    @Override
    public Result add(AnglingMessage message) {
        try {
            boolean b = this.save(message);
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
    public Result edit(AnglingMessage message){
        try{
            boolean b = this.updateById(message);
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
