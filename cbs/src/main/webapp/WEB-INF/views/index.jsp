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
    <%@ include file="sub/header.jsp" %>
</header>
<section>
    <ul>
        <c:if test="${session.id == null}">
        <li> <a href="board/"> 자유 게시판 </a> </li>
        <li> <a href="user/loginForm"> 로그인 </a> </li>
        <li> <a href="user/registForm"> 회원가입 </a> </li>
        </c:if>
        <c:if test="${session.id != null}">
        <li> <a href="board/list"> 자유 게시판 </a> </li>
        <li> <a href="board/writeForm"> 게시글 작성 </a> </li>
        <li> <a href="user/userPage"> 마이페이지 </a> </li>
        <li> <a href="user/logout"> 로그아웃 </a> </li>
        </c:if>
    </ul>
    
</section>
<footer>

</footer>

</body>
</html>