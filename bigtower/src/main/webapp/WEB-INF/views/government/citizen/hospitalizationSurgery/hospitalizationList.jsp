<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/government/index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입/퇴원 조회 사이트</title>
<script src="//code.jquery.com/jquery.min.js"></script>
</head>
<body>
<br>
<br>
	<table>		
		<tr>
			<td>기간</td>
			<td>		
				<input class="date" type="date" name="firstDate" id="firstDate"> ~ 
				<input class="date" type="date" name="secondDate" id="secondDate">
			</td>
		</tr>
		<tr>
			<td>병원명</td>
			<td><input class="contents" type="text" name="searchContents" id="searchContents"></td>
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
				<th>환자명</th>
				<th>입/퇴원 코드</th>
				<th>질병명</th>
				<th>입원일</th>
				<th>퇴원일</th>
			</tr>
		</thead>
		<tbody class="tbody01">
			<!-- ajax를 사용하여 append를 추가한다. -->
		</tbody>
	</table>
	<script>
		var Today = new Date();					
		document.getElementById('secondDate').valueAsDate=Today;
		
			$(".btn").bind("click",function() {
				$.ajax({
					url:'/government/hospitalizationSearch',
					type:'POST',
					data: { 'searchContents': $('#searchContents').val(),
							'secondDate' : $('#secondDate').val(),
							'firstDate' : $('#firstDate').val()
					},
					success:function(data){
						console.log('검색성공');
						$('.tbody01').empty();
						//다시 검색을 했을지 기존에 있는 데이터를 비워놓고 다시 검색한 데이터를 tbody에 출력한다.
						$.each(data, function(key, item){
							var diseaseKor = '';
							$.each(item.diagnosisList, function(key,value){
								diseaseKor += value.goDiseaseKor+', ';
							});
							var table = '<tr>'
											+'<td>'+item.goHospitalName+'</td>'
											+'<td>'+item.goCitizenName+'</td>'
											+'<td>'+item.goHospitalizationCode+'</td>'
											+'<td>'+diseaseKor+'</td>'
											+'<td>'+item.goHospitalizationEnterDate+'</td>'
											+'<td>'+item.goHospitalizationExitDate+'</td>'
										+'</tr>';
							$('.tbody01').append(table);
						})
					}
				});
			});	
	</script> 
</body>
</html>