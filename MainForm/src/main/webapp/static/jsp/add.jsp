<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/10/7
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<body>
<form action="/doadd" method="post">
    <table border="1px" align="center" width="500px">
        <tr>
            <td colspan="8" align="center"><h2>添加固定资产</h2></td>
        </tr>
        <tr>
            <td>资产编号：</td>
            <td><input type="text" name="assetid"></td>
        </tr>
        <tr>
            <td>资产名称：</td>
            <td><input type="text" name="assetname"></td>
        </tr>
        <tr>
            <td>资产类型：</td>
            <td> <select name="assettype">
                <option value="">请选择类型</option>
                <option value="电子设备">电子设备</option>
                <option value="机械设备">机械设备</option>
                <option value="运输设备">运输设备</option>
            </select>
            </td>
        </tr>
        <tr>
            <td>入库日期：</td>
            <td><input type="text" name="intodate"></td>
        </tr>
        <tr>
            <td colspan="8" align="center">
                <input type="submit" value="添加">
                <input type="reset" value="清空">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
<script type="text/javascript">
$("form").submit(function () {
    var assetid=$("[name='assetid']").val();
    var assetname=$("[name='assetname']").val();
    var assettype=$("[name='assettype']").val();
    var intodate=$("[name='intodate']").val();
    if(assetid==""||assetname==""||assettype==""||intodate==""){
        alert("请完整填写信息！！！")
        return false;
    }
    return true;
})
</script>
