<%--
  Created by IntelliJ IDEA.
  User: Yongzhi
  Date: 2021/2/16
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>新增</title>
    <link  rel="stylesheet"  href="${basePath}static/css/styles.css" />
    <link rel="stylesheet"  href="${basePath}static/css/font-awesome-4.7.0/css/font-awesome.min.css" />
    <script  src="${basePath}static/js/jquery.min.js" type="text/javascript"></script>
    <script  src="${basePath}static/js/jquery-validation-1.19.3/jquery.validate.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $("#addForm").validate({
                rules: {
                    stuNo:{
                        required:true,
                        digits:true
                    },
                    stuName:{
                        required:true
                    }

                },

            });
        });
    </script>



</head>
<body>
<div class="add">
    <form id="addForm" action="${basePath}student?method=add" method="post">
        <table class="tableadd" style="width: 50%;">
            <tr>
                <td>学号</td>
                <td style="color: red"><input type="text" name="stuNo"></td>

            </tr>
            <tr>
                <td>姓名</td>
                <td style="color: red"><input type="text" name="stuName"></td>

            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="stuPwd" value="123456"></td>
                初始密码为：123456
            </tr>
            <tr>
                <td colspan="4" align="left">
                    <button class="edit" type="button" onclick="window.history.back(-1);">
                        <i class="fa fa-arrow-left"></i>
                        返回
                    </button>
                    <button class="remove" type="submit">
                        <i class="fa fa-save"></i>
                        提交
                    </button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
