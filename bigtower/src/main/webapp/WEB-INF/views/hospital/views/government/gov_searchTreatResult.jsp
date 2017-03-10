<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" charset="UTF-8">
	function blood(){
		document.citizenId.action="<%=request.getContextPath()%>/government/getListBloodTestResultByCitizenId"
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>gov_searchTreatResult.jsp</h1>
<h4>진료내용조회 결과</h4>
<button type="button" onclick="">혈액검사</button>
<button type="button">영상검사</button> 
<button type="button">건강검진</button> 
<button type="button">수술내역</button> 
<button type="button">입원내역</button>  
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
</c:forEach>
<form id="citizenId" style="display: none;">
	<div>
		주민번호 : ${getTreatList.goCitizenId}
	</div>
</form>
 
</body>
</html>