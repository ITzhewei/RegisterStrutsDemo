package dao;

import bean.User;

/**
 * Created by john on 2016/10/14.
 * 用户相关操作的持久层接口
 */
public interface IUserDao {
    /**
     * 根据用户的名字查询用户
     */
    User selectUserByUserName(String username);

    /**
     * 添加用户
     */
    int addUser(User user);
}
