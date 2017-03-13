<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

	<h1>수술인원 목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>진료코드</th>
				<th>환자명</th>
				<th>수술명</th>
				<th>수술예정일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="operationList" items="${operationList}">
				<tr>				
					<td>
						<a href="<c:url value='/hospital/operationView?hoOperationCode=${operationList.hoOperationCode }'/>">
							${operationList.hoTreatmentCode }
						</a>
					</td>
					<td>${operationList.hoPatientName }</td>
					<td>${operationList.hoOperationTypeName }</td>
					<td>${operationList.hoOperationStartDate }</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='/hospital/treatList'/>"><button>진료 목록</button></a>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	