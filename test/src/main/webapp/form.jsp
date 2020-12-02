<%--
  Created by IntelliJ IDEA.
  User: 12692
  Date: 2020/11/13
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/quick8" method="post">
<%--    表明是第几个user对象的username age--%>
    <input type="text" name="userList[0].username" ><br/>
    <input type="text" name="userList[0].age" ><br/>
    <input type="text" name="userList[1].username" ><br/>
    <input type="text" name="userList[1].age" ><br/>
    <input type="submit"/>
</form>
</body>
</html>
