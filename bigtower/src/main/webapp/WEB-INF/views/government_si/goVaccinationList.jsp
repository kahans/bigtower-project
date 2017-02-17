<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>진료코드</td>
			<td>예방접종명</td>
			<td>예방접종 현재차수</td>
			<td>예방접종 최종차수</td>
			<td>예방접종 결과등록일</td>
		</tr>
		<c:forEach items="${vaccinationList}" var="vaccinationList">
			<tr>
				<td>${vaccinationList.goTreatCode}</td>
				<td>${vaccinationList.goVaccinationName}</td>
				<td>${vaccinationList.goVaccinationResultDegree}</td>
				<td>${vaccinationList.goVaccinationDegree}</td>
				<td>${vaccinationList.goVaccinationResultRegistrationDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>