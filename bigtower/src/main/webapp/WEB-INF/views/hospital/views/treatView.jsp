<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form action="<c:url value='/hospital/treatView'/>" method="post">
		<table>
			<tr>
				<td>의사명</td>
				<td></td>
			</tr>
			<tr>
				<td>차트번호</td>
				<td></td>
			</tr>
			<tr>
				<td>환자명</td>
				<td></td>
			</tr>
			<tr>
				<td>진료과목</td>
				<td></td>
			</tr>
			<tr>
				<td>진료내용</td>
				<td></td>
			</tr>
		</table>
		<input type="submit" value="완료">
	</form>
	
	<form action="<c:url value='/hospital/testRequest'/>" method="post">
		<select>
			<option>:::선택하시오:::</option>
			<option></option>
		</select>
		<input type="submit" value="검사요청"> 
	</form>
	
	<form action="<c:url value='/hospital/hospitalizationRequest'/>" method="post">
		<input type="submit" value="입퇴원요청"> 
	</form>
	<a href="<c:url value='/hospital/surgery'/>"><button>수술</button></a>
	<a href="<c:url value='/hospital/prescription'/>"><button>처방</button></a>
	
</body>
</html>