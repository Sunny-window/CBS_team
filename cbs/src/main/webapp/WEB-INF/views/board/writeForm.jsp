<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- JSTL Core --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setCharacterEncoding("UTF-8");
// post 방식으로 parameter 받을 때 한글을 인코딩하기 위해 
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title></title>
<style>

</style>
</head>
<body>
<header>
    <%@ include file="../sub/header.jsp" %>
</header>
<section>
    <h2> WriteForm </h2>
    <form action="/board/write" method="post">
    <table border="1"></table>
    	<tr>
    		<th>title</th>
    		<td><input type="text" name="title"></td>
    	</tr>
    	<tr>
    		<th>content</th>
    		<td><input type="text" name="content"></td>
    	</tr>
    	<tr>
    		<th>writer</th>
    		<td><input type="text" name="writer"></td>
    	</tr>
    	<tr>
    		<th>reader</th>
    		<td><input type="text" name="reader"></td>
    	</tr>
    	<input type="submit" value="등록">
	</form>
</section>
<footer>

</footer>

</body>
</html>