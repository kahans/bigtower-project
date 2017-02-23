<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="/goImgTest" method="post">
		<!-- hidden에 로그인한 회원의 citizen_no를 조회해와서 값을 부여해줌 -->
		
		<input type="date" name="goFirstDate">-<input type="date" name="goSecondDate">
		기간입력
		<input type="submit" value="검색"/>
	</form>
</body>
</html>