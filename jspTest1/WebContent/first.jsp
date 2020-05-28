<%@page import="jspTest1.model.Drugstore"%>
<%@page import="jspTest1.dao.DrugstoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	DrugstoreDao dd = DrugstoreDao.getinstance();
	Drugstore ds1 = dd.getFirstLine();
%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= ds1.getName() %>
	
	<br>
	<br>
	
	<%= ds1.getLoc() %>
	
	<br>
	<br>
	
	<%
		if(ds1.getLoc().contains("서울시")) {
	%>
	<div>dasdasd</div>
	
	<% } %>
	
	<br>
	<br>
	
	
	<% out.println("이렇게도 출력 가능합니다."); %>
</body>
</html>