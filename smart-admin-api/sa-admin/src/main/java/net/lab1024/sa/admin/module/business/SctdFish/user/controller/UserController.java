package net.lab1024.sa.admin.module.business.SctdFish.user.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.lab1024.sa.admin.module.business.SctdFish.user.domain.User;
import net.lab1024.sa.admin.module.business.SctdFish.user.service.UserService;
import net.lab1024.sa.common.common.domain.PageParam;
import net.lab1024.sa.common.common.domain.PageResult;
import net.lab1024.sa.common.common.domain.Result;
import net.lab1024.sa.common.common.enumeration.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Sunq
 * @file: UserController.java
 * @create: 2023/2/3 8:44
 * @desc：用户管理
 */
@RestController("UserController")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService Service;

    @GetMapping
    public Result<List<User>> getList(){
        List<User> list = Service.list();
        return new Result<List<User>>(ResultEnum.SUCCESS.getCode(),"查询全部成功",list);
    }

    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable("id") String id){
        User atg = Service.getById(id);
        return new Result<User>(ResultEnum.SUCCESS.getCode(),"查询成功",atg);
    }

    @PostMapping
    public Result UpdateById(User atg){
        boolean b = Service.updateById(atg);
        return new Result(ResultEnum.SUCCESS.getCode(),"修改成功",null);
    }

    @DeleteMapping("/{id}")
    public Result DeleteById(@PathVariable("id") String id){
        boolean b = Service.removeById(id);
        return new Result(ResultEnum.SUCCESS.getCode(),"删除成功",null);
    }

    @GetMapping("/findPage")
    public Result findPage(PageParam pageBean){
        Page<User> Page = new Page(pageBean.getPageNum(),pageBean.getPageSize());
        Page page = Service.page(Page, null);
        return new Result(ResultEnum.SUCCESS.getCode(),"分页查询成功!",new PageResult());
    }

    @PostMapping("/login")
    public Result login(){

        return new Result(ResultEnum.SUCCESS.getCode(),"登录成功!",null);
    }

}
