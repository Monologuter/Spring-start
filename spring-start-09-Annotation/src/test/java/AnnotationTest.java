import com.educy.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
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
        User user = (User) classPathXmlApplicationContext.getBean("user");
        System.out.println("user = " + user);


    }
}
