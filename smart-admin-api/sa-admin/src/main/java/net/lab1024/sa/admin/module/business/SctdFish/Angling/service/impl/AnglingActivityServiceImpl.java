package net.lab1024.sa.admin.module.business.SctdFish.Angling.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import net.lab1024.sa.admin.module.business.SctdFish.Angling.dao.AnglingActivityMapper;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AgriculturalPromotion;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingActivity;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingActivityService;
import net.lab1024.sa.admin.module.business.goods.domain.vo.GoodsVO;
import net.lab1024.sa.common.common.code.ErrorCode;
import net.lab1024.sa.common.common.code.ErrorCodeRegister;
import net.lab1024.sa.common.common.code.SystemErrorCode;
import net.lab1024.sa.common.common.code.UserErrorCode;
import net.lab1024.sa.common.common.domain.PageResult;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.ResponseDTO;
import net.lab1024.sa.common.common.domain.Result;
import net.lab1024.sa.common.common.util.SmartPageUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 钓场活动表 服务实现类
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Service
public class AnglingActivityServiceImpl extends ServiceImpl<AnglingActivityMapper, AnglingActivity> implements AnglingActivityService {

    @Override
    public ResponseDTO<List<AnglingActivity>>  queryList() {
        List<AnglingActivity> list = this.list();
        return  ResponseDTO.ok(list);

    }

    @Override
    public ResponseDTO<AnglingActivity> queryById(Long Id) {
        AnglingActivity activity = this.getById(Id);
        return ResponseDTO.ok(activity);
    }

    @Override
    public ResponseDTO<PageResult<AnglingActivity>> queryByPage(QueryPageBean queryPageBean) {
        Integer pageSize = queryPageBean.getPageSize();
        Integer currentPage = queryPageBean.getCurrentPage();
        Page page = new Page(currentPage,pageSize);

        //执行分页查询
        page = this.page(page, null);

        //获取分页查询后的数据
        List<AnglingActivity> list = page.getRecords();
        PageResult<AnglingActivity> pageResult = SmartPageUtil.convert2PageResult(page, list);

        if (pageResult.getEmptyFlag()) {
            return ResponseDTO.ok(pageResult);
        }
        return ResponseDTO.ok(pageResult);
    }

    @Override
    public ResponseDTO<String> add(AnglingActivity activity) {
        try {
            boolean b = this.save(activity);
            if (b){
                return  ResponseDTO.okMsg("添加成功!");
            }else{
                return  ResponseDTO.error(UserErrorCode.PARAM_ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDTO.error(SystemErrorCode.SYSTEM_ERROR);
        }


    }

    @Override
    public ResponseDTO<String> edit(AnglingActivity activity) {
        try{
            boolean b = this.updateById(activity);
            if (b){
                return  ResponseDTO.okMsg("编辑成功!");
            }else{
                return  ResponseDTO.error(UserErrorCode.PARAM_ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDTO.error(SystemErrorCode.SYSTEM_ERROR);
        }

    }


    @Override
    public ResponseDTO<String> delete(Long Id) {
        try{
            boolean b = this.removeById(Id);
            if (b){
                return  ResponseDTO.okMsg("删除成功!");
            }else{
                return  ResponseDTO.error(UserErrorCode.PARAM_ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDTO.error(SystemErrorCode.SYSTEM_ERROR);
        }
    }
}
