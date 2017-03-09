<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>혈액검사 결과 조회</h4>
	<div>
	혈액검사코드	:	${getBloodTest.goBloodTestCode} 
	</div>
	<div>
	진료코드	:	${getBloodTest.goTreatCode}
	</div>
	<div>
	혈당	:	${getBloodTest.goBloodTestBloodSugar}
	</div>
	<div>
	혈소판	:	${getBloodTest.goBloodTestPlatelet}
	</div>
	<div>
	파일경로	:	${getBloodTest.goBloodTestFilePath}
	</div>
	<div>
	파일명	:	${getBloodTest.goBloodTestFileName}
	</div><!-- 클릭시 호스팅에서 파일을 보거나 다운을 받는다. -->
	<div>
	검사일	:	${getBloodTest.goBloodTestDate}
	</div>
	<div>
	검사등록일	:	${getBloodTest.goBloodTestGoRegistrationDate}
	</div>
	<div>
	병원명	:	${getBloodTest.goHospitalName}
	</div>
	<div>
	병원주소	:	${getBloodTest.goHospitalAddress}
	</div>
	<div>
	환자명	:	${getBloodTest.goCitizenName}
	</div>
	<div>
	의사명	:	${getBloodTest.goDoctorName}
	</div>
	<div>
	진료과목	:	${getBloodTest.goTreatSubjectName}
	</div>
</body>
</html>