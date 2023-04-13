package net.lab1024.sa.admin.module.business.SctdFish.Angling.controller;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.lab1024.sa.admin.constant.AdminSwaggerTagConst;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AgriculturalPromotion;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AgriculturalPromotionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
 * 助农推广表 前端控制器
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@RestController
@RequestMapping("/wechat")
@Api(tags = AdminSwaggerTagConst.SctdFish.PROMOTION)
public class AgriculturalPromotionController {
    @Autowired
    private AgriculturalPromotionService Service;


    @GetMapping("/agriculturalPromotion")
    @ApiOperation("查询所有数据 @author 鑫")
    public Result<List<AgriculturalPromotion>> queryList(){
        return Service.queryList();
    }

    @GetMapping("/agriculturalPromotion/{id}")
    @ApiOperation("根据id查询数据 @author 鑫")
    public Result<AgriculturalPromotion> queryById(@PathVariable("id") Long id){
        return Service.queryById(id);
    }

    @PostMapping("/agriculturalPromotion")
    @ApiOperation("添加 @author 鑫")
    public Result<AgriculturalPromotion> add(AgriculturalPromotion promotion){
        return Service.add(promotion);
    }

    @PostMapping("/agriculturalPromotion/update")
    @ApiOperation("修改 @author 鑫")
    public Result edit(AgriculturalPromotion promotion){
        return Service.edit(promotion);
    }

    @GetMapping("/agriculturalPromotion/delete/{id}")
    @ApiOperation("删除 @author 鑫")
    public Result DeleteById(@PathVariable("id") Long id){
        return Service.delete(id);
    }

    @GetMapping("/agriculturalPromotion/findPage")
    @ApiOperation("分页查询 @author 鑫")
    public Result findPage(QueryPageBean pageParam){
        return Service.queryByPage(pageParam);
    }

    @PostMapping("/agriculturalPromotion/uploadImg")
    @ApiOperation("上传图片 @author 鑫")
    public Result uploadFile(MultipartFile file) {
        return Service.upload_PromotionImg(file);

    }
    @PostMapping("/agriculturalPromotion/loadImg")
    @ApiOperation("加载图片 @author 鑫")
    public Result download(String Path, HttpServletResponse response){
        return Service.Download_Images(Path,response);
    }



}

