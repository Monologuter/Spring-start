package com.educy.Mapper;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author 马小姐
 * @Date 2020-11-08 10:15
 * @Version 1.0
 * @Description:
 */

@Component
@Data
public class Category {
    @Value("${id}")
    private  Integer id;
    @Value("${name}")
    private  String name;
    private  String password;
}
