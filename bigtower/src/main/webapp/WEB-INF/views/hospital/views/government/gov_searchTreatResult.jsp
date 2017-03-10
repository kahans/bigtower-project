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

<c:forEach items="${getTreatList}" var="list">
	<div>
	진료코드	:	${list.goTreatCode} /
	</div>
	<div>
	병원아이디	:	${list.goHospitalId} /
	</div>
	<div>
	환자ID	:	${list.goCitizenId} /
	</div>
	<div>
	의사ID	:	${list.goDoctorId} /
	</div>
	<div>
	진료과목	:	${list.goTreatSubjectCode} /
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
	<div>
	정부DB등록일	:	${list.goTreatGoRegistrationDate}
	</div>
</c:forEach>
<!-- 	 <a href="" <button type="button" ></button></a> --> 
</body>
</html>