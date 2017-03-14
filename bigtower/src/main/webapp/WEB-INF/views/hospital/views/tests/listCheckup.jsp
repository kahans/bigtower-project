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
<div class="widget widget-nopad">
	<div class="widget-header">
		<i class="icon-list-alt"></i>
		<h3>건강검진 대기 목록</h3>
	</div>	
	<div class="widget-content">
		<div class="widget big-stats-container">
			<table border="" class="center">
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
					<c:forEach var="checkupList" items="${checkupList}">
						<tr>
							<td>${checkupList.hoPatientName}</td>
							<td>${checkupList.hoTestRequestCode}</td>
							<td>${checkupList.hoTreatmentCode}</td>
							<td>${checkupList.hoTestStateName}</td>
							<td>
								<a href="<c:url value='/hospital/test/updateCheckupState?hoTestRequestCode=${checkupList.hoTestRequestCode }'/>">
									<button>결과등록신청</button>
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
	<%-- <a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
	<a href="<c:url value='/hospital/test/listCheckupWait'/>"><button>검진 결과대기목록</button></a> --%>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	