<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib   uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Insert title here</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
im here, just working on the wide!
<table border="1">
<tr>
<td>序号</td>
<td>用户名</td>
<td>出生日期</td>
<td>性别</td>
<td>身高</td>
</tr>

<tr>
<c:forEach items="${userList}" var="list">
<td>${list.id}</td>
<td>${list.username}</td>
<td>${list.age}</td>
<td>${list.gender}</td>
<td>${list.height}</td>
</c:forEach>
</tr>
</table>
</body>
</html>