<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <form action="/user/login" method="get" >
    <div>
        用户名:
        <input type="text" name="username">
    </div>

    <div>
        密码:
        <input type="password" name="pwd">
    </div>

    <div>
        <input type="submit" value="提交">
    </div>
    </form>
</body>
</html>