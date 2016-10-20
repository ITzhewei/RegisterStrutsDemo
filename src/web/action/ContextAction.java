package web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by john on 2016/10/19.
 * 利用 ActionContext存取数据
 */
public class ContextAction extends ActionSupport {


    @Override
    public String execute() throws Exception {
        //1.得到ActionContext
        ActionContext context = ActionContext.getContext();
        //2.往context的Map中存入数据
        context.put("key", "hello map");//直接将数据存到了 大的map中
        //往session中存放数据
        //第一种方式: 获取key为session的map
        Map<String, Object> sessionAttribute = context.getSession();
        sessionAttribute.put("asd", "aas");
        //第二种当时:
        HttpSession session = ServletActionContext.getRequest().getSession();
        System.out.println(session.getAttribute("asd")+"阿萨德");
        return SUCCESS;
    }
}
