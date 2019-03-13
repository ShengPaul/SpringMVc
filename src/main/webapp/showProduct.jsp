<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/8 0008
  Time: 下午 2:54
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
    <title>显示所有的产品</title>
</head>
<body>

    <table border="1">
        <tr>
            <td>编号</td>
            <td>产品名称</td>
            <td>产品价格</td>
            <td>产品品牌</td>
            <td>生产日期</td>
            <td>税率</td>
            <td>操作</td>
        </tr>

    <c:forEach items="${pros}" var="pro">
        <tr>
            <td>${pro.proId}</td>
            <td>${pro.proName}</td>
            <td>${pro.proPrice}</td>
            <td>${pro.proUnit}</td>
            <td>${pro.createdate}</td>
            <td>${pro.taxrate}</td>
            <td>
                <a href="prot/del/${pro.proId}">删除产品</a>
                <a href="prot/update/${pro.proId}">修改产品</a>
            </td>
        </tr>
    </c:forEach>
        <tr>
            <td colspan="7">
                <a href="prot/add"> 增加产品</a>
            </td>
        </tr>
    </table>
</body>
</html>
