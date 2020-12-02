<%--
  Created by IntelliJ IDEA.
  User: 12692
  Date: 2020/11/20
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>保存账户信息表单</h1>
<form name="accountForm" action="${pageContext.request.contextPath}/account/save" method="post">
    name<input type="text" name="name"><br/>
    money<input type="text" name="money"><br/>
    <input type="submit" value="save"><br/>
</form>
</body>
</html>
