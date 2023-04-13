package net.lab1024.sa.admin.module.business.SctdFish.Angling.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lab1024.sa.admin.constant.AdminSwaggerTagConst;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AgriculturalPromotion;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingActivity;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingMessage;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingDetailService;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingMessageService;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 钓场及时讯息表 前端控制器
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@RestController
@RequestMapping("/wechat")
@Api(tags = AdminSwaggerTagConst.SctdFish.ANGLING_MESSAGE)
public class AnglingMessageController {

    @Autowired
    AnglingMessageService Service;

    @GetMapping("/AnglingMessage")
    @ApiOperation("查询所有数据 @author 鑫")
    public Result<List<AnglingMessage>> getList(){
        return Service.queryList();
    }

    @GetMapping("/AnglingMessage/{id}")
    @ApiOperation("根据id查询数据 @author 鑫")
    public Result<AnglingMessage> getById(@PathVariable("id") Long id){
        return Service.queryById(id);
    }

    @PostMapping("/AnglingMessage")
    @ApiOperation("添加 @author 鑫")
    public Result<AnglingMessage> add(AnglingMessage activity){
        return Service.add(activity);
    }

    @PostMapping("/AnglingMessage/update")
    @ApiOperation("修改 @author 鑫")
    public Result edit(AnglingMessage activity){
        return Service.edit(activity);
    }

    @GetMapping("/AnglingMessage/delete/{id}")
    @ApiOperation("删除 @author 鑫")
    public Result DeleteById(@PathVariable("id") Long id) {
        return Service.delete(id);
    }

    @GetMapping("/AnglingMessage/findPage")
    @ApiOperation("分页查询 @author 鑫")
    public Result findPage(QueryPageBean pageParam){
        return Service.queryByPage(pageParam);
    }
}

