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
	
	.form:hover{
		color: sky;
	}
	
</style>
</head>
<body>
<header>
    <%@ include file="../sub/header.jsp" %>
</header>
<section>
    <h2> Login Form </h2>
    <form action="/user/login" method="post" class=form>
    	아이디<input type="text" name="id" placeholder="id를 입력해주세요"><br>
    	비밀번호<input type="password" name="pwd" placeholder="password를 입력해주세요"><br>
    	<input type="submit" value="로그인">  
    </form>
</section>
<footer>

</footer>
</body>
</html>