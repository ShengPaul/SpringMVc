<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/8 0008
  Time: 下午 7:05
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
    <title>使用ajax上传图片</title>
</head>
<body>

        <form id= "uploadForm">
            指定文件名： <input type="text" name="filename" value= ""/>
            上传文件： <input type="file" name="file"/>
            <input type="button" value="上传" onclick="doUpload();" />
        </form>

</body>

        <script type="text/javascript" src="static/jquery-3.3.1.min.js"></script>

        <script type="text/javascript">
            function doUpload() {
                var formData = new FormData($("#uploadForm")[0]);
                $.ajax({
                    url:"getJpg",
                    method:"POST",
                    data:formData,
                    async: false,
                    cache: false,
                    contentType: false,
                    processData: false,
                    success: function (dt) {
                       console.log(dt);
                    },
                    error: function (dt) {
                        console.log(dt);
                    }
                });
            }
        </script>
</html>
