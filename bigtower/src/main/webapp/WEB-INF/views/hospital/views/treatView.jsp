<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form action="<c:url value='/hospital/treatView'/>" method="post">
		<div>
			의사명 :
			<input type="text" value="${hoTreat.hoDoctorName}">
		</div>
		<div>
			차트번호 :
			<input type="text" value="${hoTreat.hoChartCode}">
		</div>
		<div>
			환자명 :
			<input type="text" value="${hoTreat.hoPatientName}">
		</div>
		<div>
			진료과목 :
			<input type="text" value="${hoTreat.hoTreatSubjectName}">
		</div>
			진료내용 
		<div>	
			<textarea rows="10" cols="50" name="hoTreatmentContents">
			</textarea>
		</div>
		<input type="submit" value="완료">
	</form>
	
	<form action="<c:url value='/hospital/testRequest'/>" method="post">
		<select>
			<option>:::선택하시오:::</option>
			<option></option>
		</select>
		<input type="submit" value="검사요청"> 
	</form>
	
	<form action="<c:url value='/hospital/hospitalizationRequest'/>" method="post">
		<input type="submit" value="입퇴원요청"> 
	</form>
	<a href="<c:url value='/hospital/surgery'/>"><button>수술</button></a><br>
	<a href="<c:url value='/hospital/prescription'/>"><button>처방</button></a>
	
</body>
</html>