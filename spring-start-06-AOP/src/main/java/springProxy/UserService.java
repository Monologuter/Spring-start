package springProxy;

/**
 * @Author 马小姐
 * @Date 2020-10-27 10:16
 * @Version 1.0
 * @Description:
 */
public interface UserService {
    public void register(User user);
    public boolean login(String name , String password);
}
