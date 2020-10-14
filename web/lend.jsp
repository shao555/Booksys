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

        $(document).ready(function () {
            $("table").attr("bgColor", "#66ccff"); //设置表格的背景颜色
            $("tr").attr("bgColor", "#9A9A9A"); //为单数行表格设置背景颜色
            $("tr:even").css("background-color", "#FFFFFF"); //为双数行表格设置背颜色素
            $("table").css("width", "600px")
        }); //为表格添加样式，设置表格长度为300像素

        function ba() {
            history.back();
        }


        $(document).ready(function () {
            //失去焦点事件
            $("#lender").blur(check);


            //表单提交事件
            $("#tab").submit(function () {

                if (check()) {
                    return true;
                }
                return false;
            });
        });


        function check() {

            var lend = $("#lender").val();
            if (lend == "" || lend == null) {
                alert("借阅人不能为空!" + lend);
                return false;
            }
            return true;
        }


    </script>
</head>
<body>


<form action="BookServlet?id=${b.id}&&comm=lend" method="post" id="tab">

    <table align="center" width="300px" border="1">
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
            <td><input type="text" id="lender" name="lender" value=""></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="借阅">
                <input type="button" value="返回" onclick="ba()">
            </td>
        </tr>

    </table>

</form>

</body>
</html>
