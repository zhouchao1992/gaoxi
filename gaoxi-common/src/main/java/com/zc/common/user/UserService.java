package com.zc.common.user;

import com.zc.common.entity.UserEntity;
import com.zc.common.util.LoginReq;

public interface  UserService {
    public UserEntity login(LoginReq loginReq);
}
