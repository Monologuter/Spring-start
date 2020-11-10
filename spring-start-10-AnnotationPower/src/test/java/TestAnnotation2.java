import com.educy.AppConfig;
import com.educy.AppConfig1;
import com.educy.AppConfig2;
import com.educy.AppConfig3;
import com.educy.Mapper.UserService;
import com.educy.bean.Customer;
import com.educy.mybatis.MybatisAutoConfiguration;
import com.educy.mybatis.User;
import com.educy.mybatis.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

/**
 * @Author 马小姐
 * @Date 2020-11-09 14:37
 * @Version 1.0
 * @Description:
 */
public class TestAnnotation2 {
    /**
     * 测试内容:测试spring与Mybatis注解的整合
     */
    @Test
    public void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MybatisAutoConfiguration.class);
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        User user = new User();
        user.setId(1000);
        user.setName("我是你爸爸");
        userDao.save(user);

    }
}
