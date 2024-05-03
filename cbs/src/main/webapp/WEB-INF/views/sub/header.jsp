<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta charset="UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<!-- 폰트 첨부 -->
    <link href="https://fonts.googleapis.com/css2?family=Poor+Story&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap" rel="stylesheet">
    <style>
        html {
            margin:0;
        }
        section{
            margin:0 8px;
        }
        body {
            font-family: "Gowun Dodum", sans-serif;
            background-color: whitesmoke;
        }
        .header{
            color: orange;
        }
        .header {
            display: flex;
        }
        .header *{
            text-align: center;
            font-size: 36px;
            font-style: normal;
            color: orange;
            background-color: beige;
            margin: 0 0;
        }
        h1 a{
            text-decoration:none;
        }
        
        .menu{
            margin: 20px;
        }
        .menu ul li{
	        background-color: beige;
	        list-style: none;
	        text-align: center;
	        float: left;
        }
        .menu a{
        	margin: 10px;
        	text-decoration:none;
        	font-size: 29px;
        	color: light blue;
        	font-weight:bold;
        }
        .menu a:hover{
        	color:lightblue;
        }
    </style>
</head>
<div class="header">
    <div class="logo">
        <h1> <a id="logo" href="/"> CBS Team Project </a> </h1>
    </div>
    <div class="menu">
        <ul id="nav">
            <c:if test="${sessionScope.id == null}">
            <li> <a href="/board/"> 자유 게시판 </a> </li>
            <li> <a href="/user/loginForm"> 로그인 </a> </li>
            <li> <a href="/user/registForm"> 회원가입 </a> </li>
            </c:if>
            <c:if test="${sessionScope.id != null}">
            <li> <a href="/board/list"> 자유 게시판 </a> </li>
            <li> <a href="/board/writeForm"> 게시글 작성 </a> </li>
            <li> <a href="/user/userPage"> 마이페이지 </a> </li>
            <li> <a href="/user/logout"> 로그아웃 </a> </li>
            </c:if>
        </ul>
	</div>    
</div> 	

