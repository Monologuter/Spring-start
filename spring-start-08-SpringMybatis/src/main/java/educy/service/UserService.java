package educy.service;

import educy.entity.User;

/**
 * @Author 马小姐
 * @Date 2020-11-03 15:23
 * @Version 1.0
 * @Description:
 */
public interface UserService {
    public void  register(User user);
    public void login(String name , String password);
}
