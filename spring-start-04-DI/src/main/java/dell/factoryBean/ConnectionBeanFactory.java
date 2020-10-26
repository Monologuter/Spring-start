package dell.factoryBean;

import com.mysql.jdbc.Driver;
import lombok.Data;
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

@Data
public class ConnectionBeanFactory implements FactoryBean<Connection> {
    private String driverClassName;
    private String url;
    private String name;
    private String password;
    @Override
    public Connection getObject() throws Exception {
        Class.forName(driverClassName);
//        jdbc:mysql://localhost:3307/easy_mybatis?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=CTT
        Connection connection = DriverManager.getConnection(url, name, password);

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
//    public boolean isSingleton() {
//        return true;
//    }

//    如果此时返回的是true的话 只会创建一个对象  如果是false每次使用的时候都会创建一个对象出来

}
