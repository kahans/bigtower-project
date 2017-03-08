<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="templates/government/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="templates/government/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="templates/government/plugins/cubeportfolio/css/cubeportfolio.min.css">
<link href="templates/government/css/nivo-lightbox.css" rel="stylesheet" />
<link href="templates/government/css/nivo-lightbox-theme/default/default.css" rel="stylesheet" type="text/css" />
<link href="templates/government/css/owl.carousel.css" rel="stylesheet" media="screen" />
<link href="templates/government/css/owl.theme.css" rel="stylesheet" media="screen" />
<link href="templates/government/css/animate.css" rel="stylesheet" />
<link href="templates/government/css/style.css" rel="stylesheet">
<link id="bodybg" href="templates/government/bodybg/bg1.css" rel="stylesheet" type="text/css" />
<!-- template skin -->
<link id="t-colors" href="templates/government/color/default.css" rel="stylesheet">
   

</head>
<body>
<div class="collapse navbar-collapse navbar-right navbar-main-collapse">
	<ul class="nav navbar-nav">
		<li class="active"><a href="<c:url value='/hospital/'/>">Home</a></li>
		<li><a href="<c:url value='/hospital/test'/>">전체목록</a></li>
		<li><a href="<c:url value='/hospital/test/listBloodWait'/>">결과대기목록</a></li>
		<!-- 로그인 하는 페이지로 이동 -->
		<c:if test="${HOSPITALCODE==null}">
			<li class="login">
				<a href="<c:url value="/hospital/login"/>">로그인</a>
			</li>
		</c:if>
	
		<c:if test="${HOSPITALCODE!=null}">
			[${HOSPITALNAME} ${STAFFLEVELNAME} ${HOSTAFFNAME}님] 로그인중
			<li class="logout">
				<a href="<c:url value='/hospital/logout'/>"><button>로그아웃</button></a> <br>
			</li>
			<%-- <a href="<c:url value='/hospital/searchPatient'/>"><button>접수</button></a>
			<a href="<c:url value='/hospital/receiveList'/>"><button>접수 목록</button></a>
			<a href="<c:url value='/hospital/treatList'/>"><button>진료 목록</button></a> 
			<a href="<c:url value='/hospital/test'/>"><button>검사요청 목록</button></a>
			<a href="<c:url value='/hospital/operationList'/>"><button>수술 목록</button></a>
			<a href="<c:url value='/government/'/>"><button>정부</button></a> --%>
		</c:if>
		
	</ul>
</div>
<h1>혈액 검사 대기 목록</h1>
	<table border="">
		<thead>
			<tr>
				<td>환자명</td>
				<td>검사요청코드</td>
				<td>진료코드</td>
				<td>상태</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bloodList" items="${bloodList}">
				<tr>
					<td>
						<a href="<c:url value='/hospital/test/updateBloodState?hoTestRequestCode=${bloodList.hoTestRequestCode }'/>">
						${bloodList.hoPatientName}</a></td>
					<td>${bloodList.hoTestRequestCode }</td>
					<td>${bloodList.hoTreatmentCode }</td>
					<td>${bloodList.hoTestStateName }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<%-- <a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
	<a href="<c:url value='/hospital/test/listBloodWait'/>"><button>결과대기목록</button></a> --%>
</body>
</html>