<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/government/index.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Treat List</title>
</head>
<body>
	<div class="container">
		<h1>진료본 횟수</h1>
		<table>
			<thead>
				<tr>
					<td>진료과목</td>
					<td>진료횟수</td>
				</tr>
				<c:forEach items ="${treatSubjectList}" var="treatSubjectList" >
					<tr>
						<td>${treatSubjectList.goTreatSubjectName} :&nbsp;&nbsp;</td>
						<td>${treatSubjectList.goTreatSubjectCount}회</td>
					</tr>
				</c:forEach>
			</thead>
		</table>
		
		<h1>진료 목록 검색</h1>
		<h4>검색 조건을 입력하지 않을 시 모든 목록을 출력합니다</h4>
		<table>
			<thead>
				<tr>
					<td>기간 :</td> 
					<td><input class="date" type= "date" name="firstDay" id="firstDay"> ~&nbsp;&nbsp;</td>			
					<td><input class="date" type= "date" name="secondDay" id="secondDay"></td>
				</tr>
				<tr>
					<td>진료과목 :</td> 
					<td colspan="2"><input id="subjectSearch" type="text" name="subjectSearch"></td>
				</tr>
				<tr>
					<td>병원 :</td> 
					<td colspan="2"><input id="hospitalSearch" type="text" name="hospitalSearch"></td>
				</tr>
				<tr>
					<td>질병명:</td> 
					<td colspan="2"><input id="diseaseSearch" type="text" name="diseaseSearch"></td>
				</tr>
				<tr>
					<td>의사명:</td> 
					<td colspan="2"><input id="doctorSearch" type="text" name="doctorSearch"></td>
				</tr>
			</thead>
		</table>
		<br>
		<input type="button" id="btn" value="검색">
		
		
		
		<br><br>
		<h1>진료 목록</h1>
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
				//버튼 클릭시 검색조건과 내용에 부합하는 목록 출력하기
				$("#btn").bind("click",function(){		
					
					$.ajax({
						url : "/government/treatSearch",
						type : "POST",
						data : {'firstDay' : $('#firstDay').val(),
								'secondDay' : $('#secondDay').val(),
								'subjectSearch' : $('#subjectSearch').val(),
								'hospitalSearch' : $('#hospitalSearch').val(),
								'diseaseSearch' : $('#diseaseSearch').val(),
								'doctorSearch' : $('#doctorSearch').val()},
						//함수가 성공하면
						success : function(data){
							console.log('성공');
							$('tbody').empty();
							var count = data.length;
							console.log('count:'+count);
							alert(count + '건이 검색되었습니다.');
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
								var table = 
									'<tr>'
										+'<td><a href="<c:url value="/government/treatView?goTreatCode='+item.goTreatCode+'" />">'+item.goTreatCode+'</a></td>'
										+'<td>'+item.goCitizenName+'</td>'
										+'<td>'+item.goHospitalName+'</td>'
										+'<td>'+item.goDoctorName+'</td>'
										+'<td>'+item.goTreatSubjectName+'</td>'
										+'<td>'
										+diseaseKor+'</td>'
										+'<td>'+item.goTreatRegistrationDate+'</td>'			
									+'</tr>';
								$('tbody').append(table);								
							})	
						}
					});
				}); //click functin 종료
			});
		</script>
	</div>
</body>
</html>