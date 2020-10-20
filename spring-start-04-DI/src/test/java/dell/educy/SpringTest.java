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
        Student student1 = (Student) classPathXmlApplicationContext.getBean("student");

        Address address = (Address) classPathXmlApplicationContext.getBean("address");
        Address address1 = (Address) classPathXmlApplicationContext.getBean("address");
        System.out.println(address.hashCode());
        System.out.println(address1.hashCode());

        System.out.println(student1 == student);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student.toString());

    }
}
