<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>예방접종 요청</title>
</head>
<body>

		<form action="<c:url value='/governmentYJ/vaccination'/>" method="post">
		<!-- hidden에 로그인한 회원의 citizen_no를 조회해와서 값을 부여해줌 -->
		<input type="hidden" name="goCitizenId" value="${goCitizenId}"/>goCheckup
		<input type="date" name="firstDate">-<input type="date" name="secondDate">
		기간입력
		<input type="submit" value="검색"/>
	</form>
</body>
</html>