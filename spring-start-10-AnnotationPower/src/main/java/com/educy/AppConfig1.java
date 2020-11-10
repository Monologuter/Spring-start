package com.educy;

import com.educy.Mapper.UserDao;
import com.educy.Mapper.UserDaoImpl;
import com.educy.Mapper.UserService;
import com.educy.Mapper.UserServiceImpl;
import com.educy.bean.ConnectionFactoryBean;
import com.educy.bean.Customer;
import com.educy.bean.User;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


/**
 * @Author 马小姐
 * @Date 2020-11-09 14:33
 * @Version 1.0
 * @Description: Configuration其实就是@Component的衍生注解
 */

@Configuration
//@ComponentScan(basePackages = "com.educy.scan" , excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION , value = Service.class)})
@ComponentScan(basePackages = "com.educy.scan", useDefaultFilters = false , includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION , value = {Service.class})})
public class AppConfig1 {

    /**
     * 测试内容:测试ComponentScan注解
     */
    @Test
    public void test6() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("AppConfig1.class");
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("beanName = " + beanName);
        }
    }

}
