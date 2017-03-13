<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<h4>수술 결과 조회</h4>
	<div>
		입퇴원코드	:	${hopitalization.goHospitalizationCode}
	</div>
	<div>
		진료코드	:	${hopitalization.goTreatCode}
	</div>
	<div>
		입원일자	:	${hopitalization.goHospitalizationEnterDate}
	</div>
	<div>
		퇴원일자	:	${hopitalization.goHospitalizationExitDate}
	</div>
	<div>
		병원명	:	${hopitalization.goHospitalName}
	</div>
	<div>
		병원주소	:	${hopitalization.goHospitalAddress}
	</div>
	<div>
		환자명	:	${hopitalization.goCitizenName}
	</div>
	<div>
		의사명	:	${hopitalization.goDoctorName}
	</div>
	<div>
		진료과목	:	${hopitalization.goTreatSubjectName}
	</div>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
