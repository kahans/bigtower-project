<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<h1>계산대기자 목록</h1>
	<table border="1">
		<thead>
			<tr>
			<th>환자명</th>
			<th>진료과</th>
			<th>방문목적</th>
			<th>접수일</th>
			<th>수납처리</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="payList" items="${payList}">
			<tr>
				
					<td>${payList.hoPatientName }</td>
					<td>${payList.hoTreatSubjectName }</td>
					<td>${payList.hoReceivePurpose }</td>
					<td>${payList.hoReceiveRegistrationDate }</td>
					<td><a href="<c:url value='/hospital/payComplete?hoReceiveCode=${payList.hoReceiveCode}'/>"><button>수납완료</button></a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value="/hospital/receiveList"/>">접수 현황</a>
	<a href="<c:url value="/hospital/treatList"/>">진료 현황</a>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
