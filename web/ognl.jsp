<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2016/10/18
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="myfc" uri="http://mycompany.com" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>OGNL-Expression</title>
</head>
<body>

<%--
EL表达式是:  ${}
JSP表达式:<%= %>
OGNL表达式: <s:property 他就类似于jsp的表达式,把结果输出到浏览器上
--%>

<%--EL表达式,只能调用静态方法--%>
${myfc:toUpperCase("asdasd")}
<hr/>

<%--OGNL表达式,可以访问普通方法
 OGNL表达式必须写在struts2的标签中
--%>
<%--OGNl中的 value的值不再是一个字符串 而是一个确定的值 ,找不到就是0--%>
<%--如果想让value中的值是字符串 必须给他套上单引号--%>
<s:property value="'OGNL-Expressiob'"/> <br/>
<s:property value="'OGNL-Expressiob'.length()"/><br/>

<%--OGNL访问静态属性 方式:  @全类名@静态属性--%>
<s:property value="@java.lang.Integer@MAX_VALUE"/><br/>
<s:property value="@java.lang.Math@random()"/>

<%--OGNL操作map和list集合--%>
<%--
使用 s:radio标签来创建 list集合
{}  就相当于创建了 一个list集合
list属性中的取值 是 一个OGNL表达式 
--%>
<%--表示list--%>
<s:radio list="{'男','女'}" name="gender"></s:radio> <br/>
<%--表示map--%>
<s:radio list="#{'1':'男','0':'女'}" name="gender"></s:radio>

</body>
</html>
