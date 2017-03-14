<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

<script type="text/javascript">
	$(document).ready(function(){
		$("#submitBtn").click(function(){
			$("#operationForm").submit();
		});
	});

</script>
	<div class="main">
			
		<div class="main-inner">
		
		    <div class="container">
		
		      <div class="row">
		      	
		      	<div class="span12">      		
		      		
		      		<div class="widget ">
		      			
		      			<div class="widget-header">
		      				<i class="icon-user"></i>
		      				<h3>수술일지 등록</h3>
		  				</div> <!-- /widget-header -->
							
							<div class="widget-content">
								<div class="tabbable">
								<ul class="nav nav-tabs">
								  <li><a href="#formcontrols" data-toggle="tab">수술일지 작성</a></li>
								</ul>
									<div class="tab-content">
										<div class="tab-pane" id="formcontrols">
											<fieldset>
											<form action="<c:url value='/hospital/operationView'/>" method="post" id="operationForm" class="form-horizontal">
												<input id="hoPatientCode" type="hidden" name="hoPatientCode" value="${hoPatientCode}">
												<div class="control-group">											
													<label class="control-label">환자명 : </label>
													<div class="controls">
														<input type="text" class="span6" value="${hoOperation.hoPatientName}" readonly="readonly">
													</div> <!-- /controls -->	
												</div> <!-- /control-group -->
												
												<div class="control-group">											
													<label class="control-label">수술명 : </label>
													<div class="controls">
														<input type="text" class="span6" value="${hoOperation.hoOperationTypeName}" readonly="readonly">
													</div> <!-- /controls -->				
												</div> <!-- /control-group -->
												
												
												<div class="control-group">											
													<label class="control-label">수술시작일 : </label>
													<div class="controls">
														<input type="text" class="span6" value="${hoOperation.hoOperationStartDate}" name="hoOperationStartDate" id="hoOperationStartDate" readonly="readonly">
													</div> <!-- /controls -->				
												</div> <!-- /control-group -->
												
												
												<div class="control-group">											
													<label class="control-label">수술종료일 : </label>
													<div class="controls">
														<input type="date" class="span6" value="${hoOperation.hoOperationEndDate}" name="hoOperationEndDate">
													</div> <!-- /controls -->				
												</div> <!-- /control-group -->
												
												
												<div class="control-group">											
													<label class="control-label"> 수술일지 : </label>
															<div class="controls">
																<textarea class="form-control" cols="100" rows="10"
																	name="hoOperationDiary"
																	style="max-width: 57%; width: 57%;">${hoOperation.hoOperationDiary}</textarea>
															</div>
															<!-- /controls -->
														</div> <!-- /control-group -->
											</form>
													<div style="text-align: center">
														<button id="submitBtn" type="submit" class="class="btn btn-primary">수술일지 등록</button>
													</div>
										</fieldset>
										
										</div><!--/tab-pane  -->
										
									</div><!-- /tab-content  -->
								  
								</div><!-- /tabbable -->
						
							</div> <!-- /widget-content -->
								
						</div> <!-- /widget -->
			      		
				    </div> <!-- /span8 -->
		
			      </div> <!-- /row -->
			
			    </div> <!-- /container -->
			    
			</div> <!-- /main-inner -->
		    
		</div> <!-- /main -->	
				
	
	
	
	<!-- <script>
		var Today = new Date();
		document.getElementById('hoOperationStartDate').valueAsDate = ${hoOperation.hoOperationStartDate};
	</script> -->
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
