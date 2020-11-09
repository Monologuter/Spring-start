package com.educy;

import com.educy.Mapper.UserDao;
import com.educy.Mapper.UserDaoImpl;
import com.educy.Mapper.UserService;
import com.educy.Mapper.UserServiceImpl;
import com.educy.bean.ConnectionFactoryBean;
import com.educy.bean.Customer;
import com.educy.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.security.PrivateKey;
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
@PropertySource("classpath:/init.properties")
@ComponentScan(basePackages = "com.educy.scan")
public class AppConfig {
    @Value("${id}")
    private  Integer id;
    @Value("${name}")
    private  String name;


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



    @Bean
    public Connection conn1()  {
        Connection connection = null;
        try {
            ConnectionFactoryBean connectionFactoryBean = new ConnectionFactoryBean();
            connection = connectionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  connection;
    }


    @Bean
    public UserDao userDao(){
        return new UserDaoImpl();
    }


    @Bean
    public UserService userService(UserDao userDao){
        UserServiceImpl userService  = new UserServiceImpl();
        userService.setUserMapper(userDao);
        return userService;
    }



    @Bean
    public Customer customer() {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        return  customer;
    }


}
