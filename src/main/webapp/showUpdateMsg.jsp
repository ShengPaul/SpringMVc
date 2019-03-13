<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/8 0008
  Time: 下午 6:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();//
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>修改产品</title>
</head>
<body>


<form method="post" action="prot/saveUpdateProduct" >
    <input type="hidden" name="proId" value="${product.proId}" />
    产品名称:<input type="text" name="proName" value="${product.proName}" />  <br/>
    产品价格:<input type="text" name="proPrice" value="${product.proPrice}"  />  <br/>
    产品品牌:<input type="text" name="proUnit" value="${product.proUnit}" />  <br/>
    产品税率:<input type="text" name="taxrate" value="${product.taxrate}" />  <br/>
    <input type="submit" value="提交" />
</form>

</body>
</html>
