<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

<h1>진료 대기자 목록</h1>
	<table border="1">
		<thead>
			<tr>
			<th>환자명</th>
			<th>진료과</th>
			<th>의사명</th>
			<th>접수일</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="treat" items="${treatList}">
			<tr>
				
					<td><a href="<c:url value='/hospital/treatView?hoTreatmentCode=${treat.hoTreatmentCode}'/>">${treat.hoPatientName }</a></td>
					<td>${treat.hoTreatSubjectName }</td>
					<td>${treat.hoDoctorName }</td>			
					<td>${treat.hoTreatmentWriteDate }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='/hospital/receiveList'/>"><button>접수현황</button></a>
	<a href="<c:url value='/hospital/payList'/>"><button>수납현황</button></a>
	<a href="<c:url value='/hospital/operationList'/>"><button>수술목록</button></a>
	<a href="<c:url value='/hospital/test'/>"><button>검사</button></a>
	<a href="<c:url value='/hospital/hospitalizationRequestList'/>"><button>입퇴원요청 목록</button></a>
	<a href="<c:url value='/hospital/hospitalizationList'/>"><button>입원환자 목록</button></a>
	<a href="<c:url value='/hospital/'/>"><button>메인화면</button></a>
	
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	