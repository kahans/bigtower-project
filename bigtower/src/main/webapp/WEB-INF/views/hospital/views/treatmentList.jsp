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
<h1>진료 목록</h1>
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
		<c:forEach var="DiagnosisList" items="${diagnosisList}">
			<tr>
				
					<td>${DiagnosisList.hoPatientName }</td>
					<td>${DiagnosisList.hoTreatSubjectName }</td>
					<td>${DiagnosisList.hoReceivePurpose }</td>
					<td>${DiagnosisList.hoReceiveRegistrationDate }</td>
					<td><a href="<c:url value='/hospital/receiveStateAcceptance?hoReceiveCode=${DiagnosisList.hoReceiveCode}'/>">${DiagnosisList.hoReceiveStateName }</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value="/hospital/receiveList"/>">접수 현황</a>
	<a href="<c:url value="/hospital/sumReceive"/>">수납 현황</a>
</body>
</html>