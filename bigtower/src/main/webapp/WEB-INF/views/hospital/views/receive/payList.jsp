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
		
	margin: 100px 200px 200px 200px;
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
<c:if test="${!empty payList}">
	<div class="widget widget-table action-table"> 
	           <div class="widget-header">
	               <i class="icon-money"></i>
	               <h3>수납 목록</h3>
	           </div>
	           <!-- /widget-header -->
	           <div class="widget-content">
             		 <table class="table table-striped table-bordered">
						<thead>
							<tr>
							<th><h4>환자명</h4></th>
							<th><h4>진료과</h4></th>
							<th><h4>방문목적</h4></th>
							<th><h4>접수일</h4></th>
							<th><h4>수납처리</h4></th>
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
	           </div>
	           <!-- /widget-content -->
	       </div>
	       <!-- /widget widget-table action-table -->
</c:if>
<c:if test="${empty payList }">
	<div class="widget widget-table action-table">
		<div class="widget-header">
			<i class="icon-list-alt"></i>
			<h3>수납 목록</h3>
		</div>	
		<div class="widget-content" align="center">
			<h3>목록이 없습니다.</h3>
		</div>
	</div>
</c:if>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>