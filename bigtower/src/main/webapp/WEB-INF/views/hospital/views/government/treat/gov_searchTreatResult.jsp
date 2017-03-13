<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

	<h1>gov_searchTreatResult.jsp</h1>
	<h4>진료내용조회 결과</h4>

	<a href="<c:url value='/government/getListBloodTestResultByCitizenId?citizenId=${citizenId}'/>"><button type="button">혈액검사</button></a>
	<a href="<c:url value='/government/getListImageTestResultByCitizenId?citizenId=${citizenId}'/>"><button type="button">영상검사</button></a>
	<a href="<c:url value='/government/getListCheckupResultByCitizenId?citizenId=${citizenId}'/>"><button type="button">건강검진</button></a>
	<a href="<c:url value='/government/getListSurgeryByCitizenId?citizenId=${citizenId}'/>"><button type="button">수술내역</button></a>
	<a href="<c:url value='/government/getListHospitalizationByCitizenId?citizenId=${citizenId}'/>"><button type="button">입원내역</button></a>
	<a href="<c:url value='/government/getListDiagnosisByCitizenId?citizenId=${citizenId}'/>"><button type="button">진단</button></a>
	<a href="<c:url value='/government/getListPrescriptionByCitizenId?citizenId=${citizenId}'/>"><button type="button">처방</button></a>
	
	<table border="1">
		<tr>
			<td>진료코드</td>
			<td>병원아이디</td>
			<td>병원명</td>
			<td>환자ID</td>
			<td>환자명</td>
			<td>의사ID</td>
			<td>의사명</td>
			<td>진료과목코드</td>
			<td>진료과목명</td>
			<td>차트코드</td>
			<td>진료내용</td>
			<td>진료등록일</td>
		</tr>
		
		<c:forEach var="list" items="${getTreatList}">
			<tr>
				<td>${list.goTreatCode}</td>
				<td>${list.goHospitalId}</td>
				<td>${list.goHospitalName}</td>
				<td>${list.goCitizenId}</td>
				<td>${list.goCitizenName}</td>
				<td>${list.goDoctorId}</td>
				<td>${list.goDoctorName}</td>
				<td>${list.goTreatSubjectCode}</td>
				<td>${list.goTreatSubjectName}</td>
				<td>${list.goChartCode}</td>
				<td>${list.goTreatContents}</td>
				<td>${list.goTreatRegistrationDate}</td>
			</tr>
		</c:forEach>
	</table>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
