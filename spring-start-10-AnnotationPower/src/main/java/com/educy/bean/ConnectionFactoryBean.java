package com.educy.bean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Author 马小姐
 * @Date 2020-11-09 15:26
 * @Version 1.0
 * @Description:
 */
public class ConnectionFactoryBean  implements FactoryBean<Connection> {
    @Override
    public Connection getObject() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/spring?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=CTT","root","123456");
        return conn;
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
