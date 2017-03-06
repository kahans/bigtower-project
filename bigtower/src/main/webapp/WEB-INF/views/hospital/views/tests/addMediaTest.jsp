<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영상검사 결과 등록</title>
</head>
<body>
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
		<div>
			결과 이미지 등록 : 
			<input type="file" name="uploadFile ">
		</div>	
		<div>
			<button>등록</button>
		</div>
	</form>
</body>
</html>