package net.lab1024.sa.admin.module.business.SctdFish.Angling.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lab1024.sa.admin.constant.AdminSwaggerTagConst;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AgriculturalPromotion;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingActivity;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AgriculturalPromotionService;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingActivityService;
import net.lab1024.sa.common.common.domain.PageResult;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 钓场活动表 前端控制器
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@RestController
@RequestMapping("/wechat")
@Api(tags = AdminSwaggerTagConst.SctdFish.ANGLING_ACTIVITY)
public class AnglingActivityController {
    @Autowired
    private AnglingActivityService Service;

        @GetMapping("/AnglingActivity")
        @ApiOperation("查询所有数据 @author 鑫")
        @PreAuthorize("@saAuth.checkPermission('AnglingActivity:queryList')")
        public Result<List<AnglingActivity>> queryList(){
            return Service.queryList();
        }

        @GetMapping("/AnglingActivity/{id}")
        @ApiOperation("根据id查询数据 @author 鑫")
        @PreAuthorize("@saAuth.checkPermission('AnglingActivity:queryById')")
        public Result<AnglingActivity> queryById(@PathVariable("id") Long id){
            return Service.queryById(id);
        }

        @PostMapping("/AnglingActivity")
        @ApiOperation("添加 @author 鑫")
        @PreAuthorize("@saAuth.checkPermission('AnglingActivity:add')")
        public Result<AgriculturalPromotion> add(AnglingActivity activity){
            return Service.add(activity);
        }

        @PutMapping("/AnglingActivity")
        @ApiOperation("修改 @author 鑫")
        @PreAuthorize("@saAuth.checkPermission('AnglingActivity:edit')")
        public Result edit(AnglingActivity activity){
            return Service.edit(activity);
        }

        @DeleteMapping("/AnglingActivity/{id}")
        @ApiOperation("删除 @author 鑫")
        @PreAuthorize("@saAuth.checkPermission('AnglingActivity:delete')")
        public Result DeleteById(@PathVariable("id") Long id) {
            return Service.delete(id);
        }

        @GetMapping("/AnglingActivity/findPage")
        @ApiOperation("分页查询 @author 鑫")
        @PreAuthorize("@saAuth.checkPermission('AnglingActivity:findPage')")
        public Result findPage(QueryPageBean pageParam){
            return Service.queryByPage(pageParam);
        }
}

