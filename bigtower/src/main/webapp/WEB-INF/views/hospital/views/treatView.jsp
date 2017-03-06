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
           		<div class="selectAdd">	
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
		
		<input type="submit" value="완료">
	</form>
	
	<!-- 검사 요청 -->
	<h3>검사 요청</h3>	
	<form action="<c:url value='/hospital/testRequest'/>" method="post">
		<select>
			<option>:::검사를 선택하시오:::</option>
			<c:forEach items="${testList}" var="testList">
				<option value="${testList.hoTestCode}">${testList.hoTestName}</option>
			</c:forEach>
		</select>
		<input type="submit" value="검사요청"> 
	</form>
	
	<!-- 입/퇴원 요청 -->
	<h3>입/퇴원 요청</h3>
	<form action="<c:url value='/hospital/hospitalizationRequest'/>" method="post">
		<input type="hidden" value="${hoTreat.hoTreatmentCode}" name="hoTreatmentCode">
		<input type="submit" value="입퇴원요청"> 
	</form>
	
	<!-- 수술 요청 -->
	<h3>수술 요청</h3>
	<form action="<c:url value='/hospital/addOperation'/>" method="post">
		<input type="hidden" value="${hoTreat.hoTreatmentCode}" name="hoTreatmentCode">
		<div>
			수술날짜 :
			<input type="date" name="hoOperationStartDate">
		</div>
		<div>
			수술명 : 
			<select name="hoOperationTypeCode">
				<option>:::수술을 선택하시오:::</option>
				<c:forEach items="${operationList}" var="operationList">
					<option value="${operationList.hoOperationTypeCode}">${operationList.hoOperationTypeName}</option>
				</c:forEach>
			</select>
		</div>
		<input type="submit" value="요청 등록">
	</form>
	
	<!-- 처방 요청 -->
	<h3>처방전 작성</h3>
	<a href="<c:url value='/hospital/addPrescription?hoTreatmentCode=${hoTreat.hoTreatmentCode}'/>"><button>처방전 작성</button></a>
	
	<!-- 예방접종 등록 -->
	<h3>예방접종 등록</h3>
	<form action="<c:url value='/hospital/addVaccine'/>" method="post">
		<input type="hidden" value="${hoTreat.hoTreatmentCode}" name="hoTreatmentCode">
		<div>
			예방접종 종류 : 
			<select name="hoVaccineTypeCode">
				<option>:::예방 접종 종류를 선택하시오:::</option>
				<c:forEach items="${vaccineList}" var="vaccineList">
						<option value="${vaccineList.hoVaccineTypeCode}">${vaccineList.hoVaccineTypeName}</option>
				</c:forEach>
			</select>
		</div>
		<div>
			예방접종일 : 
			<input type="date" name="hoVaccineDate">
		</div>
		<input type="submit" value="예방접종 등록">
	</form>
	
	<script>
		//추가버튼 클릭시 이벤트
		$(document).on('click','#diseaseNameAdd',function(){
			var addSelect = $('#hiddenPrescription').html();
			$(this).parents('#prescription').append(addSelect);	
		});
		
		$(document).on('click','#diseaseNameRemove',function(){
			$(this).parent('.selectAdd').remove();		
		});
	</script>
</body>
</html>