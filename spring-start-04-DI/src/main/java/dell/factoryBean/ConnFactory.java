package dell.factoryBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author 马小姐
 * @Date 2020-10-26 10:46
 * @Version 1.0
 * @Description:
 */
public class ConnFactory {
    public Connection getConnection()  {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/easy_mybatis?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=CTT","root","123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
