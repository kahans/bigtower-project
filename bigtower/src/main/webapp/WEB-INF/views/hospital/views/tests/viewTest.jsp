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
	<h1>검사 종류</h1>
	<a href="<c:url value='/hospital/test/ListBloodTest'/>">혈액 검사</a>
	<a href="<c:url value='/hospital/test/listMediaTest'/>">영상 검사</a>
	<a href="<c:url value='/hospital/test/listCheckup'/>">건강 검사</a>
</body>
</html>