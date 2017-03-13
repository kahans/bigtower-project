<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

<h1>건강검진 결과대기 목록</h1>
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
			<c:forEach var="checkupList" items="${checkupList}">
				<tr>
					<td>
						<a href="<c:url value='/hospital/test/addCheckup?hoTestRequestCode=${checkupList.hoTestRequestCode }'/>">
						${checkupList.hoPatientName}</a></td>
					<td>${checkupList.hoTestRequestCode }</td>
					<td>${checkupList.hoTreatmentCode }</td>
					<td>${checkupList.hoTestStateName }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
	<a href="<c:url value='/hospital/test/listCheckup'/>"><button>검진 대기목록</button></a>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	