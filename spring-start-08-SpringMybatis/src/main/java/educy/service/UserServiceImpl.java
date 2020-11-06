package educy.service;

import educy.entity.User;
import educy.mapper.UserMapper;
import lombok.Data;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author 马小姐
 * @Date 2020-11-03 15:24
 * @Version 1.0
 * @Description:
 */

@Data
//隔离属性
//@Transactional(isolation = Isolation.READ_COMMITTED)
//@Transactional(isolation = Isolation.REPEATABLE_READ)
//@Transactional(isolation = Isolation.SERIALIZABLE)


//传播属性
@Transactional(propagation = Propagation.REQUIRED,timeout = 2)
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    @Override
    public void register(User user) {

        try {
            Thread.currentThread().sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userMapper.save(user);
//        throw new RuntimeException("测试异常");
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public void login(String name, String password) {

    }
}
