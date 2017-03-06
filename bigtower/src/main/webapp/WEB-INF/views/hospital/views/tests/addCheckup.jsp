<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>건강검진 결과등록</h1>
	<form action="<c:url value='/hospital/test/addCheckup'/>" method="post" enctype="multipart/form-data">
		<div>
			검사명 : 
			<input type="text" name="hoTestName" required="required" value="${checkView.hoTestName }">
			<input type="hidden" name="hoTestCode" required="required" value="${checkView.hoTestCode }">
			<input type="hidden" name="hoTestRequestCode" required="required" value="${checkView.hoTestRequestCode }">
		</div>
		<div>
			진료코드 : 
			<input type="text"  name="hoTreatmentCode" required="required" value="${checkView.hoTreatmentCode}">
		</div>
		<div>
			환자명 : 
			<input type="text" name="hoPatientName" required="required" value="${checkView.hoPatientName}">
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