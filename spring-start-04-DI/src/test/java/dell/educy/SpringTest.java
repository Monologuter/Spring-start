package dell.educy;

import dell.eduucy.Address;
import dell.eduucy.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 马小姐
 * @Date 2020-10-08 10:41
 * @Version 1.0
 * @Description:
 */
public class SpringTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) classPathXmlApplicationContext.getBean("student");
        System.out.println(student.toString());

    }
}
