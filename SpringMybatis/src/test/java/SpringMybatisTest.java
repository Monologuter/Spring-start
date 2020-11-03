import educy.Mapper.UserMapper;
import educy.entity.User;
import educy.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("陈亚");
        user.setPassword("123456");
        mapper.save(user);
        sqlSession.commit();


    }
}
