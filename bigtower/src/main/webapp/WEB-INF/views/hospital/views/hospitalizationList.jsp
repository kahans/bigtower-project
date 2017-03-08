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
	<h1>입원 환자 목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>입원코드</th>
				<th>환자명</th>
				<th>진료코드</th>
				<th>입원일</th>
				<th>퇴원처리</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="hospitalizationList" items="${hospitalizationList}">
				<tr>				
					<td>${hospitalizationList.hoHospitalizationCode}</td>
					<td>${hospitalizationList.hoPatientName}</td>
					<td>${hospitalizationList.hoTreatmentCode}</td>
					<td>${hospitalizationList.hoHospitalizationStartDate}</td>
					<td>
						<a href="<c:url value='/hospital/updateHospitalization?'/>">
						<button>퇴원확인</button>
						</a>
					</td>
				
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='/hospital/treatList'/>"><button>진료목록</button></a>
</body>
</html>