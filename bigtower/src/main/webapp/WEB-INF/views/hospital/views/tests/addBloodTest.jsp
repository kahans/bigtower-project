<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

	<h1>혈액검사 결과등록</h1>
	<form action="<c:url value='/hospital/test/addBloodTest'/>" method="post" enctype="multipart/form-data">
		<div>
			검사명 : 
			<input type="text" name="hoTestName" required="required" value="${bloodView.hoTestName }">
			<input type="hidden" name="hoTestCode" required="required" value="${bloodView.hoTestCode }">
			<input type="hidden" name="hoTestRequestCode" required="required" value="${bloodView.hoTestRequestCode }">
		</div>
		<div>
			진료코드 : 
			<input type="text"  name="hoTreatmentCode" required="required" value="${bloodView.hoTreatmentCode}">
		</div>
		<div>
			환자명 : 
			<input type="text" name="hoPatientName" required="required" value="${bloodView.hoPatientName}">
		</div>
		<div>
			혈소판 : 
			<input type="text" name="hoBloodTestPlatelet"><br>
			정상수치 : 5~10
		</div>
		<div>
			혈당 : 
			<input type="text" name="hoBloodTestSugar"><br>
			정상수치 : 5~10
		</div>
		<div>
			<input type="hidden" name="hoTestStateCode" value="3" required="required">
		</div>
		<div>
			결과 이미지 등록 : 
			<input type="file" name="uploadFile ">
		</div>	
		<div>
			<button>등록</button>
		</div>
	</form>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	