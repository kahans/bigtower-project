<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/government/gov_searchButton.jsp" %>

<h4>영상검사리스트</h4>
<a href="<c:url value='/government/getListTreatByCitizenId?citizenId=${citizenId}'/>"><button type="button">진료목록</button></a>
<table border="1">
	<tr>
		<td>영상검사</td>
		<td>진료코드</td>
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
	
	<c:forEach var="getMediaTest" items="${getMediaTest}">
		<tr>
			<td>${getMediaTest.goImageTestCode}</td>
			<td>${getMediaTest.goTreatCode}</td>
			<td>${getMediaTest.goImageTestFilePath}</td>
			<td>${getMediaTest.goImageTestFileName}</td>
			<td>${getMediaTest.goImageTestDate}</td>
			<td>${getMediaTest.goImageTestGoRegistrationDate}</td>
			<td>${getMediaTest.goHospitalName}</td>
			<td>${getMediaTest.goHospitalAddress}</td>
			<td>${getMediaTest.goCitizenName}</td>
			<td>${getMediaTest.goDoctorName}</td>
			<td>${getMediaTest.goTreatSubjectName}</td> 
		</tr>
	</c:forEach>
</table>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
