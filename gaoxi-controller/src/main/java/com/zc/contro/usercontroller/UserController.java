package com.zc.contro.usercontroller;

import com.zc.common.user.UserService;
import com.zc.common.util.LoginReq;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Reference
    UserService userService;

    @GetMapping("userList")
    public Object getUserList(LoginReq loginReq){
        return  userService.login(loginReq);
    }
}
