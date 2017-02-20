<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>혈액검사 요청페이지</title>
</head>
<body>
	
	<form action="/goBloodTest" method="post">
		<input type="date" name="goFirstDate">-<input type="date" name="goSecondDate">
		기간입력
		<input type="submit" value="검색"/>
	
	</form>
</body>
</html>