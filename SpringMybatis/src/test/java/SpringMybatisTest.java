import educy.mapper.UserMapper;
import educy.entity.User;
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

    }
}
