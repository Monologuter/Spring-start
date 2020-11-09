import com.educy.AppConfig;
import com.educy.bean.User;
import org.junit.Test;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;

/**
 * @Author 马小姐
 * @Date 2020-11-09 14:37
 * @Version 1.0
 * @Description:
 */
public class TestAnnotation {
    /**
     * 测试内容:测试配置bean
     */
    @Test
    public void test() {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.educy");
    }


    /**
     * 测试内容:测试@Bean注解
     */
    @Test
    public void test2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) ctx.getBean("user");
        System.out.println("user = " + user);
    }


    /**
     * 测试内容:测试复杂对象的创建
     */
    @Test
    public void test3() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Connection conn = (Connection) ctx.getBean("conn");
        System.out.println("conn = " + conn);
    }
}
