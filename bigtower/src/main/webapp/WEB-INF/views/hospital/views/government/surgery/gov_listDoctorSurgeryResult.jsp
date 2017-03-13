<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<h4>수술리스트</h4>
	<table border="1">
		<tr>
			<td>수술결과코드</td>
			<td>진료코드</td>
			<td>수술코드</td>
			<td>수술명</td>
			<td>병원명</td>
			<td>병원주소</td>
			<td>의사명</td>
			<td>환자명</td>
			<td>수술일</td>
			<td>정부DB등록일</td>
		</tr>
		
		<c:forEach var="surgeryList" items="${surgeryList}">
			<tr>
				<td>${surgeryList.goSurgeryResultCode}</td>
				<td>${surgeryList.goTreatCode}</td>
				<td>${surgeryList.goSurgeryCode}</td>
				<td>${surgeryList.goSurgeryName}</td>
				<td>${surgeryList.goHospitalName}</td>
				<td>${getSurgery.goHospitalAddress}</td>
				<td>${surgeryList.goDoctorName}</td>
				<td>${surgeryList.goCitizenName}</td>
				<td>${surgeryList.goSurgeryResultRegistrationDate}</td>
				<td>${surgeryList.goSurgeryResultGoRegistrationDate}</td>
			</tr>
		</c:forEach>
	</table>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	