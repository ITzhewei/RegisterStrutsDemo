package web.action;

import bean.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * Created by john on 2016/10/19.
 * 利用ValueStack来进行存取数据
 */
public class ContextAction2 extends ActionSupport {

    @Override
    public String execute() throws Exception {

      /*  //1.获取ValueStack对象的引用
        //第一种方式:
        ActionContext context = ActionContext.getContext();
        Map<String, Object> request = (Map<String, Object>) context.get("request");
        ValueStack valueStack = (ValueStack) request.get("struts.valueStack");
        System.out.println(valueStack.hashCode());

        //第二种方式
        HttpServletRequest request1 = ServletActionContext.getRequest();
        ValueStack valueStack1 = (ValueStack) request1.getAttribute("struts.valueStack");
        System.out.println(valueStack1.hashCode());

        //第三种方法 使用 ActionContext的对象方法直接获得
        ValueStack valueStack2 = context.getValueStack();
        System.out.println(valueStack2.hashCode());*/

      //栈的操作
        ActionContext context = ActionContext.getContext();
        ValueStack valueStack = context.getValueStack();

        //进栈
        valueStack.push(new Student("大哥","12","1111"));

        return SUCCESS;
    }
}
