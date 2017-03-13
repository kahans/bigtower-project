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
<h3>건강검진리스트</h3>
	<a href="<c:url value='/government/getListTreatByCitizenId?citizenId=${citizenId}'/>"><button type="button">진료목록</button></a>
	<table border="1">
		<tr>
			<td>건강검진결과코드</td>
			<td>진료코드</td>
			<td>파일경로</td>
			<td>파일명</td>
			<td>결과등록일</td>
			<td>정부등록일</td>
			<td>병원명</td>
			<td>병원주소</td>
			<td>환자명</td>
			<td>의사명</td>
			<td>진료과목</td>
		</tr>
	
		<c:forEach var="goCheckupResult" items="${goCheckupResult}">
			<tr>
				<td>${goCheckupResult.goCheckupResultCode}</td> 
				<td>${goCheckupResult.goTreatCode}</td>
				<td>${goCheckupResult.goCheckupResultFilePath}</td>
				<td>${goCheckupResult.goCheckupResultFileName}</td>
				<td>${goCheckupResult.goCheckupResultRegistrationDate}</td>
				<td>${goCheckupResult.goCheckupResultGoRegistrationDate}</td>
				<td>${goCheckupResult.goHospitalName}</td>
				<td>${goCheckupResult.goHospitalAddress}</td>
				<td>${goCheckupResult.goCitizenName}</td>
				<td>${goCheckupResult.goDoctorName}</td>
				<td>${goCheckupResult.goTreatSubjectName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>