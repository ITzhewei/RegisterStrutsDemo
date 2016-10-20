package service;

import bean.User;

/**
 * Created by john on 2016/10/13.
 * 用户相关的业务层接口
 */
public interface IUserService {

    /**
     * 判断用户是否存在根据用户名
     */
    User findUserByUserName(String username);

    /**
     * 用户注册 的方法
     * //返回的是影响的数据库的行数
     */
    int register(User user);
}
