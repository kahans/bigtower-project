<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수술 내역 조회사이트</title>
<script src="//code.jquery.com/jquery.min.js"></script>
<style type="text/css">
.date { display: none; }
</style>
</head>
<body>
	<script>
		$(document).ready(function(){
			jQuery('#selectBox').change(function() {
				var state = jQuery('#selectBox option:selected').val();
				if(state == 'goSurgeryResultGoRegistrationDate') {
					jQuery('.date').show();
					jQuery('.contents').hide();
				} else {
					jQuery('.date').hide();
					jQuery('.contents').show();
				}
			});	
			$(".btn").bind("click",function() {
				//select문 value 값을 state로 선언하여 대입한다.
				var state = $('#selectBox option:selected').val();
				var content = $('#searchContents').val();
				if(state == '') {
					//goSurgeryResultGoRegistrationDate
					//기간을 선택시 두개의 기간을 대입한다.
					//var allData = { 'goSurgeryResultGoRegistrationDate' : state, 'firstDay': $('#firstDay').val() , 'secondDay': $('#secondDay').val()};
					alert('조건을 선택하세요.');
					return;
				}
				if(content == '') {
					//goHospitalName
					//기간을 선택시 두개의 기간을 대입한다.					
					//var allData = { 'goSurgeryResultGoRegistrationDate' : state, 'firstDay': $('#firstDay').val() , 'secondDay': $('#secondDay').val()};
					alert('내욜을 입력하시오');
					return;
				}
				
				$.ajax({
					url:'/government/surgerySearch',
					type:'GET',
					data: {'selectBox': state ,
							'searchContents':content }
					success:function(data){
						console.log('검색성공');				
						$.each(data, function(key, item){
							
						});
						
						/* //병원 검색
						if(allData.goHospitalName == "goHospitalName"){
							$('#goHospitalName').val(allData.goHospitalName);
							$('#searchContents').val(allData.searchContents);
						}else{
						//기간검색
							$('#goSurgeryResultGoRegistrationDate').val(allData.goSurgeryResultGoRegistrationDate);
							$('#firstDay').val(allData.firstDay);
							$('#secondDay').val(allData.secondDay);
						} */
					},
					error : function(error){
						alert('몰라 하세요.');
					}
				});
			});
		});		
	</script> 
		
		<select id="selectBox" name="selectBox">
			<option value="1" selected="selected">선택사항 없음</option>
			<option value="goSurgeryResultGoRegistrationDate">기간</option>
			<option value="goHospitalName">병원</option>
			
		</select>
		
		<input class="date" type= "date" name="firstDay" id="firstDay">
		<input class="date" type= "date" name="secondDay" id="secondDay">
		
		<input class="contents" type="text" name="searchContents" id="searchContents">
		<!-- 버튼으로 작동하게  -->
		<input type="button" class="btn" value="검색">
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
			<%-- <c:forEach var="goSurgery" items="${goSurgery}">
				<tr>
					<td>${goSurgery.goHospitalName}</td>
					<td>${goSurgery.goDoctorName}</td>
					<td>${goSurgery.goSurgeryResultCode}</td>
					<td>${goSurgery.goSurgeryName}</td>
					<td>${goSurgery.goSurgeryResultGoRegistrationDate}</td>	
				</tr>
			</c:forEach> --%>
		</tbody>
	</table>
</body>
</html>