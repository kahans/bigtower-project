<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

	<h1>영상검사 결과조회</h1>
	<!-- MediaTestResult를 출력 -->
	<form action="<c:url value='/government/getOneImageTestResultByTreatCode'/>" method="post">
		진료코드로 조회
		<input type="text" name="treatCode"/>
		<input type="submit" value="조회"/>
	</form>
	<br/>
	<!-- listMediaTestResult를 출력 -->
	<form action="<c:url value='/government/getListImageTestResultByCitizenId'/>" method="post">
		주민번호로 조회
		<input type="text" name="citizenId"/>
		<input type="submit" value="조회"/>
	</form>
	
	<form action="<c:url value='/government/getListImageTestResultByDoctorId'/>" method="post">
		의사코드로 조회(추후 세션에서 받아서 요청처리하도록 변경할예정)
		<input type="text" name="doctorId"/>
		<input type="submit" value="조회"/>
	</form>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	