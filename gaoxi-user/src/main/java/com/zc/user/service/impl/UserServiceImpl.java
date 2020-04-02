package com.zc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zc.common.entity.UserEntity;
import com.zc.user.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserEntity> getUserList(String... id) {
        UserEntity entity = new UserEntity();
        entity.setUserName("张山");
        entity.setPassWord("123456");
        UserEntity entity1 = new UserEntity();
        entity1.setUserName("里斯");
        entity1.setPassWord("123456");
        List<UserEntity> userEntitys = new ArrayList<>();
        userEntitys.add(entity1);
        userEntitys.add(entity);
        return userEntitys;
    }
}
