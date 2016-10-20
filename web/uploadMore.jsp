<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2016/10/17
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多文件上传</title>
</head>
<body>
<s:form action="uploadMore" method="POST" enctype="multipart/form-data">
    <s:file name="photo" label="照片1"/>
    <s:file name="photo" label="照片2"/>
    <s:submit value="提交"/>
</s:form>
</body>
</html>
