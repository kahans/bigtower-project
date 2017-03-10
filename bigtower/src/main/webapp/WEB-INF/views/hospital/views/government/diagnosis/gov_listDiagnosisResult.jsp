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
<h4>진단리스트</h4>
	<table border="1">
		<tr>
			<td>진단코드</td>
			<td>진료코드</td>
			<td>질병코드</td>
			<td>질병명</td>
			<td>수술일</td>
			<td>정부DB등록일</td>
			<td>병원명</td>
			<td>병원주소</td>
			<td>의사명</td>
			<td>환자명</td>
			<td>진료과목명</td>
		</tr>
		
		<c:forEach var="listDiagnosis" items="${listDiagnosis}">
			<tr>
				<td>${surgeryList.goDiagnosisCode}</td>
				<td>${surgeryList.goTreatCode}</td>
				<td>${surgeryList.goDiseaseCode}</td>
				<td>${surgeryList.goDiseaseKor}</td>
				<td>${surgeryList.goTreatmentWriteDate}</td>
				<td>${surgeryList.goDiagnosisGoRegistrationDate}</td>
				<td>${surgeryList.goHospitalName}</td>
				<td>${getSurgery.goHospitalAddress}</td>
				<td>${surgeryList.goDoctorName}</td>
				<td>${surgeryList.goCitizenName}</td>
				<td>${surgeryList.goTreatSubjectName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>