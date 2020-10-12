<%--
  Created by IntelliJ IDEA.
  User: 15278
  Date: 2020/10/12
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<table align="center" width="500" border="1">

    <tr align="center">
        <td colspan="4"><h1>图书信息</h1></td>
    </tr>
    <tr align="center">
        <td width="200">书名</td>
        <td width="100">作者</td>
        <td width="100">出版社</td>
        <td width="50">操作</td>
    </tr>

    <c:forEach var="b" items="${lists}">
        <tr>
            <td>${b.bookName}</td>
            <td>${b.bookAuthor}</td>
            <td>${b.bookConcern}</td>
            <td><a href="BookServlet?id=${b.id}&comm=le">借阅</a></td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
