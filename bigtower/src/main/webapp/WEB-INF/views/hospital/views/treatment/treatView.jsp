<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	$( document ).ready(function() {
		
		//질병 추가버튼 클릭시 이벤트
		$(document).on('click','#diseaseNameAdd',function(){
			var addSelect = $('#hiddenPrescription').html();
			$(this).parents('#prescription').append(addSelect);	
		});
		
		$(document).on('click','#diseaseNameRemove',function(){
			$(this).parent('.addDisease').remove();		
		});
		
		//약품 추가버튼 클릭시 이벤트
		$(document).on('click','#medicineNameAdd',function(){
			var addSelect = $('#hiddenMedicine').html();
			$(this).parents('#medicine').append(addSelect);	
		});
		
		$(document).on('click','#medicineNameRemove',function(){
			$(this).parent('.addMedicine').remove();		
		});
		
		// 제출버튼 클릭시(유효성검사)
		$("#submitBtn").click(function(){
			console.log($("#diseaseSelect option:selected").val());
			if($("#diseaseSelect option:selected").val()==='0'){
				alert("질병코드를 선택하세요!")
				return;
			}if($("#hoTreatmentContents").val()===""){
				alert("진료내용을 입력하세요!");
				return;
			}
			console.log("제출!!");
			$("#treatForm").submit();
		});
	});
</script>
<%-- 
	
		<!-- 검사 요청 -->
		<h3>검사 요청</h3>
		<input type="checkbox" name="hoTestCode" value="1">혈액검사	
		<input type="checkbox" name="hoTestCode" value="2">영상검사
		<input type="checkbox" name="hoTestCode" value="3">건강검진
	
		<!-- 입/퇴원 요청 -->
		<h3>입/퇴원 요청</h3>
		<div>
			해당없음<input type="radio" name="checkHospitalization" value="0" checked="checked">
			입원<input type="radio" name="checkHospitalization" value="1">
		</div>
		
		<!-- 수술 요청 -->
		<h3>수술 요청</h3>
		<div>
			수술날짜 :
			<input type="date" name="hoOperationStartDate">
		</div>
		<div>
			수술명 : 
			<select name="hoOperationTypeCode">
				<option value="0">:::수술을 선택하시오:::</option>
				<c:forEach items="${operationList}" var="operationList">
					<option value="${operationList.hoOperationTypeCode}">${operationList.hoOperationTypeCode}(${operationList.hoOperationTypeName})</option>
				</c:forEach>
			</select>
		</div>
	
		<!-- 처방 요청 -->
		<h3>처방전 작성</h3>

		<div>
			약품명 :
			<div id="medicine">
           		<div>
            		<select name="hoMedicineCode">
            			<option value="0">약품명</option>
		           		<c:forEach items="${medicineList}" var="medicineList">
							<option value="${medicineList.hoMedicineCode}">${medicineList.hoMedicineCode}(${medicineList.hoMedicineName})</option>
						</c:forEach>                           			
            		</select>
            		<button type="button" id="medicineNameAdd">추가</button>
           		</div>
				<div>
					일일투약량 :
					<input type="text" name="hoPrescriptionDailydose">mg/일
				</div>
				<div>
					일일투약횟수 :
					<input type="text" name="hoPrescriptionDailycount">회/일
				</div>
				<div>
					총투약일수 :
					<input type="text" name="hoPrescriptionTotalday">일
				</div>
				<div>
					용법 :
					<input type="text" name="hoPrescriptionUsage">
				</div>
           	</div>
	           	
           	<div id="hiddenMedicine" style="display: none;">
           		<div class="addMedicine">
            		<select name="hoMedicineCode">
            			<!-- +버튼 눌렀을 때 추가되는 selectBox 마찬가지로 for문으로 list값 가져와야함 -->
            			<option value="0">약품명</option>
            			<c:forEach items="${medicineList}" var="medicineList">
							<option value="${medicineList.hoMedicineCode}">${medicineList.hoMedicineCode}(${medicineList.hoMedicineName})</option>
						</c:forEach>                          			
            		</select>
            		<button type="button" id="medicineNameAdd">추가</button>
            		<button type="button" id="medicineNameRemove">삭제</button>        
					<div>
						일일투약량 :
						<input type="text" name="hoPrescriptionDailydose">mg/일
					</div>
					<div>
						일일투약횟수 :
						<input type="text" name="hoPrescriptionDailycount">회/일
					</div>
					<div>
						총투약일수 :
						<input type="text" name="hoPrescriptionTotalday">일
					</div>
					<div>
						용법 :
						<input type="text" name="hoPrescriptionUsage">
					</div>
           		</div>
           	</div>
		</div>
		
		<!-- 예방접종 등록 -->
		<h3>예방접종 등록</h3>
		<div>
			예방접종 종류 : 
			<select name="hoVaccineTypeCode">
				<option value="0">:::예방 접종 종류를 선택하시오:::</option>
				<c:forEach items="${vaccineList}" var="vaccineList">
						<option value="${vaccineList.hoVaccineTypeCode}">${vaccineList.hoVaccineTypeName}</option>
				</c:forEach>
			</select>
		</div>
		<div>
			예방접종일 : 
			<input type="date" name="hoVaccineDate">
		</div>
		<input id="submitBtn" type="button" value="진료 완료">
	
	 --%>
