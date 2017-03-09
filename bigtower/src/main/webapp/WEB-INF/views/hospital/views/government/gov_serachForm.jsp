<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>gov_searchForm</h1>
<h4>진료 조회</h4>
<h5>주민번호를 입력하세요.</h5>
<form action="<c:url value="/government/getSearchResult"/>" method="post">

	<input type="text" name="citizenId">
	<input type="submit" value="조회">
</form>
</body>
</html>