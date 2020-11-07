package com.educy.Mapper;

import org.springframework.stereotype.Repository;

/**
 * @Author 马小姐
 * @Date 2020-11-07 09:45
 * @Version 1.0
 * @Description:
 */

@Repository
public class UserMapperImpl implements UserMapper {
    @Override
    public void save() {
        System.out.println("UserMapperImpl.save");
    }
}
