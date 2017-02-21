<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입/퇴원 조회 사이트</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>병원명</th>
				<th>입/퇴원 코드</th>
				<th>질병명</th>
				<th>입원일</th>
				<th>퇴원일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="goHospitalization" items="${goHospitalization}">
				<tr>
					<td>${goHospitalization.goHospitalName}</td>
					<td>${goHospitalization.goHospitalizationCode}</td>
					<td><c:forEach var="diagnosisList" items="${goHospitalization.diagnosisList}">${diagnosisList.goDiseaseKor}<br></c:forEach></td>
					<td>${goHospitalization.goHospitalizationEnterDate}</td>
					<td>${goHospitalization.goHospitalizationExitDate}</td>	
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>