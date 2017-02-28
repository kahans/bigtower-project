<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>계산대기자 목록</h1>
	<table border="1">
		<thead>
			<tr>
			<th>환자명</th>
			<th>진료과</th>
			<th>방문목적</th>
			<th>접수일</th>
			<th>접수상태</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="acceptanceList" items="${acceptanceList}">
			<tr>
				
					<td>${acceptanceList.hoPatientName }</td>
					<td>${acceptanceList.hoTreatSubjectName }</td>
					<td>${acceptanceList.hoReceivePurpose }</td>
					<td>${acceptanceList.hoReceiveRegistrationDate }</td>
					<td><a href="<c:url value='/hospital/receiveStateAcceptance?hoReceiveCode=${acceptanceList.hoReceiveCode}'/>">${acceptanceList.hoReceiveStateName }</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value="/hospital/receiveList"/>">접수 현황</a>
	<a href="<c:url value="/hospital/treatList"/>">진료 현황</a>
</body>
</html>