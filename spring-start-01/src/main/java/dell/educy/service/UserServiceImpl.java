package dell.educy.service;

import dell.educy.dao.UserDao;
import dell.educy.dao.UserDaoImpl;
import lombok.Data;

/**
 * @Author 马小姐
 * @Date 2020-10-07 11:16
 * @Version 1.0
 * @Description:
 */
@Data
public class UserServiceImpl implements UserService{
//    private UserDao  userDao = new UserDaoImpl();

    private UserDao  userDao;

    @Override
    public void getUSer() {

        userDao.getUSer();
    }
}
