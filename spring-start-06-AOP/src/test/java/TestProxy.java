import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springProxy.*;

/**
 * @Author 马小姐
 * @Date 2020-10-27 10:36
 * @Version 1.0
 * @Description:
 */
public class TestProxy {
    /**
     * 测试内容:测试静态代理的方法
     */
    @Test
    public void test1() {
        UserService userService = new UserServiceProxy();
        userService.login("陈亚","123456");
        userService.register(new User());
        System.out.println("-------------------------------------");

        OrderService orderService = new OrderServiceProxy();
        orderService.showOrder();
    }


    /**
     * 测试内容:测试UserService和OrderService动态代理
     */
    @Test
    public void test2() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        userService.register(new User());
        userService.login("陈亚","123456");
        System.out.println("--------------------------------------------------------------------");
        OrderService orderService = (OrderService) classPathXmlApplicationContext.getBean("orderService");
        orderService.showOrder();


    }
}
