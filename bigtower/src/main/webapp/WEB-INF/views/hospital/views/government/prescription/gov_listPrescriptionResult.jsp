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
<h4>처방리스트</h4>
	<a href="<c:url value='/government/getListTreatByCitizenId?citizenId=${citizenId}'/>"><button type="button">진단</button></a>
	<table border="1">
		<tr>
			<td>처방결과코드</td>
			<td>진료코드</td>
			<td>약품코드</td>
			<td>1일투약횟수</td>
			<td>1회투여량</td>
			<td>총투약일수</td>
			<td>용법</td>
			<td>처방작성일자</td>
			<td>정부DB등록일</td>
			<td>병원코드</td>
			<td>병원명</td>
			<td>환자이름</td>
			<td>의사명</td>
			<td>진료과목명</td>
			
		</tr>
		
		<c:forEach var="listPrescription" items="${listPrescription}">
			<tr>
				<td>${listPrescription.goPrescriptionResultCode}</td>
				<td>${listPrescription.goTreatCode}</td>
				<td>${listPrescription.goMedicineCode}</td>
				<td>${listPrescription.goPrescriptionResultInjectionNumber}</td>
				<td>${listPrescription.goPrescriptionResultDosage}</td>
				<td>${listPrescription.goPrescriptionResultUsage}</td>
				<td>${listPrescription.goPrescriptionResultTotalDate}</td>
				<td>${listPrescription.goPrescriptionResultWriteDate}</td>
				<td>${listPrescription.goPrescriptionResultGoRegistrationDate}</td>
				<td>${listPrescription.goHospitalName}</td>
				<td>${listPrescription.goHospitalAddress}</td>
				<td>${listPrescription.goCitizenName}</td>
				<td>${listPrescription.goDoctorName}</td>
				<td>${listPrescription.goTreatSubjectName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>