<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<h1>gov_searchForm</h1>
<h4>진료 조회</h4>
<h5>주민번호로 조회</h5>
	<form action="<c:url value='/government/getListTreatByDoctorId'/>" method="post">
		<input type="submit" value="내 환자 진료목록조회"/>
	</form>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
