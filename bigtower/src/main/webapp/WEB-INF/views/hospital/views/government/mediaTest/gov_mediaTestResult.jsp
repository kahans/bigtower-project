<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

	<h4>영상결과 조회</h4>
	<div>
	영상검사코드	:	${getMediaTest.goImageTestCode}
	</div>
	<div>
	진료코드	:	${getMediaTest.goTreatCode}
	</div>
	<div>
	파일경로	:	${getMediaTest.goImageTestFilePath}
	</div>
	<div>
	파일명	:	${getMediaTest.goImageTestFileName}
	</div>
	<div>
	검사일	:	${getMediaTest.goImageTestDate}
	</div>
	<div>
	검사등록일	:	${getMediaTest.goImageTestGoRegistrationDate}
	</div>
	<div>
	병원명	:	${getMediaTest.goHospitalName}
	</div>
	<div>
	병원주소	:	${getMediaTest.goHospitalAddress}
	</div>
	<div>
	환자명	:	${getMediaTest.goCitizenName}
	</div>
	<div>
	의사명	:	${getMediaTest.goDoctorName}
	</div>
	<div>
	진료과목	:	${getMediaTest.goTreatSubjectName} 
	</div>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	