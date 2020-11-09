package com.educy.Mapper;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @Author 马小姐
 * @Date 2020-11-07 09:47
 * @Version 1.0
 * @Description:
 */
@Service
@Data
public class UserServiceImpl implements UserService {
    private UserDao userMapper;


    @Override
    public void register() {
        userMapper.save();
    }
}
