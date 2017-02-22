<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>혈액검사 요청페이지</title>
</head>
<body>
		
	<form action="/goBloodTest" method="post">
		<!-- hidden에 로그인한 회원의 citizen_no를 조회해와서 값을 부여해줌 -->
		<input type="hidden" name="goCitizenId" value="900101-1000002"/>
		<input type="date" name="goFirstDate">-<input type="date" name="goSecondDate">
		기간입력
		<input type="submit" value="검색"/>
	</form>
</body>
</html>