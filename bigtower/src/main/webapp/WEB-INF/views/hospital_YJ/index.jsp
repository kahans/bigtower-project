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
	
	<a href="<c:url value="/hospital/login"/>">로그인</a>
	${hospitalCode}
	<c:if test="${hospitalCode!=null}">
		세션:<br>
			병원코드 : [${hospitalCode}]
			직급 : [${staffLevelCode}]
			이름 : [${hoStaffName}]
			
	</c:if>
	
</body>
</html>