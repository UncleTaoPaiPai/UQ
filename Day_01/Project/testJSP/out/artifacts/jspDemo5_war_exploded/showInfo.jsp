<%@ page import="com.zyz.pojo.user" %><%--
  Created by IntelliJ IDEA.
  User: Yongzhi
  Date: 2021/2/9
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--向pageContext域中放数据--%>
    <%
    pageContext.setAttribute("msg","pageContextMessage");
    pageContext.setAttribute("userx",new user(6,"Jackson","000"));
    %>

    <%--page从域中取出数据--%>
    pageContext:<br/>
    msg:${pageScope.msg}<br/>
    username:${pageScope.userx.name}<br/>
    <%--msg:<%=pageContext.getAttribute("msg")%><br/>--%>
    <%--username:<%=((user)pageContext.getAttribute("userx")).getName()%><br/>--%>
    <hr/>

    <%--request从域中取出数据--%>
    requestContext:<br/>
    msg:${requestScope.msg}<br/>
    username:${requestScope.user.name}<br/>
    <%--msg:<%=request.getAttribute("msg")%><br/>--%>
    <%--username:<%=((user)request.getAttribute("user")).getName()%><br/>--%>
    <hr/>

    <%--session从域中取出数据--%>
    sessionContext:<br/>
    msg:${sessionScope.msg}<br/>
    username:${sessionScope.users[1]}<br/>
    <%--msg:<%=session.getAttribute("msg")%><br/>--%>
    <%--username:<%=((user)session.getAttribute("users")).getName()%><br/>--%>
    <hr/>


    applicationContext:<br/>
    msg:${applicationScope.msg}<br/>
    username:${applicationScope.usermap.a.name}<br/>
    <%--msg:<%=application.getAttribute("msg")%><br/>--%>
    <%--username:<%=((user)application.getAttribute("usermap")).getName()%><br/>--%>
    <hr/>

    ${param.username}<br/>
    ${paramValues.hobby[0]}










</body>
</html>
