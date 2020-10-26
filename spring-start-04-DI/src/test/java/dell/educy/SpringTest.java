package dell.educy;

import dell.eduucy.Address;
import dell.eduucy.Student;
import dell.factoryBean.ConnectionBeanFactory;
import dell.life.Product;
import dell.scope.Account;
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
     * 测试内容:测试实例工厂以及静态工厂
     */
    @Test
    public void test13() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connFactory = (Connection) classPathXmlApplicationContext.getBean("conn");
        System.out.println("connFactory = " + connFactory);

    }


    /**
     * 测试内容:测试简单对象创建的次数
     */
    @Test
    public void test14() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account = (Account) classPathXmlApplicationContext.getBean("account");
        Account account2 = (Account) classPathXmlApplicationContext.getBean("account");
        System.out.println("account = " + account);
        System.out.println("account2 = " + account2);


    }


    /**
     * 测试内容:测试对象的生命周期
     */
    @Test
    public void test16() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) classPathXmlApplicationContext.getBean("product");
//        System.out.println("product = " + product);
        classPathXmlApplicationContext.close();

    }

    /**
     * 测试内容:配置文件参数化
     */
    @Test
    public void test17() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
        Connection conn = (Connection) classPathXmlApplicationContext.getBean("conn");
        System.out.println("conn = " + conn);
    }

}
