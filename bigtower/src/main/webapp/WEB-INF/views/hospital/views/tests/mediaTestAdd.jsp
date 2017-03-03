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
	<form action="<c:url value='/hospital/test/mediaTestAdd'/>" method="post">
		<div>
			검사명 : 
			<input type="text" id="hoTestState" name="hoTestState" value="${mediaView.hoTestName }">
			<input type="hidden" id="hoTestRequestCode" name="hoTestRequestCode" value="${mediaView.hoTestRequestCode }">
		</div>
		<div>
			진료코드 : 
			<input type="text" id="hoTreatmentCode"  name="hoTreatmentCode" value="${mediaView.hoTreatmentCode}">
		</div>
		<div>
			환자명 : 
			<input type="text" id="hopatientName" name="hopatientName" value="${mediaView.hoPatientName}">
		</div>
		<div>
			결과 이미지 등록 : 
			<input type="file" id="hoMediaFile" name="hoMediaFile">
		</div>
		<div>
			<input type="submit" name="result" value="등록">
		</div>
		<div>
			<input type="hidden" name="hoTestStateCode" value="3">
		</div>
	</form>
</body>
</html>