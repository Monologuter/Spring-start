package com.educy.Mapper;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author 马小姐
 * @Date 2020-11-07 09:47
 * @Version 1.0
 * @Description:
 */
@Service
public class UserServiceMapperImpl implements UserServiceMapper {
    @Autowired
    private  UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public UserServiceMapperImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

//
//    @Autowired
//    @Qualifier("userMapperImpl")
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    @Autowired
    public void register() {
        userMapper.save();
        System.out.println("UserServiceMapperImpl.register");
    }
}
