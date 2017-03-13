<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<head>
    <meta charset="utf-8">
    <title>Account - Bootstrap Admin Template</title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">    
    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-responsive.min.css" rel="stylesheet">
    
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    
    <link href="css/style.css" rel="stylesheet">
   


    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>
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
						    <a href="#formcontrols" data-toggle="tab">등록환자 조회</a>
						  </li>
						  
						</ul>
						
						<br>
						
							<div class="tab-content">
								<div class="tab-pane" id="formcontrols">
								<form action="<c:url value='/hospital/searchPatient'/>" 
										id="edit-profile" class="form-horizontal" method="post">
									<fieldset>
										
										<div class="control-group">											
											<label class="control-label" for="username">환자명</label>
											<div class="controls">
												<input type="text" class="span6 disabled" name="hoPatientName" value="도우너">
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										<div class="control-group">											
											<label class="control-label" for="firstname">주민번호</label>
											<div class="controls">
												<input type="text" class="span6" id="hocitizenId" name="hocitizenId" value="900101-1000001">
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
		
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
