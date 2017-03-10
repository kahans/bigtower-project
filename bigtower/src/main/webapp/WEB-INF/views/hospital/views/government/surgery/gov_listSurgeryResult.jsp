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
<h4>수술리스트</h4>
	<a href="<c:url value='/government/getListTreatByCitizenId?citizenId=${citizenId}'/>"><button type="button">진료목록</button></a>
	<table border="1">
		<tr>
			<td>수술결과코드</td>
			<td>진료코드</td>
			<td>수술코드</td>
			<td>수술명</td>
			<td>병원명</td>
			<td>병원주소</td>
			<td>의사명</td>
			<td>환자명</td>
			<td>수술일</td>
			<td>정부DB등록일</td>
		</tr>
		
		<c:forEach var="surgeryList" items="${surgeryList}">
			<tr>
				<td>${surgeryList.goSurgeryResultCode}</td>
				<td>${surgeryList.goTreatCode}</td>
				<td>${surgeryList.goSurgeryCode}</td>
				<td>${surgeryList.goSurgeryName}</td>
				<td>${surgeryList.goHospitalName}</td>
				<td>${getSurgery.goHospitalAddress}</td>
				<td>${surgeryList.goDoctorName}</td>
				<td>${surgeryList.goCitizenName}</td>
				<td>${surgeryList.goSurgeryResultRegistrationDate}</td>
				<td>${surgeryList.goSurgeryResultGoRegistrationDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>