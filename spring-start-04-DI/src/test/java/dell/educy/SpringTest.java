package dell.educy;

import dell.eduucy.Address;
import dell.eduucy.Student;
import dell.factoryBean.ConnectionBeanFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.tags.HtmlEscapeTag;

import java.sql.Connection;

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

        Address address2 = classPathXmlApplicationContext.getBean("address", Address.class);
        System.out.println(address2);

        Address address = (Address) classPathXmlApplicationContext.getBean("address");
        Address address1 = (Address) classPathXmlApplicationContext.getBean("address");
        System.out.println(address.hashCode());
        System.out.println(address1.hashCode());
        System.out.println(student1 == student);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student.toString());

    }


    /**
     * 测试内容:构造注入  constructor-arg标签
     */
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object customer = context.getBean("customer");
        System.out.println(customer);
    }


    /**
     * 测试内容:用于测试factoryBean接口的实现类对象
     *
     *   如果只是想获得FactoryBean 要在getbaen后面加上一个&符号
     */
    @Test
    public void test12() {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection conn = (Connection) classPathXmlApplicationContext.getBean("conn");
//        Connection conn2 = (Connection) classPathXmlApplicationContext.getBean("conn");
//        ConnectionBeanFactory conn1 = (ConnectionBeanFactory) classPathXmlApplicationContext.getBean("&conn");
        System.out.println("conn = " + conn);
//        System.out.println("conn2 = " + conn2);
//        System.out.println("conn1 = " + conn1);
    }

    /**
     * 测试内容:
     */
    @Test
    public void test13() {

    }
}
