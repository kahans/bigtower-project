<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
</head>
<script>
	$( document ).ready(function() {
		$("#hoReceivePurpose").focus();
		
		$("#submitBtn").click(function(){
			if($("#hoReceivePurpose").val()===""){
				alert("접수목적을 입력해주세요");
				$("#hoReceivePurpose").focus();
				return;
			}
			if($("#hoTreatSubjectCode option:selected").val()===""){
				alert("진료과목을 선택해주세요");
				return;
			}
			$("#receiveForm").submit();
		});
	});
</script>
<%-- <h2>환자접수</h2>
	주민번호
	<input id="hoCitizenIdSearch" type="text" value="${hoCitizenId}" placeholder="주민번호" readonly="readonly">
	<form id="receiveForm" action="<c:url value="/hospital/receive"/>" method="post">	
		<input id="hoCitizenId" type="hidden" name="hoCitizenId" value="${hoCitizenId}">	
		<input id="hoPatientCode" type="hidden" name="hoPatientCode" value="${hoPatientCode}">
		<div>
			병원코드 : 
			<input id="hoHospitalCode" type="text" name="hoHospitalCode" value="${HOSPITALCODE}" readonly="readonly">
		</div>
		<div>
			환자명 : 
			<input id="hoPatientName" type="text" name="hoPatientName" placeholder="이름" value="${hoPatientName}" readonly="readonly">
		</div>
		<div>
			연락처 : 
			<input id="hoPatientPhone" type="text" name="hoPatientPhone" placeholder="전화번호" value="${hoPatientPhone}" readonly="readonly">
		</div>
		<div>
			주소 : 
			<input type="text" value="${hoPatientAddress} ${hoPatientDetailAddress}" size="70" readonly="readonly">
		</div>
		<div>
			우편번호 : 
			<input type="text" value="${hoZipCode}" readonly="readonly">
		</div>
		<div>
			접수목적 :
			<input id="hoReceivePurpose" type="text" name="hoReceivePurpose" value="감기몸살">ex)골절상
		</div>
		<div>
			진료과목 :
			<select id="hoTreatSubjectCode" name="hoTreatSubjectCode">
				<option value="">:::선택하세요:::</option>
				<c:forEach items="${treatSubjectList}" var="treatSubjectList">
					<option value="${treatSubjectList.hoTreatSubjectCode}">${treatSubjectList.hoTreatSubjectName}</option>
				</c:forEach>
			</select>
		</div>
		<input id="submitBtn" type="button" value="접수">
	</form> --%>
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
						  
						  <li><a href="#formcontrols" data-toggle="tab">환자 접수</a></li>
						</ul>
						
							<div class="tab-content">
								<div class="tab-pane" id="formcontrols">
									<fieldset>
									
										<div class="control-group">											
											<label class="control-label" for="username">주민번호</label>
											<div class="controls">
												<input id="hoCitizenIdSearch" type="text" value="${hoCitizenId}" placeholder="주민번호" readonly="readonly">
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
									<form action="<c:url value='/hospital/receive'/>" method="post" id="receiveForm" class="form-horizontal">
										<div class="control-group">											
											<label class="control-label" for="username">병원코드</label>
											<div class="controls">
												<input type="text" name="hoHospitalCode" class="span4" id="hoHospitalCode" value="${HOSPITALCODE}" readonly="readonly">
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										
										<div class="control-group">											
											<label class="control-label" for="lastname">환자명</label>
											<div class="controls">
												<input type="text" class="span4" name="hoPatientName" id="hoPatientName" value="${hoPatientName}" readonly="readonly">
												<button class="btn" type="button" id="checkBtn">주민번호,이름 확인</button>
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										
										<div class="control-group">											
											<label class="control-label" for="email">전화번호</label>
											<div class="controls">
												<input type="text" class="span4" name="hoPatientPhone" id="hoPatientPhone" value="${hoPatientPhone}" readonly="readonly">
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										
										<div class="control-group">											
											<label class="control-label" for="password2">우편번호</label>
											<div class="controls">
												<input type="text" class="span4" name="hoZipCode" id="hoZipCode" value="${hoZipCode}">
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										
										<div class="control-group">											
											<label class="control-label" for="password1">주소</label>
											<div class="controls">
												<input type="text" class="span4" name="hoPatientAddress" id="hoPatientAddress" value="${hoPatientAddress} ${hoPatientDetailAddress}" readonly="readonly">
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										<div class="control-group">											
											<label class="control-label" for="password1">접수목적</label>
											<div class="controls">
												<input type="text" class="span4" id="hoReceivePurpose" name="hoReceivePurpose" value="감기몸살">
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										<div class="control-group">											
											<label class="control-label" for="password1">진료과목</label>
											<div class="controls">
												<select id="hoTreatSubjectCode" name="hoTreatSubjectCode">
													<option value="">:::선택하세요:::</option>
													<c:forEach items="${treatSubjectList}" var="treatSubjectList">
														<option value="${treatSubjectList.hoTreatSubjectCode}">${treatSubjectList.hoTreatSubjectName}</option>
													</c:forEach>
												</select>
											</div> <!-- /controls -->				
										</div> <!-- /control-group -->
										
										<div class="form-actions">
											<button id="submitBtn" type="submit" class="btn btn-primary">접수하기</button> 
											<button class="btn">취소</button>
										</div> <!-- /form-actions -->
									</form>
								  </fieldset>
								
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
