package net.lab1024.sa.admin.module.business.SctdFish.Angling.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.dao.AgriculturalPromotionMapper;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AgriculturalPromotion;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingInfo;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AgriculturalPromotionService;
import net.lab1024.sa.common.common.domain.PageResult;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import net.lab1024.sa.common.common.enumeration.ResultEnum;
import net.lab1024.sa.common.common.validator.enumeration.EnumValidator;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 助农推广表 服务实现类
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
@Service
public class AgriculturalPromotionServiceImpl extends ServiceImpl<AgriculturalPromotionMapper, AgriculturalPromotion> implements AgriculturalPromotionService {

    //图片存放路径
    private String staticURL= System.getProperty("user.dir")+"/static/Promotion_img";

    @Override
    public Result queryList() {
        List<AgriculturalPromotion> list = this.list();
        return new Result<>(ResultEnum.SUCCESS.getCode(), "查询成功!", list);
    }

    @Override
    public Result queryById(Long Id) {
        AgriculturalPromotion agriculturalPromotion = this.getById(Id);
        return new Result<>(ResultEnum.SUCCESS.getCode(), "查询成功!", agriculturalPromotion);
    }

    @Override
    public Result queryByPage(QueryPageBean queryPageBean) {
        Integer pageSize = queryPageBean.getPageSize();
        Integer currentPage = queryPageBean.getCurrentPage();
        Page page = new Page(currentPage,pageSize);
        page = this.page(page, null);
        PageResult pageResult = new PageResult<AgriculturalPromotion>(page.getCurrent(), page.getSize(), page.getTotal(), page.getPages(), page.getRecords(), page.getRecords().isEmpty());
        return new Result<PageResult>(ResultEnum.SUCCESS.getCode(),"分页查询成功!",pageResult);
    }

    @Override
    public Result add(AgriculturalPromotion agriculturalPromotion) {
        try {
            boolean b = this.save(agriculturalPromotion);
            if (b){
                return new Result<>(ResultEnum.SUCCESS.getCode(),"添加成功!",null);
            }else{
                return new Result<>(ResultEnum.ERROR.getCode(),"添加失败!",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(ResultEnum.ERROR.getCode(),"添加时出现异常!",null);
        }


    }

    @Override
    public Result edit(AgriculturalPromotion agriculturalPromotion) {
        try{
        boolean b = this.updateById(agriculturalPromotion);
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

    /**
     * 上传图片
     */
    @Override
    public Result upload_PromotionImg(MultipartFile file) {
        Result result=null;

        try {
            //获取文件名
            String fileName = file.getOriginalFilename();
            //获取文件后缀名。也可以在这里添加判断语句，规定特定格式的图片才能上传，否则拒绝保存。
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            //为了避免发生图片替换，这里使用了文件名重新生成
            fileName = UUID.randomUUID()+suffixName;
            String path = staticURL+"/Promotion/";
            //修正路径中的中文
            path = URLDecoder.decode(path, "UTF-8");
            File file1 = new File(path + fileName);
            if (!file1.getParentFile().exists()){
                file1.getParentFile().mkdirs();
            }
            file.transferTo(file1);
            //保存图片到数据库
            boolean b = save(new AgriculturalPromotion().setPicPath("/Promotion/"+fileName));

            if (b){
                result = new Result(200, "图片上传成功!", "/Promotion/"+fileName);
            }


        }catch (Exception e){
            e.printStackTrace();
            result = new Result(400, "图片上传失败!",null);
        }
        return result;
    }

    @Override
    public Result Download_Images(String Path, HttpServletResponse response) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(staticURL + Path));
            response.setContentType("image/jpeg");
            ServletOutputStream outputStream = response.getOutputStream();
            int len = 0;
            byte[] bytes = new byte[inputStream.available()];
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
                outputStream.flush();
            }
            outputStream.close();
            inputStream.close();
            return new Result(200, "图片获取成功!",null);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(400, "获取图片失败!请联系系统管理员",null);

        }
    }
}
