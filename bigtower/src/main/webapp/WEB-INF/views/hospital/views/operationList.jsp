<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수술인원 목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>진료코드</th>
				<th>환자명</th>
				<th>수술명</th>
				<th>수술예정일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="operationList" items="${operationList}">
				<tr>				
					<td>
						<a href="<c:url value='/hospital/operationView?hoOperationCode=${operationList.hoOperationCode }'/>">
							${operationList.hoTreatmentCode }
						</a>
					</td>
					<td>${operationList.hoPatientName }</td>
					<td>${operationList.hoOperationTypeName }</td>
					<td>${operationList.hoOperationStartDate }</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>