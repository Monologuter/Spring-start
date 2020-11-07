package com.educy.entity;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @Author 马小姐
 * @Date 2020-11-06 17:35
 * @Version 1.0
 * @Description:
 *
 */


//Component的衍生注解  @Repository @Service @Controller 只是作用的不同的地方  起到的作用是完全一样的 只是起到一个标识的作用
//但是在spring和Mybatis整合的时候不能使用@Repository 和 @Component

@Component("u")
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;

}
