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
	<form action="<c:url value='/hospital/searchPatient'/>" method="post">
		<h4>환자 정보가 없을 시 환자등록 화면으로 이동</h3>
		<div>
			주민번호 : <input type="text" id="idfirst" name="idfirst" value="900101"> - 
			<input type="text" id="idsecond" name="idsecond" value="1000001">
		</div>
		<br>
		<div>
			이름 : <input type="text" id="hoPatientName" name="hoPatientName" value="도우너">
		</div>
		<input type="submit" id="btn" name="btn">
	</form>
</body>
</html>