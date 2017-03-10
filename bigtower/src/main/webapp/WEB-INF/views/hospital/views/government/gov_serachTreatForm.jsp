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
<h1>gov_searchForm</h1>
<h4>진료 조회</h4>
<h5>주민번호로 조회</h5>
<form action="<c:url value="/government/getListTreatByCitizenId"/>" method="post">

	<input type="text" name="citizenId">
	<input type="submit" value="조회">
</form>
<br><br><br>
<form action="getListTreatByDoctorId">
	<input type="submit" value="내 환자 진료목록조회"/>
</form>
</body>
</html>