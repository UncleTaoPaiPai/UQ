<%--
  Created by IntelliJ IDEA.
  User: Yongzhi
  Date: 2021/2/7
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        int score=(int)(Math.random()*101);
    %>

    <%
        out.println(score);
    %>

    <%
        int grade = score/10;
        switch (grade){
            case 10:
            case 9:
                out.println("A");
                break;
            case 8:
                out.println("B");
                break;
            case 7:
                out.println("C");
                break;
            case 6:
                out.println("D");
                break;
            default:
                out.println("E");


        }
    %>


</body>
</html>
