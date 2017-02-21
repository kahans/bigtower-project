<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<style>
	.date {display:none;}
</style>
</head>
<body>
	
	<!-- 기간을 선택하면 날짜를 선택할 수 있는 date type창이 활성화되고, 나머지 창에는 text창이 활성화된다. --> 
	<select id="selectConditions" name="selectConditions">
		<option value="selectNone" selected="selected">선택사항 없음</option>
		<option value="selectDate">기간</option>
		<option value="selectSubject">진료과목</option>
		<option value="selectHospital">병원</option>
		<option value="selectDisease">질병명</option>
		<option value="selectDoctor">의사명</option>
	</select>
	<input class="date" type= "date" name="firstDay" id="firstDay">
	<input class="date" type= "date" name="secondDay" id="secondDay">
	<input class="contents" type="text" name="searchContents">
	<input type="button" id="btn" value="검색">
	
	<br><br>
	
	<table border="1">
		<tr>
			<td>진료코드</td>
			<td>이름</td>
			<td>병원명</td>
			<td>의사명</td>
			<td>진료과목</td>
			<td>질병명</td>
			<td>진료등록일</td>
		</tr>
		<!-- 진료테이블에 있는 데이터를 목록으로 출력한다. -->
		<c:forEach items="${goTreatList}" var="treatList">
			<tr>
				<td><a href="<c:url value='/government/treatView?goTreatCode=${treatList.goTreatCode}' />">${treatList.goTreatCode}</a></td>
				<td>${treatList.goCitizenName}</td>
				<td>${treatList.goHospitalName}</td>
				<td>${treatList.goDoctorName}</td>
				<td>${treatList.goTreatSubjectName}</td>		
				<!-- 진료코드가 같은것 끼리 출력하게 된다. -->
				<td>
					<c:forEach items="${treatList.diagnosisList}" var="diagnosisList">
						${diagnosisList.goDiseaseKor}<br>
					</c:forEach>
				</td>
				<td>${treatList.goTreatRegistrationDate}</td>	
			</tr>
		</c:forEach>
	</table>
	
	<script>
		$(document).ready(function(){
			$('#selectConditions').change(function(){
				var state = $('#selectConditions option:selected').val();
				if(state == 'selectDate'){
					$('.date').show();
					$('.contents').hide();
				}else{
					$('.date').hide();
					$('.contents').show();
				}
			});
			$("#btn").bind("click",function(){
				if($('#selectConditions'.val()==""){
					alert('검색할 조건을 선택하시오.');
					return;
				}
				if($('.contents'.val()==""){
					alert('검색할 내용을 입력하시오.');
					return;
				}
				$.ajax({
					url : "/government/treatSearch",
					type : "GET",
					data : {'selectConditions' : $('#selectConditions').val()},
					{'contents' : $('.contents').val()},
					
							
				})
			})
		});

	</script>
</body>
</html>