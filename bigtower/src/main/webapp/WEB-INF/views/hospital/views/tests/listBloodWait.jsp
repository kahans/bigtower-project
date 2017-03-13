<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<style>
<!--

.center {    
    left: 0;
    top: 50%;
    width: 100%;
    text-align: center;
    font-size: 18px;
}
.widget {
    position: relative;
    clear: both;
    width: auto;
    margin-bottom: 2em;
    overflow: hidden;
    margin: 50px;
}
-->
</style>
<div class="widget widget-nopad">
	<div class="widget-header">
		<i class="icon-list-alt"></i>
		<h3>혈액 검사 결과 대기목록</h3>
	</div>	
	<div class="widget-content">
		<div class="widget big-stats-container">
			<table border="" class="center">
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
		</div>
	</div>
</div>
<br>
	<%-- <a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
	<a href="<c:url value='/hospital/test/ListBloodTest'/>"><button>혈액검사대기목록</button></a> --%>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	