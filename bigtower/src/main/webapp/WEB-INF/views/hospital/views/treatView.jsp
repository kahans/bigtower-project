<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>
	<!-- 진료 정보 보여주기 -->
	<h3>진료 정보</h3>
	<form action="<c:url value='/hospital/treatView'/>" method="post">
		<input type="hidden" value="${hoTreat.hoTreatmentCode}" name="hoTreatmentCode">
		<div>
			의사명 :
			<input type="text" value="${hoTreat.hoDoctorName}">
		</div>
		<div>
			차트번호 :
			<input type="text" value="${hoTreat.hoChartCode}">
		</div>
		<div>
			환자명 :
			<input type="text" value="${hoTreat.hoPatientName}">
		</div>
		<div>
			진료과목 :
			<input type="text" value="${hoTreat.hoTreatSubjectName}">
		</div>
		
		<!-- 질병 추가 -->
		<div>
			질병 선택
			<div id="prescription">
           		<div>
            		<select name="diseaseSelect">
            			<option value="0">질병명</option>
		           		<c:forEach items="${diseaseList}" var="diseaseList">
							<option value="${diseaseList.hoDiseaseCode}">${diseaseList.hoDiseaseKor}</option>
						</c:forEach>                           			
            		</select>
            		<button type="button" id="diseaseNameAdd">추가</button>
           		</div>
           	</div>
	           	
	        <!-- 질병 추가시 추가되는 폼 -->   	
           	<div id="hiddenPrescription" style="display: none;">
           		<div class="addDisease">	
            		<select name="diseaseSelect">
            			<!-- +버튼 눌렀을 때 추가되는 selectBox 마찬가지로 for문으로 list값 가져와야함 -->
            			<option value="0">질병명</option>
            			<c:forEach items="${diseaseList}" var="diseaseList">
							<option value="${diseaseList.hoDiseaseCode}">${diseaseList.hoDiseaseKor}</option>
						</c:forEach>                           			
            		</select>
            		<button type="button" id="diseaseNameAdd">추가</button>
            		<button type="button" id="diseaseNameRemove">삭제</button>        
           		</div>
           	</div>
		</div>
		
			진료내용	
		<div>			
			<textarea rows="10" cols="50" name="hoTreatmentContents">
			</textarea>
		</div>
		
	
	
	
		<!-- 검사 요청 -->
		<h3>검사 요청</h3>
		<input type="checkbox" name="hoTestCode" value="1">혈액검사	
		<input type="checkbox" name="hoTestCode" value="2">영상검사
		<input type="checkbox" name="hoTestCode" value="3">건강검진
		<%-- 
		<select name="hoTestCode">
			<option value="0">:::검사를 선택하시오:::</option>
			<c:forEach items="${testList}" var="testList">
				<option value="${testList.hoTestCode}">${testList.hoTestName}</option>
			</c:forEach>
		</select>
		 --%>
	
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
					<option value="${operationList.hoOperationTypeCode}">${operationList.hoOperationTypeName}</option>
				</c:forEach>
			</select>
		</div>
		
	
		<!-- 처방 요청 -->
		<h3>처방전 작성</h3>
		<a href="<c:url value='/hospital/addPrescription?hoTreatmentCode=${hoTreat.hoTreatmentCode}'/>"><button>처방전 작성</button></a>
		<div>
			일일투약량 :
			<input type="text" name="hoPrescriptionDailydose">
		</div>
		<div>
			일일투약횟수 :
			<input type="text" name="hoPrescriptionDailycount">
		</div>
		<div>
			총투약일수 :
			<input type="text" name="hoPrescriptionTotalday">
		</div>
		<div>
			용법 :
			<input type="text" name="hoPrescriptionUsage">
		</div>
		<div>
			약품명 :
			<div id="medicine">
           		<div>
            		<select name="medicineSelect">
            			<option value="0">약품명</option>
		           		<c:forEach items="${medicineList}" var="medicineList">
							<option value="${medicineList.hoMedicineCode}">${medicineList.hoMedicineName}</option>
						</c:forEach>                           			
            		</select>
            		<button type="button" id="medicineNameAdd">추가</button>
           		</div>
           	</div>
	           	
	           	
           	<div id="hiddenMedicine" style="display: none;">
           		<div class="addMedicine">	
            		<select name="medicineSelect">
            			<!-- +버튼 눌렀을 때 추가되는 selectBox 마찬가지로 for문으로 list값 가져와야함 -->
            			<option value="0">약품명</option>
            			<c:forEach items="${medicineList}" var="medicineList">
							<option value="${medicineList.hoMedicineCode}">${medicineList.hoMedicineName}</option>
						</c:forEach>                          			
            		</select>
            		<button type="button" id="medicineNameAdd">추가</button>
            		<button type="button" id="medicineNameRemove">삭제</button>        
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
		<input type="submit" value="진료 완료">
	</form>
	
	<script>
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
		
	</script>
</body>
</html>