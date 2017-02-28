<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login.jsp</h1>
	<h2>병원 로그인화면2</h2>
	
	<form action="<c:url value="/hospital/login"/>" method="post">
		<div>
			ID &nbsp;<input type="text" name="hoStaffId" placeholder="아이디" value="id001">
		</div>
		<div>
			PW <input type="password" name="hoStaffPw" placeholder="비밀번호" value="pw001">
		</div>
		<input type="submit" value="로그인">
	</form>
</body>
</html>