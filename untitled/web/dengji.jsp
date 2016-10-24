<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/10/17
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="/dengji?method=start">
        <table>
            <tr>
                <td>未打卡原因</td>
                <td><input type="text" name="reason"></td>
             </tr>
            <tr>
                <td>未打卡时间</td>
                <td><input type="text" name="time"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit">提交
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
