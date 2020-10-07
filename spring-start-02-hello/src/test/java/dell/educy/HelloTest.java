package dell.educy;

import dell.educy.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 马小姐
 * @Date 2020-10-07 16:35
 * @Version 1.0
 * @Description:
 */
public class HelloTest {
    public static void main(String[] args) {

        //获取spring的上下文对象  我们的对象现在都在spring中管理了  我们要使用  就直接进去取出来就可以了
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());



    }


}
