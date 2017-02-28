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
	<table>
		<thead>
			<tr>
			<th>환자명</th>
			<th>진료과</th>
			<th>접수일</th>
			<th>접수상태</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<c:forEach var="ReceiveList" items="${receiveList}">
					<td>${ReceiveList.hoPatientName }</td>
					<td>${ReceiveList.hoTreatSubjectName }</td>
					<td>${ReceiveList.hoReceiveRegistrationDate }</td>
					<td>${ReceiveList.hoReceiveStateName }</td>
				</c:forEach>
			</tr>
		</tbody>
	</table>

</body>
</html>