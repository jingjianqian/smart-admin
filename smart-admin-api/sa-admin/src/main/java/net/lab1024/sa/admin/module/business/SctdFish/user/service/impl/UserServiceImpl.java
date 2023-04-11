package net.lab1024.sa.admin.module.business.SctdFish.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.lab1024.sa.admin.module.business.SctdFish.user.dao.UserMapper;
import net.lab1024.sa.admin.module.business.SctdFish.user.domain.User;
import net.lab1024.sa.admin.module.business.SctdFish.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Sunq
 * @file: UserServiceImpl.java
 * @create: 2023/2/4 8:12
 * @desc：用户业务
 */
@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserByNameAndPwd(String username, String password) {
        return null;
    }

    @Override
    public boolean insert(User user) {
        return false;
    }
}
