<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
	<h1>수술일지 관리</h1>
	<form action="<c:url value='/hospital/operationView'/>" method="post" >		
		<input type="hidden" value="${hoOperation.hoOperationCode}" name="hoOperationCode">
		<div>
			환자명 : 
			<input type="text" value="${hoOperation.hoPatientName}">
		</div>
		<div>
			수술명 : 
			<input type="text" value="${hoOperation.hoOperationTypeName}">			
		</div>
		<div>
			수술시작일 : 
			<input type="text" value="${hoOperation.hoOperationStartDate}" name="hoOperationStartDate" id="hoOperationStartDate">			
		</div>
		<div>
			수술종료일 :
			<input type="date" value="${hoOperation.hoOperationEndDate}" name="hoOperationEndDate">			
		</div>
			수술일지
		<div>		
			<textarea cols="100" rows="10" name="hoOperationDiary" >${hoOperation.hoOperationDiary}</textarea>
		</div>
		<input type="submit" value="수정 완료">	
	</form>	
	
	<!-- <script>
		var Today = new Date();
		document.getElementById('hoOperationStartDate').valueAsDate = ${hoOperation.hoOperationStartDate};
	</script> -->
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	