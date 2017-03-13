<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/government/gov_searchButton.jsp" %>

	<h4>혈액검사 결과 조회</h4>
	<div>
	예방접종결과코드	:	${goVaccinationResult.goVaccinationResultCode} 
	</div>
	<div>
	진료코드	:	${goVaccinationResult.goTreatCode}
	</div>
	<div>
	예방접종코드	:	${goVaccinationResult.goVaccinationCode}
	</div>
	<div>
	예방접종차수	:	${goVaccinationResult.goVaccinationResultDegree}
	</div>
	<div>
	병원결과등록일	:	${goVaccinationResult.goVaccinationResultRegistrationDate}
	</div>
	<div>
	정부DB등록일	:	${goVaccinationResult.goVaccinationResultGoRegistrationDate}
	</div><!-- 클릭시 호스팅에서 파일을 보거나 다운을 받는다. -->
	<div>
	예방접종명	:	${goVaccinationResult.goVaccinationName}
	</div>
	<div>
	병원명	:	${goVaccinationResult.goHospitalName}
	</div>
	<div>
	병원주소	:	${goVaccinationResult.goHospitalAddress}
	</div>
	<div>
	환자명	:	${goVaccinationResult.goCitizenName}
	</div>
	<div>
	의사명	:	${goVaccinationResult.goDoctorName}
	</div>
	<div>
	진료과목	:	${getBloodTest.goTreatSubjectName}
	</div>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
	