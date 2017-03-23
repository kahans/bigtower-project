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
<c:if test="${!empty checkupList}">
	<div class="widget widget-table action-table">
		<div class="widget-header">
			<i class="icon-list-alt"></i>
			<h3>건강검진 결과대기 목록</h3>
		</div>
		<div class="widget-content">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th><h4>환자명</h4></th>
						<th><h4>검사요청코드</h4></th>
						<th><h4>진료코드</h4></th>
						<th><h4>상태</h4></th>
						<th class="td-actions"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="checkupList" items="${checkupList}">
						<tr>
							<td>${checkupList.hoPatientName}</td>
							<td>${checkupList.hoTestRequestCode }</td>
							<td>${checkupList.hoTreatmentCode }</td>
							<td>${checkupList.hoTestStateName }</td>
							<td>
								<a href="<c:url value='/hospital/test/addCheckup?hoTestRequestCode=${checkupList.hoTestRequestCode }'/>">
									<button>결과등록</button>
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</c:if>
<c:if test="${empty checkupList }">
	<div class="widget widget-table action-table">
		<div class="widget-header">
			<i class="icon-list-alt"></i>
			<h3>건강검진 결과대기 목록</h3>
		</div>	
		<div class="widget-content" align="center">
			<br/>
			<h3>목록이 없습니다.</h3>
			<br/>
		</div>
	</div>
</c:if>
<%-- 
	<br>
	<a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
	<a href="<c:url value='/hospital/test/listCheckup'/>"><button>검진 대기목록</button></a> --%>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	