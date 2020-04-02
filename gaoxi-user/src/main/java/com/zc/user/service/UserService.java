package com.zc.user.service;

import com.zc.common.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity>  getUserList(String... id);
}
