package springProxy;

/**
 * @Author 马小姐
 * @Date 2020-10-27 10:20
 * @Version 1.0
 * @Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public void register(User user) {
        System.out.println("UserServiceImpl.register");
//        代表的是业务运算和dao调用

    }

    @Override
    public boolean login(String name, String password) {
        System.out.println("UserServiceImpl.login");
        return true;
    }
}
