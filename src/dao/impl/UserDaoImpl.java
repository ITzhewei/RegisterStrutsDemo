package dao.impl;

import bean.User;
import dao.IUserDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import util.DBCPUtil;

import java.sql.SQLException;

/**
 * Created by john on 2016/10/14.
 * 用户相关的 持久层 实现
 */
public class UserDaoImpl implements IUserDao {

    QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());

    @Override
    public User selectUserByUserName(String username) {
        try {
            return qr.query("select * from user where username = ?", new BeanHandler<User>(User.class), username);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int addUser(User user) {
        try {
            return qr.update("insert into user(username,password,birthday,hobby,married) values(?,?,?,?,?)",
                    user.getUsername(), user.getPassword(), user.getBirthday(), user.getHobby(), user.isMarried());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
