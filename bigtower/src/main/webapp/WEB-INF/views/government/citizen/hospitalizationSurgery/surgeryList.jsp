<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수술 내역 조회사이트</title>
<script src="//code.jquery.com/jquery.min.js"></script>
<!-- <style type="text/css">
.date {
	display: none;
}
</style> -->
</head>
<body>
	<!-- <select id="selectBox" name="selectBox">
		<option value="1" selected="selected">선택사항 없음</option>
		<option value="goSurgeryResultGoRegistrationDate">기간</option>
		<option value="goHospitalName">병원</option>

	</select>

	<input class="date" type="date" name="firstDay" id="firstDay">
	<input class="date" type="date" name="toDay" id="toDay">

	<input class="contents" type="text" name="searchContents"
		id="searchContents">
	버튼으로 작동하게 
	<input type="button" class="btn" value="검색"> -->
	<table>
		<tr>
			<td>기간</td>
			<td>
			
				<input class="date" type="date" name="PreviousDate" id="PreviousDate"> ~ 
				<input class="date" type="date" name="todayDate" id="todayDate">
			</td>
		</tr>
		<tr>
			<td>병원명</td>
			<td><input class="contents" type="text" name="searchContents"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="button" class="btn" value="검색"></td>
		</tr>
		
	</table>
	<br>

	<table border="1">
		<thead>
			<tr>
				<th>병원명</th>
				<th>의사명</th>
				<th>수술코드</th>
				<th>수술명</th>
				<th>수술일자</th>
			</tr>
		</thead>
		<tbody>
		<!-- ajax를 사용하여 append를 추가한다. -->
		</tbody>
	</table>
	<script>
		var Today = new Date();					
		document.getElementById('todayDate').valueAsDate=Today;
		//select문에서 선택을 조건에 따라 input 태그가 숨고 보이고 하게 한다.
		/* $(document).ready(function(){
			jQuery('#selectBox').change(function() {
				var state = jQuery('#selectBox option:selected').val();
				if(state == 'goSurgeryResultGoRegistrationDate') {
					//오늘날짜 가져오기
					
					//오늘 날짜에서 3개월빼기
					
					jQuery('.date').show();
					jQuery('.contents').hide();
				} else {
					jQuery('.date').hide();
					jQuery('.contents').show();
				}
			}); */	
			$(".btn").bind("click",function() {
				//select문 value 값을 state로 선언하여 대입한다.
				//내용이 없을시 경고창 뜨우기
				$.ajax({
					url:'/government/surgerySearch',
					type:'GET',
					data: {'selectBox': $('#selectBox').val() ,
							'searchContents': $('#searchContents').val(),
							'todayDate' : $('#todayDate').val(),
							'PreviousDate' : $('#PreviousDate').val()},
					success:function(data){
						console.log('검색성공');				
						$.each(data, function(key, item){
							$('tbody').append('<tr>');
							$('tbody').append('<td>'+item.goHospitalName+'</td>');
							$('tbody').append('<td>'+item.goDoctorName+'</td>');
							$('tbody').append('<td>'+item.goSurgeryResultCode+'</td>');
							$('tbody').append('<td>'+item.goSurgeryName+'</td>');
							$('tbody').append('<td>'+item.goSurgeryResultGoRegistrationDate+'</td>');
							$('tbody').append('</tr>');
						})
					}
				});
			});
		//});		
	</script> 
</body>
</html>