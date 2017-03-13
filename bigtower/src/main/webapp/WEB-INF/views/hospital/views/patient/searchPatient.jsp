<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
	<h1>메인화면</h1>


	<h2>환자 조회</h2>
	<h3>환자 정보가 없을 시 환자등록 화면으로 이동</h3>
	<form action="<c:url value='/hospital/searchPatient'/>" method="post">
		<div>
			주민번호 : 
			<input type="text" id="idfirst" name="idfirst" value="900101" maxlength="6">
			- 
			<input type="text" id="idsecond" name="idsecond" value="1000001" maxlength="7">
		</div>
		<br>
		<div>
			이름 : <input type="text" id="hoPatientName" name="hoPatientName" value="도우너">
		</div>

		<input type="submit" id="btn" name="btn">
	</form>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
