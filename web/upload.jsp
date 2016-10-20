<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2016/10/17
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Struts2中的文件上传</title>
</head>
<body>

<%--文件上传的必要前提
1.请求文件必须是post
2.enctype属性的取值必须是multipart/form-data
3.提供一个文件选择域(需要使用s标签)
--%>

<%--表单中的数据只有在拥有name属性的时候才会被提交 并且 文件上传 需要方式 为 post--%>
<s:actionerror/>
<s:form action="upload" enctype="multipart/form-data">
    <s:textfield name="username"></s:textfield>
    <s:file name="photo" label="照片"></s:file>
    <s:submit value="提交"></s:submit>
</s:form>

</body>
</html>
