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

<form action="<c:url value="/government/getSearchResult"/>" method="post">
	<input type="text" name="citizenId">
	<input type="submit" value="조회">
</form>
</body>
</html>