package springProxy;

/**
 * @Author 马小姐
 * @Date 2020-10-27 10:24
 * @Version 1.0
 * @Description:
 */
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService = new UserServiceImpl();
    @Override
    public void register(User user) {
        System.out.println("日志的额外功能");
        userService.register(user);


    }

    @Override
    public boolean login(String name, String password) {
        System.out.println("登录的额外功能");
        return userService.login(name, password);
    }
}