<div class="main">
  <div class="main-inner">
    <div class="container">
     <form id="treatForm" action="<c:url value='/hospital/treatView'/>" method="post" >
      <div class="row">
        <div class="span6">
          <div class="widget widget-nopad">
            <div class="widget-header"> <i class="icon-list-alt"></i>
              <h3> 진료 정보</h3>
            </div>
            <!-- /widget-header -->
            <div class="widget-content">
           
              <div class="widget big-stats-container">
                <div class="widget-content">
                  
                  <input type="hidden" value="${hoTreat.hoTreatmentCode}" name="hoTreatmentCode">
					
					<div class="control-group">											
						
						<div class="controls">
							<label class="control-label" for="hoDoctorName">의사명</label>
							<input class="span2" type="text" id="hoDoctorName" name="hoDoctorName" value="${hoTreat.hoDoctorName}" readonly="readonly">
						</div> <!-- /controls -->				
					</div> <!-- /control-group -->
					
					<div class="control-group">											
						<label class="control-label" for="username">차트번호</label>
						<div class="controls">
							<input class="span4" type="text" value="${hoTreat.hoChartCode}" readonly="readonly">
						</div> <!-- /controls -->				
					</div> <!-- /control-group -->
					
					<div class="control-group">											
						<label class="control-label" for="username">환자명</label>
						<div class="controls">
							<input class="span4" type="text" value="${hoTreat.hoPatientName}" readonly="readonly">
						</div> <!-- /controls -->				
					</div> <!-- /control-group -->
					
					<div class="control-group">											
						<label class="control-label" for="username">진료과목</label>
						<div class="controls">
							<input class="span4" type="text" value="${hoTreat.hoTreatSubjectName}" readonly="readonly">
						</div> <!-- /controls -->				
					</div> <!-- /control-group -->
					
					<!-- 질병 추가 -->
					<div class="control-group">
						<label class="control-label" for="username">질병 선택</label>
						<div id="prescription" class="controls">
			           		<div>
			            		<select id="diseaseSelect" name="diseaseSelect">
			            			<option value="0">질병명</option>
					           		<c:forEach items="${diseaseList}" var="diseaseList">
										<option value="${diseaseList.hoDiseaseCode}">${diseaseList.hoDiseaseCode}(${diseaseList.hoDiseaseKor})</option>
									</c:forEach>                           			
			            		</select>
			            		<button type="button" id="diseaseNameAdd">추가</button>
			           		</div>
			           	</div>
				           	
				        <!-- 질병 추가시 추가되는 폼 -->   	
			           	<div id="hiddenPrescription" style="display: none;" class="control-group">
			           		<div class="addDisease" class="controls">	
			            		<select name="diseaseSelect">
			            			<!-- +버튼 눌렀을 때 추가되는 selectBox 마찬가지로 for문으로 list값 가져와야함 -->
			            			<option value="0">질병명</option>
			            			<c:forEach items="${diseaseList}" var="diseaseList">
										<option value="${diseaseList.hoDiseaseCode}">${diseaseList.hoDiseaseCode}(${diseaseList.hoDiseaseKor})</option>
									</c:forEach>                           			
			            		</select>
			            		<button type="button" id="diseaseNameAdd">추가</button>
			            		<button type="button" id="diseaseNameRemove">삭제</button>        
			           		</div>
			           	</div>
			         </div>  	
			           	<div class="control-group">											
							<label class="control-label" for="username">진료내용</label>
							<div class="controls">
								<textarea style="max-width: 96%; width:96%;" id="hoTreatmentContents" rows="10" cols="50" name="hoTreatmentContents"></textarea>
							</div> <!-- /controls -->				
						</div> <!-- /control-group -->
                </div>
                <!-- /widget-content --> 
              </div>
            </div>
          </div>
          <!-- /widget 진료정보 -->
         </div>
         <!-- /span6 -->
        
        <%--  
       <!-- 처방 요청 -->
		<h3>처방전 작성</h3>

		<div>
			약품명 :
			<div id="medicine">
           		<div>
            		<select name="hoMedicineCode">
            			<option value="0">약품명</option>
		           		<c:forEach items="${medicineList}" var="medicineList">
							<option value="${medicineList.hoMedicineCode}">${medicineList.hoMedicineCode}(${medicineList.hoMedicineName})</option>
						</c:forEach>                           			
            		</select>
            		<button type="button" id="medicineNameAdd">추가</button>
           		</div>
				<div>
					일일투약량 :
					<input type="text" name="hoPrescriptionDailydose">mg/일
				</div>
				<div>
					일일투약횟수 :
					<input type="text" name="hoPrescriptionDailycount">회/일
				</div>
				<div>
					총투약일수 :
					<input type="text" name="hoPrescriptionTotalday">일
				</div>
				<div>
					용법 :
					<input type="text" name="hoPrescriptionUsage">
				</div>
           	</div>
	           	
           	<div id="hiddenMedicine" style="display: none;">
           		<div class="addMedicine">
            		<select name="hoMedicineCode">
            			<!-- +버튼 눌렀을 때 추가되는 selectBox 마찬가지로 for문으로 list값 가져와야함 -->
            			<option value="0">약품명</option>
            			<c:forEach items="${medicineList}" var="medicineList">
							<option value="${medicineList.hoMedicineCode}">${medicineList.hoMedicineCode}(${medicineList.hoMedicineName})</option>
						</c:forEach>                          			
            		</select>
            		<button type="button" id="medicineNameAdd">추가</button>
            		<button type="button" id="medicineNameRemove">삭제</button>        
					<div>
						일일투약량 :
						<input type="text" name="hoPrescriptionDailydose">mg/일
					</div>
					<div>
						일일투약횟수 :
						<input type="text" name="hoPrescriptionDailycount">회/일
					</div>
					<div>
						총투약일수 :
						<input type="text" name="hoPrescriptionTotalday">일
					</div>
					<div>
						용법 :
						<input type="text" name="hoPrescriptionUsage">
					</div>
           		</div>
           	</div>
		</div> --%>
       
        
        <div class="span6">
        
         <div class="widget">
          	<div class="widget-header"> <i class="icon-bookmark"></i>
              <h3>처방전 작성</h3>
            </div>
            <div class="widget-content">
            	<%-- <div id="medicine">
	           		<div>
	            		<select name="hoMedicineCode">
	            			<option value="0">약품명</option>
			           		<c:forEach items="${medicineList}" var="medicineList">
								<option value="${medicineList.hoMedicineCode}">${medicineList.hoMedicineCode}(${medicineList.hoMedicineName})</option>
							</c:forEach>                           			
	            		</select>
	            		<button type="button" id="medicineNameAdd">추가</button>
	           		</div>
					<div>
						일일투약량 :
						<input type="text" name="hoPrescriptionDailydose">mg/일
					</div>
					<div>
						일일투약횟수 :
						<input type="text" name="hoPrescriptionDailycount">회/일
					</div>
					<div>
						총투약일수 :
						<input type="text" name="hoPrescriptionTotalday">일
					</div>
					<div>
						용법 :
						<input type="text" name="hoPrescriptionUsage">
					</div>
	           	</div> --%>
          		<div class="control-group">											
					<div class="controls">
						<div id="medicine">
			           		<div>
			           			약품명 : 
			            		<select name="hoMedicineCode">
			            			<option value="0">약을 선택하시오</option>
					           		<c:forEach items="${medicineList}" var="medicineList">
										<option value="${medicineList.hoMedicineCode}">${medicineList.hoMedicineCode}(${medicineList.hoMedicineName})</option>
									</c:forEach>                           			
			            		</select>
			            		<button type="button" id="medicineNameAdd">추가</button>
			           		</div>
							<div>
								일일투약량 :
								<input type="text" name="hoPrescriptionDailydose">mg/일
							</div>
							<div>
								일일투약횟수 :
								<input type="text" name="hoPrescriptionDailycount">회/일
							</div>
							<div>
								총투약일수 :
								<input type="text" name="hoPrescriptionTotalday">일
							</div>
							<div>
								용법 :
								<input type="text" name="hoPrescriptionUsage">
							</div>
			           	</div> <!-- /medicine -->
					</div> <!-- /controls -->				
				</div> <!-- /control-group -->
           
            </div>
          </div>
          <!-- /widget -->
          <div class="widget">
          
          	<div class="widget-header"> <i class="icon-bookmark"></i>
              <h3>요청</h3>
            </div>
            <div class="widget-content">
          	<div class="control-group">
				
				<div class="controls">
				
	                 <!-- 검사요청 -->                      
					 <div class="accordion" id="accordion">
	                   <div class="accordion-group">
	                     <div class="accordion-heading">
	                       <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
	                        	 검사요청
	                       </a>
	                     </div>
	                     <div id="collapseOne" class="accordion-body collapse in">
	                       <div class="accordion-inner">
	                        	<input type="checkbox" name="hoTestCode" value="1">혈액검사	
								<input type="checkbox" name="hoTestCode" value="2">영상검사
								<input type="checkbox" name="hoTestCode" value="3">건강검진
	                       </div>
	                     </div>
	                   </div>
	                   
	                 <!-- 입퇴원요청 -->  
	                 <div class="accordion" id="accordion2">
	                   <div class="accordion-group">
	                     <div class="accordion-heading">
	                       <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo">
	                         	입/퇴원 요청
	                       </a>
	                     </div>
	                     <div id="collapseTwo" class="accordion-body collapse">
	                       <div class="accordion-inner">
					   			해당없음 <input type="radio" name="checkHospitalization" value="0" checked="checked">
								입원 <input type="radio" name="checkHospitalization" value="1">
	                       </div> <!-- accordion-inner -->
	                     </div><!-- accordion-body-->
	                   </div><!-- accordion-group -->
	                 </div><!-- accordion -->
	                 
	                  <!-- 수술요청 -->
	                 <div class="accordion" id="accordion3">
	                   <div class="accordion-group">
	                     <div class="accordion-heading">
	                       <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion3" href="#collapseThree">
	                         	수술요청
	                       </a>
	                     </div>
	                     <div id="collapseThree" class="accordion-body collapse">
	                       <div class="accordion-inner">
					   			<div>
						   			수술날짜 :
						   			<input type="date" name="hoOperationStartDate">
					   			</div>
					   			<div>
						   			수술명 :
									<select name="hoOperationTypeCode">
										<option value="0">:::수술을 선택하시오:::</option>
										<c:forEach items="${operationList}" var="operationList">
											<option value="${operationList.hoOperationTypeCode}">${operationList.hoOperationTypeCode}(${operationList.hoOperationTypeName})</option>
										</c:forEach>
									</select>
								</div>
	                       </div> <!-- accordion-inner -->
	                     </div><!-- accordion-body-->
	                   </div><!-- accordion-group -->
	                  </div><!-- accordion -->
	                  
	                  <!-- 입퇴원요청 -->  
	                 <div class="accordion" id="accordion4">
	                   <div class="accordion-group">
	                     <div class="accordion-heading">
	                       <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion4" href="#collapseFour">
	                         	예방접종 요청
	                       </a>
	                     </div>
	                     <div id="collapseFour" class="accordion-body collapse">
	                       <div class="accordion-inner">
					   			<div>
									예방접종 종류 : 
									<select name="hoVaccineTypeCode">
										<option value="0">:::예방 접종 종류를 선택하시오:::</option>
										<c:forEach items="${vaccineList}" var="vaccineList">
												<option value="${vaccineList.hoVaccineTypeCode}">${vaccineList.hoVaccineTypeName}</option>
										</c:forEach>
									</select>
								</div>
								<div>
									예방접종일 : 
									<input type="date" name="hoVaccineDate">
								</div>
	                       </div> <!-- accordion-inner -->
	                     </div><!-- accordion-body-->
	                   </div><!-- accordion-group -->
	                 </div><!-- accordion -->
	                 
				</div> <!-- /controls	 -->
			</div> <!-- /control-group  -->
           
           <%-- 	<!-- 예방접종 등록 -->
		<h3>예방접종 등록</h3>
		<div>
			예방접종 종류 : 
			<select name="hoVaccineTypeCode">
				<option value="0">:::예방 접종 종류를 선택하시오:::</option>
				<c:forEach items="${vaccineList}" var="vaccineList">
						<option value="${vaccineList.hoVaccineTypeCode}">${vaccineList.hoVaccineTypeName}</option>
				</c:forEach>
			</select>
		</div>
		<div>
			예방접종일 : 
			<input type="date" name="hoVaccineDate">
		</div>
		 --%>
		
		
		
            </div>
          </div>
          <!-- /widget -->
          
          
          
         
        </div>
        <!-- /span6 --> 
      </div>
      <!-- /row --> 
      <input id="submitBtn" type="button" value="진료 완료">
      </form> 
    </div>
    <!-- /container --> 
  </div>
  <!-- /main-inner --> 
</div>
<!-- /main -->
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
