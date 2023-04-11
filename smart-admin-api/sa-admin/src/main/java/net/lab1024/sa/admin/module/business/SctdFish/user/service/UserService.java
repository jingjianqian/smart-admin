package net.lab1024.sa.admin.module.business.SctdFish.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import net.lab1024.sa.admin.module.business.SctdFish.user.domain.User;

/**
 * @author: Sunq
 * @file: UserService.java
 * @create: 2023/2/3 8:43
 * @desc：用户逻辑
 */
public interface UserService extends IService<User> {

    /**
     * 根据用户名和密码获取用户
     * @param username
     * @param password
     * @return
     */
    User getUserByNameAndPwd(String username, String password);

    /**
     * 新增
     * @param user
     * @return
     */
    boolean insert(User user);
}
