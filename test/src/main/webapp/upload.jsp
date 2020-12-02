<%--
  Created by IntelliJ IDEA.
  User: 12692
  Date: 2020/11/14
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/quick14" method="post" enctype="multipart/form-data">
       名字<input type="text" name="name"><br/>
        文件1<input type="file" name="upload"><br/>
        文件2<input type="file" name="upload"><br/>
        文件3<input type="file" name="upload"><br/>
        <input type="submit" value="提交"><br/>
    </form>
</body>
</html>
