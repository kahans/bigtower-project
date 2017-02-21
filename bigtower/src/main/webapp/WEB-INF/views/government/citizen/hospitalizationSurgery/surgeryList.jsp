<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입/퇴원 수술 내역 조회사이트</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>병원명</th>
				<th>의사명</th>
				<th>수술코드</th>
				<th>수술명</th>
				<th>수술일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="goSurgery" items="${goSurgery}">
				<tr>
					<td>${goSurgery.goHospitalName}</td>
					<td>${goSurgery.goDoctorName}</td>
					<td>${goSurgery.goSurgeryResultCode}</td>
					<td>${goSurgery.goSurgeryName}</td>
					<td>${goSurgery.goSurgeryResultGoRegistrationDate}</td>	
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>