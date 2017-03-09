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
<h1>gov_index.jsp</h1>

	<a href="<c:url value="/government/searchTreat"/>"><button>진료조회</button></a>
	<a href="<c:url value="/government/searchPrescription"/>"><button>처방</button></a>
	<a href="<c:url value="/government/searchDiagnosis"/>"><button>진단</button></a>
	<a href="<c:url value="/government/searchHospitalization"/>"><button>입퇴원</button></a>
	<a href="<c:url value="/government/searchSurgeryForm"/>"><button>수술</button></a>
	<a href="<c:url value="/government/searchTest"/>"><button>검사</button></a>

</body>
</html>