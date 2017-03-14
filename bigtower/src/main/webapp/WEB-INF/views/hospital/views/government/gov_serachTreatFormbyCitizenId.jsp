<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp"%>

<div class="main">
	
	<div class="main-inner">

	    <div class="container">
	
	      <div class="row">
	      	
	      	<div class="span12">      		
	      		
	      		<div class="widget ">
	      			
	      			<div class="widget-header">
	      				<i class="icon-user"></i>
	      				<h3>환자 조회</h3>
	  				</div> <!-- /widget-header -->
					
					<div class="widget-content">
						
						<div class="tabbable">
						<ul class="nav nav-tabs">
						  <li>
						    <a href="#formcontrols" data-toggle="tab">주민번호로 조회</a>
						  </li>
						  
						</ul>
						
						<br>
						
							<div class="tab-content">
								<div class="tab-pane active" id="formcontrols">
								<form action="<c:url value="/government/searchResultByCitizenId"/>"
										class="form-horizontal" method="post">
									<fieldset>
										
										<div class="control-group">											
											<label class="control-label" for="firstname">주민번호</label>
											<div class="controls">
												<input type="text" class="span4" id="citizenId" name="citizenId" value="900101-1000001">
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										<div class="form-actions">
											<button type="submit" class="btn btn-primary">조회</button> 
											<button class="btn">취소</button>
										</div> <!-- /form-actions -->
									</fieldset>
								</form>
								</div>
								
							</div>
						   
						</div>
						
					</div> <!-- /widget-content -->
						
				</div> <!-- /widget -->
	      		
		    </div> <!-- /span8 -->
	      	
	      </div> <!-- /row -->
	
	    </div> <!-- /container -->
	    
	</div> <!-- /main-inner -->
    
</div> <!-- /main -->

<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp"%>
