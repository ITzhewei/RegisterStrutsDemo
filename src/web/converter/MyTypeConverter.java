package web.converter;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * 需求:
 * 把 MM/dd/YYYY 格式的数据转换成 日期类型
 * 把 数据库中的本地 日期 类型 转换成 MM/dd/YYYY  格式 输出
 * <p>
 * <p>
 * Created by john on 2016/10/14.
 * 自定义类型 转换器
 * 第一步: 继承一个类 继承自StrutsTypeConverter, 并实现其中的两个方法
 */
public class MyTypeConverter extends StrutsTypeConverter {

    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 把字符串 类型的数据 转换成 日期类型
     * map是OGNL的上下文参数,暂时不用管
     * strings是需要转化的数据
     * aClass是要进行转换的类型--->此处应该是Date类型的
     */
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        //1.先看看有没有数据
        if (strings == null || strings.length == 0) {
            return null;
        }
        //2.取出数组中的第一个元素
        String date = strings[0];
        System.out.println(date+"1");
        //3.判断目标类型的字节码是否是日期类型的
        if (aClass != java.util.Date.class) {
            return null;
        }
        //4.使用DataFormat进行转换
        try {
            Date parse = dateFormat.parse(date);
            System.out.println(parse.toString()+"2");
            return parse;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 把 日期类型的数据转换成 字符串
     * map 还是OGNL的上下文
     * o是需要被转换的类型--->此处应该是Date类型的
     */
    @Override
    public String convertToString(Map map, Object o) {
        //1.判断object是否是Date类型的
        if (!(o instanceof Date)) {
            return null;
        }
        System.out.println(o.toString()+"3");
        //2.如果是Date类型的就利用转换器转化成指定格式的字符串并返回
        Date date = (Date) o;
        String dateString = dateFormat.format(date);
        System.out.println(dateString+"4");
        return dateString;
    }
}
