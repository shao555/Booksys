<%--
  Created by IntelliJ IDEA.
  User: 15278
  Date: 2020/10/12
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript">

        function ba() {
            history.back();
        }

        // $(document).ready(function () {
        //     //失去焦点事件
        //     $("#lender").blur(le());
        //
        // });

        function le(ids) {
            // var lender = document.getElementById(lender).valueOf();
            var lender = document.getElementsByName(lender);
            alert("借阅人不能为空!"+lender);

            if (lender !== "") {
                location.href="BookServlet?id=" + ids + "&comm=lend";
            }

        }



    </script>
</head>
<body>

<%--<%String id = request.getParameter("id");%>--%>
<table align="center" width="300px" border="1">
<%--    <input type="hidden" name="id" value="<%=id%>">--%>
    <tr>
        <td colspan="2"><h1>图书简要介绍</h1></td>
    </tr>
    <tr>
        <td>书名:</td>
        <td>${b.bookName}</td>
    </tr>
    <tr>
        <td>作者:</td>
        <td>${b.bookAuthor}</td>
    </tr>
    <tr>
        <td>出版社:</td>
        <td>${b.bookConcern}</td>
    </tr>
    <tr>
        <td>出版时间:</td>
        <td>${b.concernTime}</td>
    </tr>
    <tr>
        <td>借阅人:</td>
        <td><input type="text" id="lender" name="lender" onblur="le()" value="${b.lender}"></td>
    </tr>
    <tr>
        <td></td>
        <td>
            <input type="button"  value="借阅" onclick="le(${b.id})">
            <input type="button" value="返回" onclick="ba()">
        </td>
    </tr>
    
</table>


</body>
</html>
