<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/government/gov_searchButton.jsp" %>

<h4>진단리스트</h4>
	<a href="<c:url value='/government/getListTreatByCitizenId?citizenId=${citizenId}'/>"><button type="button">진료목록</button></a>
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
				<td>${listDiagnosis.goDiagnosisCode}</td>
				<td>${listDiagnosis.goTreatCode}</td>
				<td>${listDiagnosis.goDiseaseCode}</td>
				<td>${listDiagnosis.goDiseaseKor}</td>
				<td>${listDiagnosis.goTreatmentWriteDate}</td>
				<td>${listDiagnosis.goDiagnosisGoRegistrationDate}</td>
				<td>${listDiagnosis.goHospitalName}</td>
				<td>${listDiagnosis.goHospitalAddress}</td>
				<td>${listDiagnosis.goDoctorName}</td>
				<td>${listDiagnosis.goCitizenName}</td>
				<td>${listDiagnosis.goTreatSubjectName}</td>
			</tr>
		</c:forEach>
	</table>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
