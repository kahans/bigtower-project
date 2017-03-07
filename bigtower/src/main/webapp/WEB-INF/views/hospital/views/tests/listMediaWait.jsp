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
	<h1>영상촬영 결과대기 목록</h1>
	<table border="">
		<thead>
			<tr>
				<td>환자명</td>
				<td>검사요청코드</td>
				<td>진료코드</td>
				<td>상태</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="mediaList" items="${mediaList}">
				<tr>
					<td>
						<a href="<c:url value='/hospital/test/addMediaTest?hoTestRequestCode=${mediaList.hoTestRequestCode}'/>">
						${mediaList.hoPatientName}</a></td>
					<td>${mediaList.hoTestRequestCode}</td>
					<td>${mediaList.hoTreatmentCode}</td>
					<td>${mediaList.hoTestStateName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
	<a href="<c:url value='/hospital/test/listMediaTest'/>"><button>영상검사대기목록</button></a>
</body>
</html>