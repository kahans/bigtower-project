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
	<h1>index.jsp</h1>
	<h2>초기화면</h2>
	<c:if test="${HOSPITALCODE==null}">
		<a href="<c:url value="/hospital/login"/>">로그인</a>
	</c:if>
	
	<c:if test="${HOSPITALCODE!=null}">
		[${HOSPITALNAME} ${STAFFLEVELNAME} ${HOSTAFFNAME}님] 로그인중
		<a href="<c:url value='/hospital/logout'/>"><button>로그아웃</button></a> <br>
		<a href="<c:url value='/hospital/searchPatient'/>"><button>접수</button></a>
		<a href="<c:url value='/hospital/receiveList'/>"><button>접수 목록</button></a>
		<a href="<c:url value='/hospital/treatList'/>"><button>진료 목록</button></a> 
		<a href="<c:url value='/hospital/test'/>"><button>검사요청 목록</button></a>
		<a href="<c:url value='/hospital/operationList'/>"><button>수술 목록</button></a>
		
		<a href="<c:url value='/government/'/>"><button>정부</button></a>
		
	</c:if>
	
</body>
</html>