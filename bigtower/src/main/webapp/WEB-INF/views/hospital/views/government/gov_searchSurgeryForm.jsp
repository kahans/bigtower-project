<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>수술 조회</h1>
	<form action="<c:url value='/government/getOneSurgeryByTreatCode'/>" method="post">
		차트코드로 조회
		<input type="text" name="treatCode"/>
		<input type="submit" value="조회">
	</form>
	<br/>
	<form action="<c:url value='/government/getListSurgeryByCitizenId'/>" method="post">
		주민번호로 조회
		<input type="text" name="citizenId"/>
		<input type="submit" value="조회">
	</form>
	<br/>
	<form action="<c:url value='/government/getListSurgeryByCitizenId'/>" method="post">
		의사아이디로 조회
		<input type="text" name="doctorId"/>
		<input type="submit" value="조회">
	</form>
</body>
</html>