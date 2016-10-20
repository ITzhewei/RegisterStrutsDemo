<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2016/10/14
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<s:fielderror/><%--字段错误--%>
<form action="${pageContext.request.contextPath}/register.action" method="get">
    用户名:<input type="text" name="username"><br/>
    密码:<input type="password" name="password"><br/>
    生日:<input type="date" name="birthday"><br/>
    爱好:
    <input type="checkbox" name="hobby" value="吃饭">吃饭
    <input type="checkbox" name="hobby" value="睡觉">睡觉
    <input type="checkbox" name="hobby" value="音乐">音乐
    <br/>
    婚否:<input type="checkbox" name="married" value="true">婚否<br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
