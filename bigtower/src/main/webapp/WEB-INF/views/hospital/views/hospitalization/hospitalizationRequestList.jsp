<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
	<h1>입퇴원 요청 목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>입퇴원 요청코드</th>
				<th>진료코드</th>
				<th>환자명</th>
				<th>요청일</th>
				<th>입원등록</th>				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="hospitalizationRequestList" items="${hospitalizationRequestList}">
				<tr>				
					<td>${hospitalizationRequestList.hoHospitalizationRequestCode}</td>
					<td>${hospitalizationRequestList.hoTreatmentCode}</td>
					<td>${hospitalizationRequestList.hoHospitalizationRequestDate}</td>
					<td>${hospitalizationRequestList.hoPatientName}</td>
					<td>
						<a href="<c:url value='/hospital/addHospitalization?hoTreatmentCode=${hospitalizationRequestList.hoTreatmentCode}&
																			hoHospitalizationRequestCode=${hospitalizationRequestList.hoHospitalizationRequestCode}'/>">
						<button>입원확인</button>
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='/hospital/treatList'/>"><button>진료목록</button></a>
	<a href="<c:url value='/hospital/hospitalizationList'/>"><button>입원환자 목록</button></a>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	