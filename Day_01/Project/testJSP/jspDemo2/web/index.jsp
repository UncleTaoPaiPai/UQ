<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Yongzhi
  Date: 2021/2/8
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  
  <%
    /* 四个域 对象 */
    pageContext.setAttribute("",""); //page域 页面域 只在当前页面有效
    request.setAttribute("","");
    session.setAttribute("","");
    application.setAttribute("","");
    
    
    /* 响应对象 */
    response.setHeader("","");
    /* 输出流对象 response.getWriter(); */
    out.print("");
    
    /* 三个打酱油的 */
    config.getInitParameter(""); //servletConfig
    page.getClass(); // this index.jsp >>> index_jsp.java >>> index_jsp.class >>> index_jsp Object
    Throwable exception;
    exception.getMessage();
  
  %>
  
  
  </body>
</html>
