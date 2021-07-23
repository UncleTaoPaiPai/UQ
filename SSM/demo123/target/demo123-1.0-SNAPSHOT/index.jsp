<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <div>Tony's Shop</div>
    <form action="/user/login" method="post">
        <div>用户名:
        <input type="text" name="username">
        </div>

        <div>密码:
            <input type="password" name="pwd">
        </div>

        <div>
            <input type="submit" value="LOGIN">
        </div>

    </form>
</body>
</html>