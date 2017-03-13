<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

<h1>혈액 검사 결과 대기목록</h1>
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
						<a href="<c:url value='/hospital/test/addBloodTest?hoTestRequestCode=${bloodList.hoTestRequestCode }'/>">
						${bloodList.hoPatientName}</a></td>
					<td>${bloodList.hoTestRequestCode }</td>
					<td>${bloodList.hoTreatmentCode }</td>
					<td>${bloodList.hoTestStateName }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
	<a href="<c:url value='/hospital/test/ListBloodTest'/>"><button>혈액검사대기목록</button></a>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	