package net.lab1024.sa.admin.module.business.SctdFish.Angling.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lab1024.sa.admin.constant.AdminSwaggerTagConst;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AgriculturalPromotion;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingActivity;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingDetail;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingDetailService;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 钓场表 前端控制器
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@RestController
@RequestMapping("/wechat")
@Api(tags = AdminSwaggerTagConst.SctdFish.ANGLING_DETAIL)
public class AnglingDetailController {
    @Autowired
    AnglingDetailService Service;


    @GetMapping("/AnglingDetail")
    @ApiOperation("查询所有数据 @author 鑫")
    public Result<List<AnglingDetail>> queryList(){
        return Service.queryList();
    }

    @GetMapping("/AnglingDetail/{id}")
    @ApiOperation("根据id查询数据 @author 鑫")
    public Result<AnglingDetail> queryById(@PathVariable("id") Long id){
        return Service.queryById(id);
    }

    @PostMapping("/AnglingDetail")
    @ApiOperation("添加 @author 鑫")
    public Result<AnglingDetail> add(AnglingDetail detail){
        return Service.add(detail);
    }

    @PostMapping("/AnglingDetail/update")
    @ApiOperation("修改 @author 鑫")
    public Result edit(AnglingDetail detail){
        return Service.edit(detail);
    }

    @GetMapping("/AnglingDetail/delete/{id}")
    @ApiOperation("删除 @author 鑫")
    public Result DeleteById(@PathVariable("id") Long id) {
        return Service.delete(id);
    }

    @GetMapping("/AnglingDetail/findPage")
    @ApiOperation("分页查询 @author 鑫")
    public Result findPage(QueryPageBean pageParam){
        return Service.queryByPage(pageParam);
    }
}

