<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp"%>
<style>
.widget {
	position: relative;
	clear: both;
	width: auto;
	margin-bottom: 2em;
	overflow: auto;
	margin: 50px 300px 300px 300px;
}

@media ( max-width : 1000px) {
	.widget {
		position: relative;
		clear: both;
		width: auto;
		margin-bottom: 2em;
		overflow: auto;
		margin: auto auto 100px auto;
	}
}
</style>
<c:if test="${!empty hospitalizationRequestList}">
	<div class="main">
		<div class="main-inner">
			<div class="container">
				<div class="row">
					<div class="span12">
						<div class="widget widget-table action-table">
							<div class="widget-header">
								<i class="icon-large icon-signin"></i>
								<h3>입퇴원 요청 목록</h3>
							</div>
							<!-- /widget-header -->
							<div class="widget-content">
								<table class="table table-striped table-bordered">
									<thead>
										<tr>
											<th><h4>환자명</h4></th>
											<th><h4>입원요청일</h4></th>
											<th><h4>입원등록</h4></th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="hospitalizationRequestList"
											items="${hospitalizationRequestList}">
											<tr>
												<td>${hospitalizationRequestList.hoPatientName}</td>
												<td>${hospitalizationRequestList.hoHospitalizationRequestDate}</td>
												<td><a
													href="<c:url value='/hospital/addHospitalization?hoTreatmentCode=${hospitalizationRequestList.hoTreatmentCode}&
									hoHospitalizationRequestCode=${hospitalizationRequestList.hoHospitalizationRequestCode}'/>">
														<button>입원확인</button>
												</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
							<!-- /widget-content -->
						</div>
						<!-- /widget widget-table action-table -->
					</div>
					<!-- /span -->

				</div>
				<!-- /row -->

			</div>
			<!-- /container -->

		</div>
		<!-- /main-inner -->

	</div>
	<!-- /main -->
</c:if>
<c:if test="${empty hospitalizationRequestList}">
	<div class="main">

		<div class="main-inner">

			<div class="container">

				<div class="row">

					<div class="span12">
						<div class="widget widget-table action-table">
							<div class="widget-header">
								<i class="icon-list-alt"></i>
								<h3>입퇴원 요청 목록</h3>
							</div>
							<div class="widget-content" align="center">
								<h3>목록이 없습니다.</h3>
							</div>
						</div>
					</div>
					<!-- /span -->

				</div>
				<!-- /row -->

			</div>
			<!-- /container -->

		</div>
		<!-- /main-inner -->

	</div>
	<!-- /main -->
</c:if>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp"%>