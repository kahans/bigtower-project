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
		<thead>
			<tr>
				<td>진료코드</td>
				<td>이름</td>
				<td>병원명</td>
				<td>의사명</td>
				<td>진료과목</td>
				<td>질병명</td>
				<td>진료등록일</td>
			</tr>
		</thead>
		<!-- 진료테이블에 있는 데이터를 목록으로 출력한다. -->
		<tbody>
		</tbody>

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
			//버튼 클릭시 검색조건과 내용에 부합하는 목록 출력하기
			$("#btn").bind("click",function(){		
				if($('#selectConditions').val()==""){
					alert('검색할 조건을 선택하시오.');
					return;
				}
				/* if($('#searchContents').val()==""){
					alert('검색할 내용을 입력하시오.');
					return;
				} */
				$.ajax({
					url : "/government/treatSearch",
					type : "GET",
					data : {'selectConditions' : $('#selectConditions').val(),
							'searchContents' : $('#searchContents').val(),
							'firstDay' : $('#firstDay').val(),
							'secondDay' : $('#secondDay').val()},
					//함수가 성공하면
					success : function(data){
						console.log('성공');
						$('tbody').empty();
						//반복문을 통해 검색조건에 맞는 목록을 출력한다
						$.each(data, function(key, item) {  
							console.log('goCitizenName:'+item.goCitizenName);
						 	var diseaseKor = '';
						 	//질병목록 가져오는 반복문
						 	$.each(item.diagnosisList, function(key, value) {
								console.log('test');
								console.log('value'+value);
								console.log('value.goDiseaseKor'+value.goDiseaseKor);
								diseaseKor += value.goDiseaseKor+',';
							});
							var table = '<tr>'
											+'<td><a href="<c:url value="/government/treatView?goTreatCode='+item.goTreatCode+'" />">'+item.goTreatCode+'</a></td>'
											+'<td>'+item.goCitizenName+'</td>'
											+'<td>'+item.goHospitalName+'</td>'
											+'<td>'+item.goDoctorName+'</td>'
											+'<td>'+item.goTreatSubjectName+'</td>'
											+'<td>'
											+diseaseKor+'</td>'
											+'<td>'+item.goTreatRegistrationDate+'</td>'
										+'</tr>';
										console.log(table);
							$('tbody').append(table);								
						})

					}
				});
			}); //click functin 종료
		});
	</script>
</body>
</html>