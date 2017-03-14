<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
	<div align="center" class="container">
		  <div class="widget">
	           <div class="widget-header">
	               <i class="icon-large icon-signout"></i>
	               <h3>입원 환자 목록</h3>
	           </div>
	           <!-- /widget-header -->
	           <div class="widget-content">
					<table class="table table-hover">
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
	           </div>
	           <!-- /widget-content -->
	       </div>
	       <!-- /widget -->	
	</div>
</body>
	
	
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>