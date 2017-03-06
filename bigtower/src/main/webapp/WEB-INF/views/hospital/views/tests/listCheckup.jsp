<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>건강검진 대기자 목록</h1>
	<table border="">
		<thead>
			<tr>
				<td>환자명</td>
				<td>검사요청코드</td>
				<td>진료코드</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="checkupList" items="${checkupList}">
				<tr>
					<td>
						<a href="<c:url value='/hospital/test/addCheckup?hoTestRequestCode=${checkupList.hoTestRequestCode }'/>">
						${checkupList.hoPatientName}</a></td>
					<td>${checkupList.hoTestRequestCode }</td>
					<td>${checkupList.hoTreatmentCode }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
</body>
</html>