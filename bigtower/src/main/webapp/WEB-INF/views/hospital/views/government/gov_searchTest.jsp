<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>gov_searchTest.jsp</h1>

	<a href="<c:url value="/government/searchBloodTest"/>"><button>혈액검사결과조회</button></a>
	<a href="<c:url value='/government/searchMediaTest'/>"><button>영상검사결과조회</button></a> 
	<%--<a href="<c:url value='/government/searchCheckup'/>"><button>건강검진결과조회</button></a> --%>
	<a href="<c:url value='/government/'/>"><button>정부화면</button></a>
</body>
</html>