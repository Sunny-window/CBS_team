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
    <h2> Detail </h2>
    <table border="1">
    	<tr>
    		<th>번호</th>
    		<th>제목</th>
    		<th>내용</th>
    		<th>작성자</th>
    		<th>공개범위</th>
    	</tr>
    	<tr>
    		<td>${list.bno }</td>
    		<td>${list.title }</td>
    		<td>${list.content }</td>
    		<td>${list.writer }</td>
    		<td>${list.reader }</td>
    	</tr>
    </table>
</section>
<footer>

</footer>

</body>
</html>