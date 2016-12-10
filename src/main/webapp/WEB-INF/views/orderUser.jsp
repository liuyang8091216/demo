<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询所有订单以及用户信息</title>
<style type="text/css">
	table,td{
		border:1px solid;
		border-collapse:collapse;
	}
</style>
</head>
<body>
查询所有订单以及用户信息
<table>
	<tr>
		<td>id</td>
		<td>用户id</td>
		<td>编号</td>
		<td>创建时间</td>
		<td>备注</td>
		<td>用户id</td>
		<td>用户姓名</td>
		<td>生日</td>
		<td>性别</td>
		<td>地址</td>
	</tr>
	<c:forEach items="${orders }" var="order">
		<tr>
			<td>${order.id }</td>
			<td>${order.userId }</td>
			<td>${order.number }</td>
			<td><fmt:formatDate value="${order.createtime }" pattern="yyyy年MM月dd日"/> </td>
			<td>${order.note }</td>
			
			<td>${order.userr.id }</td>
			<td>${order.userr.username }</td>
			<td> <fmt:formatDate value="${order.userr.birthday }" pattern="yyyy年MM月dd日"/> </td>
			<td>${order.userr.sex }</td>
			<td>${order.userr.address }</td>
		</tr>

	</c:forEach>
</table>
</body>
</html>