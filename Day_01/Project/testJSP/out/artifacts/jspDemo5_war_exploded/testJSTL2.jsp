<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: Yongzhi
  Date: 2021/2/9
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        int score=new Random().nextInt();
        pageContext.setAttribute("score",score);
    %>

    <%--判断条件--%>

    <c:if test="${score ge 90}">A</c:if>
    <c:if test="${score ge 80 and score lt 90}">B</c:if>
    <c:if test="${score ge 70 and score lt 80}">C</c:if>
    <c:if test="${score ge 60 and score lt 70}">D</c:if>
    <c:if test="${score lt 60}">E</c:if>


</body>
</html>
