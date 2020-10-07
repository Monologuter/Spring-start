package dell.educy;

import dell.educy.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 马小姐
 * @Date 2020-10-07 11:18
 * @Version 1.0
 * @Description:
 */
public class MyTest {


    //控制反转

    @Test
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
//
//        userService.getUSer();
//
//
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        userService.getUSer();
//
//
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlServerImpl());
//        userService.getUSer();


        //获取spring的上下文对象  我们的对象现在都在spring中管理了  我们要使用  就直接进去取出来就可以了
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //容器在手 天下我有  需要什么我直接get什么
        UserServiceImpl mysqlImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        mysqlImpl.getUSer();




    }
}
