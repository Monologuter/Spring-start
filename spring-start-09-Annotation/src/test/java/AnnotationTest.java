import com.educy.entity.User;
import com.educy.scope.Customer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @Author 马小姐
 * @Date 2020-11-06 17:40
 * @Version 1.0
 * @Description:
 */
public class AnnotationTest {
    /**
     * 测试内容:测试Component注解
     */
    @Test
    public void test() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User) classPathXmlApplicationContext.getBean("u");

        System.out.println("userid = " + user.getId());
    }

    /**
     * 测试内容:测试scope注解
     */
    @Test
    public void test2() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Customer customer = (Customer) classPathXmlApplicationContext.getBean("customer");
        Customer customer1 = (Customer) classPathXmlApplicationContext.getBean("customer");
        System.out.println("customer = " + customer);
        System.out.println("customer1 = " + customer1);

    }
}
