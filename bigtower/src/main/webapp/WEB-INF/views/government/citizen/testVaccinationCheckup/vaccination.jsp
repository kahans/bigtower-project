<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../index.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>예방접종 요청</title>
</head>
<body>

		<form action="<c:url value='/government/vaccination'/>" method="post">
		
		
		기간입력
		<input type="date" name="firstDate">-<input type="date" name="secondDate">
		
		<br/>병원명 입력
			<input type="text" name="gohspitalName"/>
		
		<br/>의사명 입력
			<input type="text" name="goDoctorName"/>
		
		<br/>
			<input type="submit" value="검색"/>
	</form>
</body>
</html>