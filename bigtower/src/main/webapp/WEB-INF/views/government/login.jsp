<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<title>정부 로그인 페이지</title>
<script>
	$(document).ready(function(){
	    //기간을 선택시 date 선택창이 보이도록
	    $('.loginOption').change(function(){
	        console.log('변경');
	    	var state = $(':input[name=option]:radio:checked').val();
	        if(state === 'citizen'){
	            $('#citizenLogin').show();
	            $('#hospitalLogin').hide();
	        }else if(state === 'hospital'){
	            $('#hospitalLogin').show();
	            $('#citizenLogin').hide();
	        }
	    });
	});


</script>
</head>
<body>
<h1>login.jsp</h1>
<label>
	<input type="radio" name="option" class="loginOption" value="citizen">국민 로그인
</label>
<label>
	<input type="radio" name="option" class="loginOption" value="hospital">병원 로그인
</label>
<!-- 국민 로그인 폼 -->
<div id="citizenLogin" style="display:none">
	<h3>국민 로그인</h3>
	<form action="<c:url value="/government/loginCitizen"/>" method="post">
		주민번호 : 
		<input type="text" name="birthDate" placeholder="생년월일" size="6" maxlength='6' value="900101">
		 - 
	 	<input type="text" name="serialNo" placeholder="주민번호 뒷자리" size="7" maxlength='7' value="1000001"><br>
	 	비밀번호 : 
	 	<input type="password" name="goCitizenPw" placeholder="국민 비밀번호" size="8" value="pw001"><br>
	 	<input type="submit" value="로그인">
	</form>
</div>

<!-- 병원 로그인 폼 -->
<div id="hospitalLogin" style="display:none">
	<h3>병원 로그인</h3>
	<form action="<c:url value="/government/loginHospital"/>" method="post">
		병원아이디 : 
		<input type="text" name="goHospitalId" placeholder="병원 아이디" size="8" value="hospital_1"><br>
		병원 비밀번호 : 
		<input type="password" name="goHospitalPw" placeholder="병원 비밀번호" size="8" value="pw001"><br>
	 	<input type="submit" value="로그인">
	</form>
</div>

</body>
</html>