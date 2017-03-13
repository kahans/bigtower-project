<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

	<h1>진료 조회 목록</h1>

	<a href="<c:url value='/government/getListBloodTestResultByCitizenId?citizenId=${citizenId}'/>"><button type="button">혈액검사</button></a>
	<a href="<c:url value='/government/getListImageTestResultByCitizenId?citizenId=${citizenId}'/>"><button type="button">영상검사</button></a>
	<a href="<c:url value='/government/getListCheckupResultByCitizenId?citizenId=${citizenId}'/>"><button type="button">건강검진</button></a>
	<a href="<c:url value='/government/getListSurgeryByCitizenId?citizenId=${citizenId}'/>"><button type="button">수술내역</button></a>
	<a href="<c:url value='/government/getListHospitalizationByCitizenId?citizenId=${citizenId}'/>"><button type="button">입원내역</button></a>
	<a href="<c:url value='/government/getListDiagnosisByCitizenId?citizenId=${citizenId}'/>"><button type="button">진단</button></a>
	<a href="<c:url value='/government/getListPrescriptionByCitizenId?citizenId=${citizenId}'/>"><button type="button">처방</button></a>
