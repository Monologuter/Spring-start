package com.educy;

import com.educy.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author 马小姐
 * @Date 2020-11-09 14:33
 * @Version 1.0
 * @Description: Configuration其实就是@Component的衍生注解
 */


@Configuration
public class AppConfig {


    /*
    * 创建简单的对象*/
    @Bean
    public User user() {
        return new User();
    }


//    创建复杂的对象
    @Bean
    public Connection conn(){
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/spring?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=CTT","root","123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return conn;
    }

}
