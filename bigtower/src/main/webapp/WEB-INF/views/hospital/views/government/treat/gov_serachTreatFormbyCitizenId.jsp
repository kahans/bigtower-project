<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp"%>
<div class="main">
	<div class="main-inner">
		<div class="container">
			<div class="row">
				<div class="span6">
					<div class="widget widget-nopad">
						<div class="widget-header">
							<i class="icon-list-alt"></i>
							<h3>주민번호로 진료 조회</h3>
						</div>
						<!-- /widget-header -->
						<div class="widget-content">
							<div class="widget big-stats-container">
								<div class="widget-content">
									<form action="<c:url value="/government/searchResultByCitizenId"/>"	method="post">
										<fieldset>
											<div class="control-group">											
												<br>
											
												<div class="controls">
													<div class="input-append">
														<input class="span2 m-wrap" id="appendedInputButton" name="citizenId" type="text" value="900101-1000001">
														<button class="btn" type="submit">조회!</button>
													</div>
												</div>
												<!-- /controls -->
											</div>
										</fieldset>
									</form>
								</div>
								<!-- /widget-content -->

							</div>
						</div>
					</div>
					<!-- /widget -->
				</div>
			</div>
		</div>
	</div>
</div>

<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp"%>
