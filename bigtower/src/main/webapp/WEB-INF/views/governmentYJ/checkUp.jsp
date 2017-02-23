<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>건강검진 요청페이지</title>
</head>
<body>

	<form action="<c:url value="/governmentYJ/checkUp"/>" method="post">
		<input type="hidden" name="goCitizenId" value="900101-1000001"/>
		<input type="date" name="firstDate"/>-<input type="date" name="secondDate"/>
		기간입력
		<input type="submit" value="검색">
		
	</form>
</body>
</html>