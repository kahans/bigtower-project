<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

<div class="main">
	
	<div class="main-inner">

	    <div class="container">
	
	      <div class="row">
	      	
	      	<div class="span12">      		
	      		
	      		<div class="widget ">
	      			
	      			<div class="widget-header">
	      				<i class="icon-user"></i>
	      				<h3>나의 환자 조회</h3>
	  				</div> <!-- /widget-header -->
					
					<div class="widget-content">
						
						
						
						<div class="tabbable">
						<ul class="nav nav-tabs">
						  <li class="active">
						    <a href="#treat" data-toggle="tab">진료</a>
						  </li>
						  <li>
						  	<a href="#diagnosis" data-toggle="tab">진단</a>
					  	  </li>
					  	  <li>
						  	<a href="#prescription" data-toggle="tab">처방</a>
					  	  </li>
					  	  <li>
						  	<a href="#hospitalization" data-toggle="tab">입퇴원</a>
					  	  </li>
					  	  <li>
						  	<a href="#surgery" data-toggle="tab">수술</a>
					  	  </li>
					  	  <li>
						  	<a href="#bloodtest" data-toggle="tab">혈액검사</a>
					  	  </li>
					  	  <li>
						  	<a href="#imagetest" data-toggle="tab">영상검사</a>
					  	  </li>
					  	  <li>
						  	<a href="#checkup" data-toggle="tab">건강검진</a>
					  	  </li>
					  	  <li>
						  	<a href="#vaccination" data-toggle="tab">예방접종</a>
					  	  </li>
					  	  
						</ul>
						
						<br>
						
							<div class="tab-content">
							
								<!-- 1.진료부분 -->
								<div class="tab-pane active" id="treat">
								<form id="edit-profile" class="form-horizontal">
									<fieldset>
										<!-- 내용 -->
										진료
										
										<!-- /내용 -->
									</fieldset>
								</form>
								</div>
								<!-- /진료부분 -->
								
								<!-- 2.진단부분 -->
								<div class="tab-pane" id="diagnosis">
									<form id="edit-profile2" class="form-vertical">
										<fieldset>
											<!-- 내용 -->
											진단
                                            
											<!-- /내용 -->
										</fieldset>
									</form>
								</div>
								<!-- /진단부분 -->
								
								<!-- 3.처방부분 -->
								<div class="tab-pane" id="prescription">
									<form id="edit-profile2" class="form-vertical">
										<fieldset>
											<!-- 내용 -->
											처방
                                            
											<!-- /내용 -->
										</fieldset>
									</form>
								</div>
								<!-- /처방부분 -->
								
								
								<!-- 4.입퇴원부분 -->
								<div class="tab-pane" id="hospitalization">
									<form id="edit-profile2" class="form-vertical">
										<fieldset>
											<!-- 내용 -->
											입퇴원
                                            
											<!-- /내용 -->
										</fieldset>
									</form>
								</div>
								<!-- /입퇴원부분 -->
								
								
								<!-- 5.수술부분 -->
								<div class="tab-pane" id="surgery">
									<form id="edit-profile2" class="form-vertical">
										<fieldset>
											<!-- 내용 -->
											수술
                                            
											<!-- /내용 -->
										</fieldset>
									</form>
								</div>
								<!-- /수술부분 -->
								
								
								<!-- 6.혈액검사부분 -->
								<div class="tab-pane" id="bloodtest">
									<form id="edit-profile2" class="form-vertical">
										<fieldset>
											<!-- 내용 -->
											혈액검사
                                            
											<!-- /내용 -->
										</fieldset>
									</form>
								</div>
								<!-- /혈액검사부분 -->
								
								
								<!-- 7.영상검사부분 -->
								<div class="tab-pane" id="imagetest">
									<form id="edit-profile2" class="form-vertical">
										<fieldset>
											<!-- 내용 -->
											영상검사
                                            
											<!-- /내용 -->
										</fieldset>
									</form>
								</div>
								<!-- /영상검사부분 -->
								
								
								<!-- 8.건강검진부분 -->
								<div class="tab-pane" id="checkup">
									<form id="edit-profile2" class="form-vertical">
										<fieldset>
											<!-- 내용 -->
											건강검진
                                            
											<!-- /내용 -->
										</fieldset>
									</form>
								</div>
								<!-- /건강검진부분 -->
								
								
								<!-- 9.예방접종부분 -->
								<div class="tab-pane" id="vaccination">
									<form id="edit-profile2" class="form-vertical">
										<fieldset>
											<!-- 내용 -->
                                           	 예방접종
                                            
											<!-- /내용 -->
										</fieldset>
									</form>
								</div>
								<!-- /예방접종부분 -->
								
							</div>
						  
						  
						</div>
						
						
						
						
						
					</div> <!-- /widget-content -->
						
				</div> <!-- /widget -->
	      		
		    </div> <!-- /span8 -->
	      	
	      	
	      	
	      	
	      </div> <!-- /row -->
	
	    </div> <!-- /container -->
	    
	</div> <!-- /main-inner -->
    
</div> <!-- /main -->

<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
