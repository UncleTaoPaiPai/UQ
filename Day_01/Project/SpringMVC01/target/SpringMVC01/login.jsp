<%--
  Created by IntelliJ IDEA.
  User: Yongzhi
  Date: 2021/2/21
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="login.do" method="post">
        用户名：<input type="text" name="username"><br/>
        密码:<input type="password" name="pwd"><br/>
        <input type="submit" value="提交"><br/>
        ${info}

    </form>
</body>
</html>
