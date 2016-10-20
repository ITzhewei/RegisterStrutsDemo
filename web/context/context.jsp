<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2016/10/19
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>存取ActionContext中的数据</title>
</head>
<body>

<%--<s:debug/>
&lt;%&ndash;获取大的Map中的数据使用的是 #+key&ndash;%&gt;
<s:property value="#key"/><br/>
&lt;%&ndash;获取大的Map中的小的Map中的数据,使&ndash;%&gt;
<s:property value="#session.asd"/>--%>

<%--获取ValueStack中的数据--%>

<s:debug/>
<%--valueStack中的value属性的取值 是一个OGNL表达式 ,它只能取元素中的属性
  注意:
  取valueStack中的 属性的时候不再使用 # ,
  并且他是从 栈顶 逐个对象查找对应的属性,只要找到了就不再继续查找
--%>
<s:property value="name"/>

<%--获取valueStack中的指定位置的属性--%>
<s:property value="[1].name"/>
</body>
</html>
