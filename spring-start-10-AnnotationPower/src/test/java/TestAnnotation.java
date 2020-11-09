import com.educy.AppConfig;
import com.educy.Mapper.UserService;
import com.educy.bean.Customer;
import com.educy.bean.User;
import org.junit.Test;
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
//        Connection conn = (Connection) ctx.getBean("conn");
//        System.out.println("conn = " + conn);
        Connection conn1 = (Connection) ctx.getBean("conn1");
        System.out.println("conn1 = " + conn1);

    }

    /**
     * 测试内容:测试@Bean注解的注入
     */
    @Test
    public void test4() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) ctx.getBean("userService");
        userService.register();
    }


    /**
     * 测试内容:测试@Bean  jdk类型的注入
     */
    @Test
    public void test5() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Customer customer = (Customer) ctx.getBean("customer");
        System.out.println("id = " + customer.getId());
        System.out.println("名字 = " + customer.getName());


    }

}
