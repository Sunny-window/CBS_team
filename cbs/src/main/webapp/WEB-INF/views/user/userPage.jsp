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
	*{
		margin: 0;
		padding: 0;
		box-sizing: border-box;
	}
	h2{
		font-size: x-large;
		float:left;
	}
</style>
</head>
<body>
<header>
    <%@ include file="../sub/header.jsp" %>
</header>
<section>
    <h2> My page </h2>
    <h4>내 프로필</h4>
	아이디<span>${sessionScope.id }</span>
	
	<h4>나한테 온 게시물 보기</h4>
	    <table border="1">
    	<tr>
    		<th>번호</th>
    		<th>제목</th>
    		<th>작성자</th>
    	</tr>
    <c:forEach var="board" items="${list }">
    	<tr>
    		<td>${board.bno }</td>
    		<td><a href="/board/detail?bno=${board.bno }">${board.title }</a></td>
    		<td>${board.writer }</td>
    	</tr>
    </c:forEach>
</section>
<footer>

</footer>

</body>
</html>