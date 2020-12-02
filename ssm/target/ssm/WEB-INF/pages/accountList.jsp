<%--
  Created by IntelliJ IDEA.
  User: 12692
  Date: 2020/11/20
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>show</h1>
    <table border="1">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>money</th>
        </tr>
        <c:forEach items="${accountList}" var="accout">
            <tr>
                <td>${accout.id}</td>
                <td>${accout.name}</td>
                <td>${accout.money}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
