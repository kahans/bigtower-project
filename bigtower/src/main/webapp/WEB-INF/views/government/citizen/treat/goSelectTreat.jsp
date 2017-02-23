<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Treat View</title>
</head>
<body>
	<div class="container">
		<table border="1">
			<tr>
				<td>진료코드</td>
				<td>${Treat.goTreatCode}</td>			
			</tr>
			<tr>
				<td>병원명</td>
				<td>${Treat.goHospitalName}</td>
			</tr>
			<tr>
				<td>병원주소</td>
				<td>${Treat.goHospitalAddress}</td>
			</tr>
			<tr>
				<td>국민이름</td>
				<td>${Treat.goCitizenName}</td>
			</tr>
			<tr>
				<td>의사명</td>
				<td>${Treat.goDoctorName}</td>
			</tr>
			<tr>
				<td>진료과목</td>
				<td>${Treat.goTreatSubjectName}</td>
			</tr>
			<tr>
				<td>차트코드</td>
				<td>${Treat.goChartCode}</td>
			</tr>
			<tr>
				<td>질병명</td>
				<td>${Treat.goDiseaseKor}</td>
			</tr>
			<tr>
				<td>차트순번</td>
				<td>${Treat.goChartSeq}</td>
			</tr>
			<tr>
				<td>진료내용</td>
				<td>${Treat.goTreatContents}</td>
			</tr>
			<tr>
				<td>진료등록일</td>
				<td>${Treat.goTreatRegistrationDate}</td>
			</tr>
		</table>
		<a href="<c:url value='/government/treatList'/>"><button>목록</button></a>
	</div>
</body>
</html>