<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
	<h1>입원 환자 목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>입원코드</th>
				<th>환자명</th>
				<th>진료코드</th>
				<th>입원일</th>
				<th>퇴원처리</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="hospitalizationList" items="${hospitalizationList}">
				<tr>				
					<td>${hospitalizationList.hoHospitalizationCode}</td>
					<td>${hospitalizationList.hoPatientName}</td>
					<td>${hospitalizationList.hoTreatmentCode}</td>
					<td>${hospitalizationList.hoHospitalizationStartDate}</td>
					<td>
						<a href="<c:url value='/hospital/updateHospitalization?hoHospitalizationCode=${hospitalizationList.hoHospitalizationCode}'/>">
						<button>퇴원확인</button>
						</a>
					</td>
				
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='/hospital/treatList'/>"><button>진료목록</button></a>
	<a href="<c:url value='/hospital/hospitalizationRequestList'/>"><button>입퇴원 요청목록</button></a>
</body>
	
	
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>

