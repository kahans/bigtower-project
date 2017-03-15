<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<style>

.widget {
	
	position: relative;
		
	clear: both;
		
	width: auto;
		
	margin-bottom: 2em;
		
	overflow: auto;
		
	margin: 100px 300px 200px 300px;
}
@media (max-width: 1000px) {
.widget {
	
	position: relative;		
	clear: both;		
	width: auto;		
	margin-bottom: 2em;		
	overflow: auto;		
	margin: auto auto 100px auto;

}

</style>
<c:if test="${!empty hospitalizationList }">
	<div class="widget widget-table action-table">
		  
	           <div class="widget-header">
	               <i class="icon-large icon-signout"></i>
	               <h3>입원 환자 목록</h3>
	           </div>
	           <!-- /widget-header -->
	           <div class="widget-content">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>환자명</th>
								<th>입원일</th>
								<th>퇴원처리</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="hospitalizationList" items="${hospitalizationList}">
								<tr>			
									<td>${hospitalizationList.hoPatientName}</td>
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
	       <!-- /widget widget-table action-table -->
	
</c:if>
<c:if test="${empty hospitalizationList }">
	<div class="widget widget-table action-table">
		<div class="widget-header">
			<i class="icon-list-alt"></i>
			<h3>입원 환자 목록</h3>
		</div>	
		<div class="widget-content" align="center">
			<h3>목록이 없습니다.</h3>
		</div>
	</div>
</c:if>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>