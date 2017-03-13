<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

	<h1>영상검사 결과등록</h1>
	<!-- enctype="multipart/form-data"  -->
	<form action="<c:url value='/hospital/test/addMediaTest'/>" method="post" enctype="multipart/form-data">
		<div>
			검사명 : 
			<input type="text" name="hoTestName" required="required" value="${mediaView.hoTestName }">
			<input type="hidden" name="hoTestCode" required="required" value="${mediaView.hoTestCode }">
			<input type="hidden" name="hoTestRequestCode" required="required" value="${mediaView.hoTestRequestCode }">
		</div>
		<div>
			진료코드 : 
			<input type="text"  name="hoTreatmentCode" required="required" value="${mediaView.hoTreatmentCode}">
		</div>
		<div>
			환자명 : 
			<input type="text" name="hoPatientName" required="required" value="${mediaView.hoPatientName}">
		</div>
			
		<div>
			<input type="hidden" name="hoTestStateCode" value="3" required="required">
		</div>
		<!-- 영상검사 결과 이미지를 여러개 입력할수 한다.-->
		
		<div id="uploadFile">
			<div>
				결과 이미지 등록 : 
				<input type="file" name="uploadFile">
				<button type="button" id="addUploadFile">추가</button>
			</div>
		</div>
			
		<div>
			<button>등록</button>
		</div>
	</form>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
