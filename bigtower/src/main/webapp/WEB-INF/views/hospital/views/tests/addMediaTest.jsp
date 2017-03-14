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
    overflow: hidden;
    margin: 50px;
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
	<h3>영상검사 결과등록</h3>
	</div>	
	<div class="widget-content">
		<div class="widget big-stats-container">
	<!-- enctype="multipart/form-data"  -->
			<%-- <form action="<c:url value='/hospital/test/addMediaTest'/>" method="post" enctype="multipart/form-data">
				<div>
					검사명 : 
					<input type="text" name="hoTestName" required="required" value="${mediaView.hoTestName }">
					<input type="hidden" name="hoTestCode" required="required" value="${mediaView.hoTestCode }">
					<input type="hidden" name="hoTestRequestCode" required="required" value="${mediaView.hoTestRequestCode }">
				</div>
				<div>
					진료코드 : 
					<input type="text"  name="hoTreatmentCode" required="required" value="${mediaView.hoTreatmentCode}">
				</div>
				<div>
					환자명 : 
					<input type="text" name="hoPatientName" required="required" value="${mediaView.hoPatientName}">
				</div>
					
				<div>
					<input type="hidden" name="hoTestStateCode" value="3" required="required">
				</div>
				<!-- 영상검사 결과 이미지를 여러개 입력할수 한다.-->
				
				<div id="uploadFile">
					<div>
						결과 이미지 등록 : 
						<input type="file" name="uploadFile">
						<button type="button" id="addUploadFile">추가</button>
					</div>
				</div>
					
				<div>
					<button>등록</button>
				</div>
			</form>
		</div>
	</div>
</div> --%>
			<div class="main">
				<div class="main-inner">
					<div class="container">
						<div class="row">
				      		<div class="span12">      		
				      			<div class="widget ">
				      				<div class="widget-header">
				      					<i class="icon-user"></i>
				      					<h3>등록 화면</h3>
				  					</div> <!-- /widget-header -->
									<div class="widget-content">
										<div class="tabbable">
											<ul class="nav nav-tabs">
												<li><a href="#formcontrols" data-toggle="tab">결과등록</a></li>
											</ul>
											<div class="tab-content">
												<div class="tab-pane" id="formcontrols">
													<fieldset>
														<form action="<c:url value='/hospital/test/addMediaTest'/>" method="post" enctype="multipart/form-data" class="form-horizontal">
															<input type="hidden" name="hoTestCode" required="required" value="${mediaView.hoTestCode }">
															<input type="hidden" name="hoTestRequestCode" required="required" value="${mediaView.hoTestRequestCode }">
															<input type="hidden" name="hoTestStateCode" value="3" required="required">
															<div class="control-group">											
																<label class="control-label" for="username">검사명</label>
																<div class="controls">
																	<input type="text" name="hoTestName" required="required" value="${mediaView.hoTestName }">
																</div> <!-- /controls -->				
															</div> <!-- /control-group -->
															
															<div class="control-group">											
																<label class="control-label" for="username">진료코드</label>
																<div class="controls">
																	<input type="text"  name="hoTreatmentCode" required="required" value="${mediaView.hoTreatmentCode}">
																</div> <!-- /controls -->				
															</div> <!-- /control-group -->
															
															
															<div class="control-group">											
																<label class="control-label" for="lastname">환자명</label>
																<div class="controls">
																	<input type="text" name="hoPatientName" required="required" value="${mediaView.hoPatientName}">
																</div> <!-- /controls -->				
															</div> <!-- /control-group -->
															<div class="control-group">
																<label class="control-label" for="lastname">파일등록</label>
																<div id="uploadFile">
																	<div class="controls"> 
																		<input type="file" name="uploadFile">
																	</div>
																</div>
															</div>
															<div class="form-actions">
																<button id="submitBtn" type="submit" class="btn btn-primary">접수하기</button> 
																<button class="btn">취소</button>
															</div> <!-- /form-actions -->
														</form>
													</fieldset>
												</div><!-- /tab-pane -->
											</div><!-- /tab-content -->
										</div><!-- /tabbable -->
									</div> <!-- /widget-content -->
								</div> <!-- /widget -->
							</div> <!-- /span8 -->
						</div> <!-- /row -->
					</div> <!-- /container -->
				</div> <!-- /main-inner -->
			</div> <!-- /main -->	
		</div><!-- widget big-stats-container -->
	</div><!-- /widget-content -->
</div><!-- /widget widget-nopad -->



<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
