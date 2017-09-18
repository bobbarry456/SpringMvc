<%--
  Created by IntelliJ IDEA.
  User: Huangliniqng
  Date: 2017/9/18
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>
</head>
<body>
商品列表：
<table width="100%" border=1>
    <tr>
        <td>商品名称</td>
        <td>商品价格</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.name }</td>
            <td>${item.pass }</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

