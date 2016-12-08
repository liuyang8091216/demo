<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>显示用户信息</title>
        <style type="text/css">
            table,td{
                border: 1px solid;
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
        <table>
            <tr>
                <td>用户ID</td>
                <td>用户名</td>
                <td>用户生日</td>
                <td>工资</td>
            </tr>
            <%--遍历lstUsers集合中的User对象 --%>
            <c:forEach var="user" items="${user}">
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.userName}</td>
                    <td>${user.userBirthday}</td>
                    <td>${user.userSalary}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${requestScope.user }" var="a">
	${a.userId }
	${a.userName }
	${a.userBirthday }
	<br>
</c:forEach>
</body>
</html> --%>