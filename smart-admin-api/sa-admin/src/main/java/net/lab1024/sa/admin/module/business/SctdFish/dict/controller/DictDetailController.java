package net.lab1024.sa.admin.module.business.SctdFish.dict.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lab1024.sa.admin.constant.AdminSwaggerTagConst;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AgriculturalPromotion;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AgriculturalPromotionService;
import net.lab1024.sa.admin.module.business.SctdFish.dict.domain.DictDetail;
import net.lab1024.sa.admin.module.business.SctdFish.dict.service.DictDetailService;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 字典详情表 前端控制器
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@RestController
@RequestMapping("/wechat")
@Api(tags = AdminSwaggerTagConst.SctdFish.DICT_DETAIL)
public class DictDetailController {
    @Autowired
    private DictDetailService Service;


    @GetMapping("/DictDetail")
    @ApiOperation("查询所有数据 @author 鑫")
    @PreAuthorize("@saAuth.checkPermission('agriculturalPromotion:queryList')")
    public Result<List<DictDetail>> queryList(){
        return Service.queryList();
    }

    @GetMapping("/DictDetail/{id}")
    @ApiOperation("根据id查询数据 @author 鑫")
    @PreAuthorize("@saAuth.checkPermission('DictDetail:queryById')")
    public Result<DictDetail> queryById(@PathVariable("id") Long id){
        return Service.queryById(id);
    }

    @PostMapping("/DictDetail")
    @ApiOperation("添加 @author 鑫")
    @PreAuthorize("@saAuth.checkPermission('DictDetail:add')")
    public Result<DictDetail> add(DictDetail detail){
        return Service.add(detail);
    }

    @PostMapping("/DictDetail/update")
    @ApiOperation("修改 @author 鑫")
    @PreAuthorize("@saAuth.checkPermission('DictDetail:edit')")
    public Result edit(DictDetail detail){
        return Service.edit(detail);
    }

    @GetMapping("/DictDetail/delete/{id}")
    @ApiOperation("删除 @author 鑫")
    @PreAuthorize("@saAuth.checkPermission('DictDetail:delete')")
    public Result DeleteById(@PathVariable("id") Long id){
        return Service.delete(id);
    }

    @GetMapping("、DictDetail/findPage")
    @ApiOperation("分页查询 @author 鑫")
    @PreAuthorize("@saAuth.checkPermission('DictDetail:queryByPage')")
    public Result findPage(QueryPageBean pageParam){
        return Service.queryByPage(pageParam);
    }


}

