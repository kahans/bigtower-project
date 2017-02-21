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
	<input id="searchContents" type="text" name="searchContents">
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
				<td><div id="citizenName"></div></td>
				<td id="hospitalName">${treatList.goHospitalName}</td>
				<td id="doctorName">${treatList.goDoctorName}</td>
				<td id="treatSubjectName">${treatList.goTreatSubjectName}</td>		
				<!-- 진료코드가 같은것 끼리 출력하게 된다. -->
				<td id="diseaseName">
					<c:forEach items="${treatList.diagnosisList}" var="diagnosisList">
						${diagnosisList.goDiseaseKor}<br>
					</c:forEach>
				</td>
				<td id="registrationDate">${treatList.goTreatRegistrationDate}</td>	
			</tr>
		</c:forEach>
	</table>
	
	<script>
		$(document).ready(function(){
			//기간을 선택시 date 선택창이 보이도록
			$('#selectConditions').change(function(){
				var state = $('#selectConditions option:selected').val();
				if(state == 'selectDate'){
					$('.date').show();
					$('#searchContents').hide();
				}else{
					$('.date').hide();
					$('#searchContents').show();
				}
			});
			//버튼 클릭시 검색조건 보내기
			$("#btn").bind("click",function(){
				alert('올 버튼 클릭했냐?')		
				if($('#selectConditions').val()==""){
					alert('검색할 조건을 선택하시오.');
					return;
				}
				if($('#searchContents').val()==""){
					alert('검색할 내용을 입력하시오.');
					return;
				}
				$.ajax({
					url : "/government/treatSearch",
					type : "GET",
					data : {'selectConditions' : $('#selectConditions').val(),
							'searchContents' : $('#searchContents').val()},
					success : function(data){
						console.log('성공');
						$.each(data, function(key, item) {
							
						/* 	$("#memberTbody").append("<tr>");
							$("#memberTbody").append("<td>" + item.memberNo + "</td>");
							$("#memberTbody").append("<td>" + item.memberName + "</td>");
							$("#memberTbody").append("<td>" + item.memberLevel + "</td>");
							$("#memberTbody").append("<td>" + item.memberAddress + "</td>");
							$("#memberTbody").append("<td>" + item.memberPhone + "</td>");
							$("#memberTbody").append("<td><button class='memberClass' data-dismiss='modal' value='"+item.memberNo+"'>선택</button>");
							$("#memberTbody").append("</tr>");
							 */
							 console.log('ddd');
							$('#citizenName').val(item.goCitizenName);
							$('#hospitalName').val(item.goHospitalName);
							$('#doctorName').val(item.goDoctorName);
							$('#treatSubjectName').val(item.goTreatSubjectName);
							$('#diseaseName').val(item.goDiseaseKor);
							$('#registrationDate').val(item.goTreatRegistrationDate);
						
						})

					}
				});
			}); //click functin 종료
		});
	</script>
</body>
</html>