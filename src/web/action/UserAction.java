package web.action;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.validation.SkipValidation;
import service.IUserService;
import service.impl.UserServiceImpl;

/**
 * Created by john on 2016/10/14.
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    private IUserService userService = new UserServiceImpl();


    /**
     * 在struts2中 它也提供了一个Map<表单的字段名,错误提示>
     * <p>
     * 编程式验证:(硬编码不推荐)
     * 1.动作类必须继承ActionSupport
     * 2.重写 validate方法
     * <p>
     * validate在动作方法执行之前进行验证
     * 该方法会验证 该action下的所有的方法:
     * 第一种方式:可以使用@SkipValidation的注解 来使其不用被验证
     * 第二种方式: 可以使用validate+动作方法的名称  动作方法的名称要大写
     */
//    @Override
//    public void validate() {
//        if (StringUtils.isBlank(user.getUsername())) {
//            //存入错误信息
//            addFieldError("username", "请输入用户名");
//        }
//    }

//    public void validateRegister() {
//        if (StringUtils.isBlank(user.getUsername())) {
//            //存入错误信息
//            addFieldError("username", "请输入用户名");
//        }
//    }
    public String register() {
        //1首先根据用户名 获取 数据库的用户对象
        //2判断对象是否存在,如果存在则表明已经存在返回到 exits的结果视图
        //3.不存在 对象, 则进行保存用户信息
        //4.如果执行结果大于0 返回 success 如果不大于0  返回 null
        if (userService.findUserByUserName(user.getUsername()) == null) {
            int i = userService.register(user);
            if (i > 0) {
                return SUCCESS;
            } else {
                return "none";
            }
        } else {
            return "exists";
        }


    }

    @SkipValidation
    public String findAll() {
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }

}
