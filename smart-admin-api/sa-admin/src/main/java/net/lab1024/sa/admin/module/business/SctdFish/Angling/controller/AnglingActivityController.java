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
import net.lab1024.sa.common.common.domain.ResponseDTO;
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
        public ResponseDTO<List<AnglingActivity>> queryList(){
            return Service.queryList();
        }

        @GetMapping("/AnglingActivity/{id}")
        @ApiOperation("根据id查询数据 @author 鑫")
        public ResponseDTO<AnglingActivity> queryById(@PathVariable("id") Long id){
            return Service.queryById(id);
        }

        @PostMapping("/AnglingActivity")
        @ApiOperation("添加 @author 鑫")
        public ResponseDTO<String> add(AnglingActivity activity){
            return Service.add(activity);
        }

        @PostMapping("/AnglingActivity/update")
        @ApiOperation("修改 @author 鑫")
        public ResponseDTO<String> edit(AnglingActivity activity){
            return Service.edit(activity);
        }

        @GetMapping("/AnglingActivity/delete/{id}")
        @ApiOperation("删除 @author 鑫")
        public ResponseDTO<String> DeleteById(@PathVariable("id") Long id) {
            return Service.delete(id);
        }

        @PostMapping("/AnglingActivity/findPage")
        @ApiOperation("分页查询 @author 鑫")
        public ResponseDTO<PageResult<AnglingActivity>> findPage(QueryPageBean pageParam){
            return Service.queryByPage(pageParam);
        }
}

