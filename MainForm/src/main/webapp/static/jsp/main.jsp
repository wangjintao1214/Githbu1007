<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/10/7
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<body>
<%--<form action="/domain" method="post">
    <p align="center">
    <h2>固定资产查询</h2>
    资产编号：<input type="text" name="assetid">
    资产类型：
    <select name="assettype">
        <option value="请选择类型">请选择类型</option>
        <option value="电子设备">电子设备</option>
        <option value="机械设备">机械设备</option>
        <option value="运输设备">运输设备</option>
    </select>
    <input type="submit" value="查询">
    </p>
</form>--%>
<form action="/domain" method="post">
    <div align="center">
        <h2>固定资产查询</h2>
        资产编号：<input type="text" name="assetid">
        资产类型：
        <select name="assettype">
            <option value="请选择类型">请选择类型</option>
            <option value="电子设备">电子设备</option>
            <option value="机械设备">机械设备</option>
            <option value="运输设备">运输设备</option>
        </select>
        <input type="submit" value="查询">
    </div>
</form>
<table border="1px" align="center" width="800px">
    <tr>
        <td>资产编号</td>
        <td>资产名称</td>
        <td>资产类型</td>
        <td>入库时间</td>
    </tr>
    <c:forEach items="${assets}" var="a">
        <tr>
            <td>${a.assetid}</td>
            <td>${a.assetname}</td>
            <td>${a.assettype}</td>
            <td>${a.intodate}</td>
        </tr>
    </c:forEach>
</table>
<script type="text/javascript">
    $("tr:even").css("background-color","pink");
</script>
</body>
</html>

