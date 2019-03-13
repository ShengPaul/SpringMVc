<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/8 0008
  Time: 下午 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();//
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>登录界面</title>
</head>
<body>
    ${msg}  <br/>
    <form method="post" action="user/login" >

        <input type="text" name="userName"/> <br/>
        <input type="password" name="userPwd"/> <br/>
        <input type="submit" value="登录" />
    </form>
</body>
</html>
