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

<c:forEach items="${treatList}" var="list">
	${list.goTreatCode} /
	${list.goHospitalId} /
	${list.goCitizenId} /
	${list.goDoctorId} /
	${list.goTreatSubjectCode} /
	${list.goChartCode} / 
	${list.goChartSeq} /
	${list.goTreatContents} /
	${list.goTreatRegistrationDate} /
	${list.goTreatGoRegistrationDate}
	
</c:forEach>
</body>
</html>