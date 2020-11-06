import educy.mapper.UserMapper;
import educy.entity.User;
import educy.service.UserService;
import educy.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 马小姐
 * @Date 2020-11-03 10:11
 * @Version 1.0
 * @Description:
 */
public class SpringMybatisTest {
    /**
     * 测试内容:
     */
    @Test
    public void test() {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserMapper educy = sqlSession.getMapper(UserMapper.class);
//        User user = new User();
//        user.setName("陈亚");
//        user.setPassword("123456");
//        educy.save(user);
//        sqlSession.commit();

        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        User user = new User();
        user.setName("马静娴");
        user.setPassword("99999");

        userMapper.save(user);

//
//        思考:为什么此时可以不提交事务就可以插入数据？
//            Mybatis提供的连接池对象  创建的Connection 手动的空子了事务  操作完成之后 必须要手动提交
//
//            Druid创建的连接池  不需要手动提交  直接将Connection.setAutoCommit(true)  设置为了true

    }


    /**
     * 测试内容:测试spring的事务处理
     */
    @Test
    public void test2() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        User user = new User();
        user.setName("陈亚");
        user.setPassword("hhhhh");
        userService.register(user);
    }
}
