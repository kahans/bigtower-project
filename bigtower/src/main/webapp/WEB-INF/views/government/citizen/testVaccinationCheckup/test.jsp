<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../index.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>정부 검사페이지</title>
</head>
<body>
	
	<a href="<c:url value='/government/goBloodTest'/>">혈액검사결과페이지</a>
	<a href="<c:url value='/government/goImageTest'/>">영상검사결과페이지</a>
	<a href="<c:url value='/government/vaccination'/>">예방접종결과페이지</a>
	<a href="<c:url value='/government/checkUp'/>">건강검진결과페이지</a>
	
</body>
</html>