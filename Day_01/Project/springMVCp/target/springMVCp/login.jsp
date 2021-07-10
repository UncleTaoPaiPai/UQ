<%--
  Created by IntelliJ IDEA.
  User: Yongzhi
  Date: 2021/2/25
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="login.do" method="post">

    登录用户名:<input type="text" name="username"/><br/>
    登录密码:<input type="password" name="pwd"/><br/>
    <input type="submit" value="登陆提交">
    <span>${info}</span>


</form>

</body>
</html>
