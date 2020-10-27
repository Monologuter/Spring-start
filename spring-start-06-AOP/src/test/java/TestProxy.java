import org.junit.Test;
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
}
