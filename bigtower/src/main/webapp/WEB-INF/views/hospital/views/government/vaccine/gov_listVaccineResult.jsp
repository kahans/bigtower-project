<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

<h4>예방접종 리스트</h4>
	<table border="1">
		<tr>
			<td>혈액검사</td>
			<td>진료코드</td>
			<td>혈당</td>
			<td>혈소판</td>
			<td>파일경로</td>
			<td>파일명</td>
			<td>검사일</td>
			<td>검사등록일</td>
			<td>병원명</td>
			<td>병원주소</td>
			<td>환자명</td>
			<td>의사명</td>
			<td>진료과목</td>
		</tr>
	
		<c:forEach var="getBloodTest" items="${getBloodTest}">
			<tr>
				<td>${getBloodTest.goBloodTestCode}</td> 
				<td>${getBloodTest.goTreatCode}</td>
				<td>${getBloodTest.goBloodTestBloodSugar}</td>
				<td>${getBloodTest.goBloodTestPlatelet}</td>
				<td>${getBloodTest.goBloodTestFilePath}</td>
				<td>${getBloodTest.goBloodTestFileName}</td>
				<td>${getBloodTest.goBloodTestDate}</td>
				<td>${getBloodTest.goBloodTestGoRegistrationDate}</td>
				<td>${getBloodTest.goHospitalName}</td>
				<td>${getBloodTest.goHospitalAddress}</td>
				<td>${getBloodTest.goCitizenName}</td>
				<td>${getBloodTest.goDoctorName}</td>
				<td>${getBloodTest.goTreatSubjectName}</td>
			</tr>
		</c:forEach>
	</table>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	