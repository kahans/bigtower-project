<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<style>
<!--
.widget {
	
	position: relative;		
	clear: both;		
	width: auto;		
	margin-bottom: 2em;		
	overflow: auto;		
	margin: 50px 300px 300px 300px;
}
th{
	font-size: 15px;
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
-->
</style>
<div class="widget widget-table action-table">
	<div class="widget-header">
		<i class="icon-list-alt"></i>
		<h3>혈액 검사 결과 대기목록</h3>
	</div>	
	<div class="widget-content">
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>환자명</th>
					<th>검사요청코드</th>
					<th>진료코드</th>
					<th>상태</th>
					<th class="td-actions"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="bloodList" items="${bloodList}">
					<tr>
						<td>${bloodList.hoPatientName}</td>
						<td>${bloodList.hoTestRequestCode}</td>
						<td>${bloodList.hoTreatmentCode}</td>
						<td>${bloodList.hoTestStateName}</td>
						<td>
							<a href="<c:url value='/hospital/test/addBloodTest?hoTestRequestCode=${bloodList.hoTestRequestCode }'/>">
								<button>결과등록신청</button>
							</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
	<%-- <a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
	<a href="<c:url value='/hospital/test/ListBloodTest'/>"><button>혈액검사대기목록</button></a> --%>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	