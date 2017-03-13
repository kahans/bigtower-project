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
<h4>입/퇴원 리스트</h4>
	<a href="<c:url value='/government/getListTreatByCitizenId?citizenId=${citizenId}'/>"><button type="button">진료목록</button></a>
	<table border="1">
		<tr>
			<td>입퇴원코드</td>
			<td>진료코드</td>
			<td>입원일자</td>
			<td>퇴원일자</td>
			<td>병원명</td>
			<td>병원주소</td>
			<td>의사명</td>
			<td>환자명</td>
			<td>진료과목</td>
		</tr>
		
		<c:forEach var="hospitalizationList" items="${hospitalizationList}">
			<tr>
				<td>${hospitalizationList.goHospitalizationCode}</td>
				<td>${hospitalizationList.goTreatCode}</td>
				<td>${hospitalizationList.goHospitalizationEnterDate}</td>
				<td>${hospitalizationList.goHospitalizationExitDate}</td>
				<td>${hospitalizationList.goHospitalName}</td>
				<td>${hospitalizationList.goHospitalAddress}</td>
				<td>${hospitalizationList.goDoctorName}</td>
				<td>${hospitalizationList.goCitizenName}</td>
				<td>${hospitalizationList.goTreatSubjectName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>