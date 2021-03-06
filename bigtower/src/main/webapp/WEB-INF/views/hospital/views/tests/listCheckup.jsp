<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp"%>
<c:if test="${!empty checkupList }">
	<div class="main">
		<div class="main-inner">
			<div class="container">
				<div class="row">
					<div class="span12">
						<div class="widget ">
							<div class="widget-header">
								<i class="icon-list-alt"></i>
								<h3>건강검진 대기 목록</h3>
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
												<td>${checkupList.hoTestRequestCode}</td>
												<td>${checkupList.hoTreatmentCode}</td>
												<td>${checkupList.hoTestStateName}</td>
												<td><a
													href="<c:url value='/hospital/test/updateCheckupState?hoTestRequestCode=${checkupList.hoTestRequestCode }'/>">
														<button>검사완료</button>
												</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!-- /span12 -->
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /main-inner -->
	</div>
	<!-- /main -->
</c:if>
<c:if test="${empty checkupList }">
	<div class="main">
		<div class="main-inner">
			<div class="container">
				<div class="row">
					<div class="span12">
						<div class="widget ">
							<div class="widget-header">
								<i class="icon-list-alt"></i>
								<h3>건강검진 대기 목록</h3>
							</div>
							<div class="widget-content" align="center">
								<br /><br />
								<h3>목록이 없습니다.</h3>
								<br />
							</div>
						</div>
					</div>
					<!-- /span12 -->
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /main-inner -->
	</div>
	<!-- /main -->
</c:if>
<%-- <a href="<c:url value='/hospital/test'/>"><button>전체목록</button></a>
	<a href="<c:url value='/hospital/test/listCheckupWait'/>"><button>검진 결과대기목록</button></a> --%>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp"%>
