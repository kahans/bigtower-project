<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h4>예방접종 리스트</h4>
	<table border="1">
		<tr>
			<td>예방접종결과</td>
			<td>진료코드</td>
			<td>예방접종코드</td>
			<td>접종명</td>
			<td>접종 차수</td>
			<td>접종일</td>
			<td>정부등록일</td>
		</tr>
	
		<c:forEach var="vaccinList" items="${vaccinationList}">
			<tr>
				<td>${vaccinList.goVaccinationResultCode}</td> 
				<td>${vaccinList.goTreatCode}</td>
				<td>${vaccinList.goVaccinationCode}</td>
				<td>${vaccinList.goVaccinationName}</td>
				<td>${vaccinList.goVaccinationResultDegree}</td>
				<td>${vaccinList.goVaccinationResultRegistrationDate}</td>
				<td>${vaccinList.goVaccinationResultGoRegistrationDate}</td>
			</tr>
		</c:forEach>
	</table>
	