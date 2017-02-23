<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>정부 초기화면</title>
</head>
<body>
<h1>index.jsp</h1>
<h3>정부 초기화면</h3>
<c:choose>
	<c:when test="${FLAG==null}">
		<a href="<c:url value="/government/login"/>">로그인</a>
	</c:when>
	<c:when test="${FLAG == 'citizen'}">
		국민 로그인성공<br>
		${GOCITIZENNAME} 님 로그인중 <a href="<c:url value="/government/logout"/>">로그아웃</a><br>
		
		<a href="<c:url value="/government/goTest"/>">검사</a>
		<a href="<c:url value="/government/treatList"/>">진료</a>
		<a href="<c:url value="/government/surgeryList"/>">수술</a>
		<a href="<c:url value="/government/hospitalizationList"/>">입원</a>
		<br>
	</c:when>
	<c:when test="${FLAG=='hospital'}">
		병원 로그인성공<br>
		${GOHOSPITALNAME} 님 로그인중 <a href="<c:url value="/government/logout"/>">로그아웃</a>
	</c:when>
</c:choose>
</body>
</html>