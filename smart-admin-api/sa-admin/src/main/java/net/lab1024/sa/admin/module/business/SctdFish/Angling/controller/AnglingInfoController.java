package net.lab1024.sa.admin.module.business.SctdFish.Angling.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lab1024.sa.admin.constant.AdminSwaggerTagConst;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AgriculturalPromotion;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingActivity;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingInfoService;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingInfo;
import net.lab1024.sa.common.common.domain.PageResult;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 钓场通知公告表 前端控制器
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@RestController
@RequestMapping("/wechat")
@Api(tags = AdminSwaggerTagConst.SctdFish.ANGLING_INFO)
public class AnglingInfoController {
    @Autowired
    AnglingInfoService Service;


    @GetMapping("/AnglingInfo")
    @ApiOperation("查询所有数据 @author 鑫")
    public Result<List<AnglingInfo>> queryList(){
        return Service.queryList();
    }

    @GetMapping("/AnglingInfo/{id}")
    @ApiOperation("根据id查询数据 @author 鑫")
    public Result<AnglingInfo> queryById(@PathVariable("id") Long id){
        return Service.queryById(id);
    }

    @PostMapping("/AnglingInfo")
    @ApiOperation("添加 @author 鑫")
    public Result<AnglingInfo> add(AnglingInfo info){
        return Service.add(info);
    }

    @PostMapping("/AnglingInfo/update")
    @ApiOperation("修改 @author 鑫")
    public Result edit(AnglingInfo info){
        return Service.edit(info);
    }

    @GetMapping("/AnglingInfo/delete/{id}")
    @ApiOperation("删除 @author 鑫")
    public Result DeleteById(@PathVariable("id") Long id) {
        return Service.delete(id);
    }

    @GetMapping("/AnglingInfo/findPage")
    @ApiOperation("分页查询 @author 鑫")
    public Result findPage(QueryPageBean pageParam){
        return Service.queryByPage(pageParam);
    }
}

