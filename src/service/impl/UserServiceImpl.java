package service.impl;

import bean.User;
import dao.IUserDao;
import dao.impl.UserDaoImpl;
import service.IUserService;

/**
 * Created by john on 2016/10/14.
 * 用户相关业务的实现类
 */
public class UserServiceImpl implements IUserService {

    private IUserDao userDao = new UserDaoImpl();

    @Override
    public User findUserByUserName(String username) {

        return userDao.selectUserByUserName(username);
    }

    @Override
    public int register(User user) {
        return userDao.addUser(user);
    }
}
