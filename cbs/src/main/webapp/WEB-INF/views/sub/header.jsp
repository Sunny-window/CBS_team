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
        .header *{
            text-align: center;
            font-size: 36px;
            font-style: normal;
            color: orange;
            background-color: beige;
            line-height: 50px;
            float: left;
        }
        #header h1{
       		font-family: "Gowun Dodum", sans-serif;
            text-decoration: none;
            font-weight: 200;
        }
        h1 a{
        	text-decoration:none;
        }
        .menu{
        	width: 800px;
        	height:35px;
        	float: right;
        }
        
        .menu ul li{
        background-color: beige;
        list-style: none;
        float: left;
        line-height: 50px;
        text-align: center;
        }
        
        .menu a{
        	width:190px;
        	text-decoration:none;
        	display: block;
        	color: light blue;
        	font-weight:bold;
        }
        .menu a:hover{
        	background-color: lightblue;
        	color:black;
        }
    </style>
</head>
<div class="header">
	<div class="logo">
    	<h1> <a id="header" href="/"> CBS Team Project </a> </h1>
    </div>
	<nav>
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
	</nav>    
</div>
<hr>    	
