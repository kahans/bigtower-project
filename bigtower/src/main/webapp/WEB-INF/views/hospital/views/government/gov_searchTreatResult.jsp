<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>gov_searchTreatResult.jsp</h1>
<h4>진료내용조회 결과</h4>

<a href="<c:url value='/government/getListBloodTestResultByCitizenId?citizenId=${citizenId}'/>"><button type="button">혈액검사</button></a>
<a href="<c:url value='/government/getListImageTestResultByCitizenId?citizenId=${citizenId}'/>"><button type="button">영상검사</button></a>
<a href="<c:url value='/government/getListCheckupResultByCitizenId?citizenId=${citizenId}'/>"><button type="button">건강검진</button></a>
<a href="<c:url value='/government/getListSurgeryByCitizenId?citizenId=${citizenId}'/>"><button type="button">수술내역</button></a>
<a href="<c:url value='/government/getListHospitalizationByCitizenId?citizenId=${citizenId}'/>"><button type="button">입원내역</button></a>

<c:forEach items="${getTreatList}" var="list">
	<div>
	진료코드	:	${list.goTreatCode} /
	</div>
	<div>
	병원아이디	:	${list.goHospitalId} /
	</div>
	<div>
	병원명 : ${list.goHospitalName }/
	</div>
	<div>
	환자ID	:	${list.goCitizenId} /
	</div>
	<div>
	환자명 :${list.goCitizenName} /
	</div>
	<div>
	의사ID	:	${list.goDoctorId} /
	</div>
	<div>
	의사명	:	${list.goDoctorName} /
	</div>
	<div>
	진료코드	:	${list.goTreatSubjectCode} / 
	</div>
	<div>
	진료과목명	:	${list.goTreatSubjectName} /
	</div>
	<div>
	차트코드	:	${list.goChartCode} / 
	</div>
	<div>
	진료내용	:	${list.goTreatContents} /
	</div>
	<div>
	진료등록일	:	${list.goTreatRegistrationDate} /
	</div>
	<div style="display: none;">
		<form id="citizenId" method="post">
				주민번호 : ${list.goCitizenId}
		</form>
	 </div>
</c:forEach>
	
</body>
</html>