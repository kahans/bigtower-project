<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
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
			<input type="text" value="${hoOperation.hoOperationStartDate}">			
		</div>
		<div>
			수술종료일 :
			<input type="date" name="hoOperationEndDate" value="${hoOperation.hoOperationEndDate}">			
		</div>
			수술일지
		<div>		
			<textarea cols="100" rows="10" name="hoOperationDiary" >
				${hoOperation.hoOperationDiary}
			</textarea>
		</div>
		<input type="submit" value="수정 완료">	
	</form>	
	
</body>
</html>