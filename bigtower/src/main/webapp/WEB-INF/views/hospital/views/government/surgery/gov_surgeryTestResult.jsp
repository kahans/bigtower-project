<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>

	<h4>수술 결과 조회</h4>
	<div>
		수술결과코드	:	${getSurgery.goSurgeryResultCode}
	</div>
	<div>
		진료코드	:	${getSurgery.goTreatCode}
	</div>
	<div>
		수술코드	:	${getSurgery.goSurgeryCode}
	</div>
	<div>
		수술명	:	${getSurgery.goSurgeryName}
	</div>
	<div>
		수술일	:	${getSurgery.goSurgeryResultRegistrationDate}
	</div>
	<div>
		병원명	:	${getSurgery.goHospitalName}
	</div>
	<div>
		병원주소	:	${getSurgery.goHospitalAddress}
	</div>
	<div>
		의사명	:	${getSurgery.goDoctorName}
	</div>
	<div>
		환자명	:	${getSurgery.goCitizenName}
	</div>
	<div>
		정부등록일	:	${getSurgery.goSurgeryResultGoRegistrationDate}
	</div>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	