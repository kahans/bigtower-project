<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>진단 조회</title>
</head>
<body>
	<form action="<c:url value='/government/getListDiagnosisByTreatCode'/>" method="post">
		진료코드 : <input type="text" name="treatCode">
		<input type="submit" value="조회">
	</form>
	
	
</body>
</html>