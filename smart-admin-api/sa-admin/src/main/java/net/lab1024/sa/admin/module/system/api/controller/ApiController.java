package net.lab1024.sa.admin.module.system.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lab1024.sa.admin.constant.AdminSwaggerTagConst;
import net.lab1024.sa.admin.module.system.api.service.ApiService;
import net.lab1024.sa.admin.module.system.login.domain.LoginForm;
import net.lab1024.sa.common.common.annoation.NoNeedLogin;
import net.lab1024.sa.common.module.support.operatelog.annoation.OperateLog;
import net.lab1024.sa.common.module.support.token.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Api(tags = {AdminSwaggerTagConst.System.SYSTEM_LOGIN})
@RequestMapping("/wechat")
public class ApiController {


    //private ApiService apiService;
    @NoNeedLogin
    @PostMapping("/getToken")
    @ApiOperation("登录 @author 卓大")
    public String login() {

        return "1";
    }



}
