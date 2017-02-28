<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	<h2>초기화면</h2>
	<c:if test="${HOSPITALCODE==null}">
		<a href="<c:url value="/hospital/login"/>">로그인</a>
	</c:if>
	
	<c:if test="${HOSPITALCODE!=null}">
		[${HOSPITALNAME} ${STAFFLEVELNAME} ${HOSTAFFNAME}님] 로그인중
		<a href="<c:url value="/hospital/logout"/>">로그아웃</a> <br>
		<a href="<c:url value="/hospital/searchPatient"/>">접수</a>		
		<a href="<c:url value="/hospital/receiveList"/>">접수목록</a>
		<a href="<c:url value="/hospital/logout"/>">진료</a> 
		<a href="<c:url value="/hospital/logout"/>">검사</a>
		
	</c:if>
	
</body>
</html>