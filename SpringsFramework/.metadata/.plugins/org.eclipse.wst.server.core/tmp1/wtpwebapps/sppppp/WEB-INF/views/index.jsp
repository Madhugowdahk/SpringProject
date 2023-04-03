<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body bgcolor="blue">
<center>
<h1>helllooo hiii</h1>
<h2>what so what move aside</h2>

<% 

int x=10;
String a="abcd";%>
<%
//why type casting means bcz it will return a object 
String name=(String)request.getAttribute("name");
%>

<%


Integer id=(Integer)request.getAttribute("id");

String nam=(String)request.getAttribute("name");
LocalDateTime lt=(LocalDateTime)request.getAttribute("time");
%>
<h1> id is<%=id %></h1>
<h1>name is<%=nam %></h1>
<h1><%=lt %></h1>

<h1>the value  of X is:<%=x %></h1>
<h2>the charcter is :<%=a.charAt(2) %></h2>
</center>
</body>

</html>