package dell.educy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 马小姐
 * @Date 2020-10-07 19:34
 * @Version 1.0
 * @Description:
 */

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");

        user.show();


    }
}



