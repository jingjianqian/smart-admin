package net.lab1024.sa.admin.module.system.api.service;

import lombok.extern.slf4j.Slf4j;
import net.lab1024.sa.common.module.support.token.LoginDeviceEnum;
import net.lab1024.sa.common.module.support.token.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ApiService {

    @Autowired
    private TokenService tokenService;

    public String getToken(){

        return "1";
    }
}
