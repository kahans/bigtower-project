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
<h2>환자 조회</h2>
	<form action="<c:url value='/hospital/searchPatientTest'/>" method="post">
		
		주민번호<input type="text" id="idfirst" name="idfirst"> - <input type="password" id="idsecond" name="idsecond">
		<br>
		이름 <input type="text" id="hoPatientName" name="hoPatientName">
		<input type="submit" id="btn" name="btn">
	</form>
</body>
</html>