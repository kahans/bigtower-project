<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
	<div align="center" class="container">
		<h1>수술인원 목록</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>진료코드</th>
					<th>환자명</th>
					<th>수술명</th>
					<th>수술예정일</th>
					<th>수술일지등록</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="operationList" items="${operationList}">
					<tr>				
						<td>
							
								${operationList.hoTreatmentCode }
							
						</td>
						<td>${operationList.hoPatientName }</td>
						<td>${operationList.hoOperationTypeName }</td>
						<td>${operationList.hoOperationStartDate }</td>
						<td><a href="<c:url value='/hospital/operationView?hoOperationCode=${operationList.hoOperationCode }'/>">
						<button type="button">수술일지등록</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	