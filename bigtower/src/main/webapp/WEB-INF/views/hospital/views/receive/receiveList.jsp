<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<h1>대기자 목록</h1>
	<table border="1">
		<thead>
			<tr>
			<th>환자명</th>
			<th>진료과</th>
			<th>방문목적</th>
			<th>접수일</th>
			<th>접수상태</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="ReceiveList" items="${receiveList}">
			<tr>				
				<td>${ReceiveList.hoPatientName }</td>
				<td>${ReceiveList.hoTreatSubjectName }</td>
				<td>${ReceiveList.hoReceivePurpose }</td>
				<td>${ReceiveList.hoReceiveRegistrationDate }</td>
				<td><a href="<c:url value='/hospital/addTreat?
											hoPatientCode=${ReceiveList.hoPatientCode}&
											hoReceiveCode=${ReceiveList.hoReceiveCode}&
											hoTreatSubjectCode=${ReceiveList.hoTreatSubjectCode}'/>">
					${ReceiveList.hoReceiveStateName }</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value="/hospital/treatList"/>"><button>진료 목록</button></a>
	<a href="<c:url value="/hospital/payList"/>"><button>수납 목록</button></a>
	
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
