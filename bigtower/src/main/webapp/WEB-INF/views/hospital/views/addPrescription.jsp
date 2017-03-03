<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form action="<c:url value='/hospital/addPrescription'/>" method="post">
		<input type="hidden" value="${hoTreatmentCode}" name="hoTreatmentCode">
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
			질병명 :
			<div id="medicine">
           		<div>
            		<select name="hoMedicineCode">
            			<option value="0">약품명</option>
		           		<c:forEach items="${medicineList}" var="medicineList">
							<option value="${medicineList.hoMedicineCode}">${medicineList.hoMedicineName}</option>
						</c:forEach>                           			
            		</select>
            		<!-- <button type="button" id="medicineNameAdd">추가</button> -->
           		</div>
           	</div>
	           	
	           	
           	<%-- <div id="hiddenMedicine" style="display: none;">
           		<div class="selectAdd">	
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
           	</div> --%>
		</div>					
		<input type="submit" value="완료">
	</form>
	
	<script>
		//추가버튼 클릭시 이벤트
		$(document).on('click','#medicineNameAdd',function(){
			var addSelect = $('#hiddenMedicine').html();
			$(this).parents('#medicine').append(addSelect);	
		});
		
		$(document).on('click','#medicineNameRemove',function(){
			$(this).parent('.selectAdd').remove();		
		});
	</script>
</body>
</html>