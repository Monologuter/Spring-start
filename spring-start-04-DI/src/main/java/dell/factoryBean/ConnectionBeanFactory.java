package dell.factoryBean;

import com.mysql.jdbc.Driver;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Author 马小姐
 * @Date 2020-10-25 14:49
 * @Version 1.0
 * @Description:
 */
public class ConnectionBeanFactory implements FactoryBean<Connection> {
    @Override
    public Connection getObject() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/easy_mybatis?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=CTT", "root", "123456");

        return connection;
    }

    @Override
    public Class<?> getObjectType() {
        return ConnectionBeanFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
