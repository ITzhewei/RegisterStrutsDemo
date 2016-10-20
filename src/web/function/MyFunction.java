package web.function;

/**
 * Created by john on 2016/10/18.
 * EL表达式的自定义方法
 * 1只能支持静态方法调用
 * 2.配置,在WEB-INF目录中创建一个扩展名为.tld的xml文件
 * 3.在jsp的taglib指令引入外部的标签库或方法库
 */
public class MyFunction {

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
