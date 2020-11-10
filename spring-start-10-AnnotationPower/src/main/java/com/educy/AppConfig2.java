package com.educy;

import com.educy.Mapper.UserDao;
import com.educy.Mapper.UserDaoImpl;
import com.educy.Mapper.UserService;
import com.educy.Mapper.UserServiceImpl;
import com.educy.bean.ConnectionFactoryBean;
import com.educy.bean.Customer;
import com.educy.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

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
@ComponentScan(basePackages = "com.educy.bean")
@ImportResource("ApplicationContext.xml")
public class AppConfig2 {
    @Bean
    public Customer customer() {
        Customer customer = new Customer();
        customer.setId(11);
        customer.setName("马静娴");
        return  customer;
    }
}
