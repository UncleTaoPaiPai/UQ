<%@ page import="java.util.List" %>
<%@ page import="com.zyz.pojo.Emp" %><%--
  Created by IntelliJ IDEA.
  User: Yongzhi
  Date: 2021/2/9
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table{
        border: 1px solid blue;
        width: 80%;
        margin: 0px auto;
    }
    tr,th{
        border: 1px solid green;
    }

</style>
<body>

<table cellpadding="0px" cellspacing="0px">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>上级编号</th>
        <th>职务</th>
        <th>入职日期</th>
        <th>资薪</th>
        <th>补助</th>
        <th>部门号</th>
        <th>薪资等级</th>
    </tr>

    <%
        List<Emp> emps=(List<Emp>) request.getAttribute("emps");
        for (Emp emp : emps) {
    %>
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.Ename}</td>
            <td>${emp.Job}</td>
            <td>${emp.Mgr}</td>
            <td>${emp.Hiredate}</td>
            <td>${emp.Sal}</td>
            <td>${emp.Comm}</td>
            <td>${emp.Deptno}</td>
            <td>
    <%
        Double sal = emp.getSal();
        if (sal <=500){
            out.print("A");
        }else if (sal <= 1000){
            out.print("B");
        }else if (sal <= 1500){
            out.print("B");
        }else if (sal <= 2000){
            out.print("B");
        }else if (sal <= 3000){
            out.print("B");
        }else if (sal <= 4000){
            out.print("B");
        }else {
            out.print("G");
        }

    %>
            </td>
        </tr>
    <%
        }
    %>

</table>



</body>
</html>
