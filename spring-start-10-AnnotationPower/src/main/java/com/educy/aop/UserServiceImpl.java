package com.educy.aop;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author 马小姐
 * @ClassName UserServiceImpl
 * @Date 2020-11-10 14:46
 * @Version 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void login() {
        System.out.println("UserServiceImpl.login");
    }

    @Override
    public void register() {
        System.out.println("UserServiceImpl.register");

    }
}
