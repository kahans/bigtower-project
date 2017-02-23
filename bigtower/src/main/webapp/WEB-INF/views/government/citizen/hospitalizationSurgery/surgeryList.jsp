<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수술 내역 조회사이트</title>
<script src="//code.jquery.com/jquery.min.js"></script>
</head>
<body>
	<c:choose>
		<c:when test="${goHospitalId==null && goCitizenNo ==null}">
			<a href="<c:url value="/government/login"/>">로그인</a>
		</c:when>
		<c:when test="${goCitizenNo !=null}">
			${goCitizenName} 님 로그인중 <a href="<c:url value="/government/logout"/>">로그아웃</a><br>
			
			<a href="<c:url value="/government/goTest"/>">검사</a>
			<a href="<c:url value="/government/treatList"/>">진료</a>
			<a href="<c:url value='/government/surgeryList'/>">수술내역</a>
			<a href="<c:url value='/government/hospitalizationList'/>">입/퇴원내역</a>
			
		</c:when>
		<c:when test="${goHospitalId !=null}">
			병원 로그인성공<br>
			${goHospitalName} 님 로그인중 <a href="<c:url value="/government/logout"/>">로그아웃</a>
		</c:when>
	</c:choose>
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
				<th>의사명</th>
				<th>환자명</th>
				<th>수술코드</th>
				<th>수술명</th>
				<th>수술일자</th>
			</tr>
		</thead>
		<tbody class="tbody">
		<!-- ajax를 사용하여 append를 추가한다. -->
		</tbody>
	</table>
	<script>
		var Today = new Date();					
		document.getElementById('secondDate').valueAsDate=Today;
		
			$(".btn").bind("click",function() {
				$.ajax({
					url:'/government/surgerySearch',
					type:'GET',
					data: {	'searchContents': $('#searchContents').val(),
							'secondDate' : $('#secondDate').val(),
							'firstDate' : $('#firstDate').val()},
					success:function(data){
						console.log('검색성공');
						$('.tbody').empty();
						//다시 검색을 했을지 기존에 있는 데이터를 비워놓고 다시 검색한 데이터를 tbody에 출력한다.
						$.each(data, function(key, item){
							$('.tbody').append('<tr>');
							$('.tbody').append('<td>'+item.goHospitalName+'</td>');
							$('.tbody').append('<td>'+item.goDoctorName+'</td>');
							$('.tbody').append('<td>'+item.goCitizenName+'</td>');
							$('.tbody').append('<td>'+item.goSurgeryResultCode+'</td>');
							$('.tbody').append('<td>'+item.goSurgeryName+'</td>');
							$('.tbody').append('<td>'+item.goSurgeryResultGoRegistrationDate+'</td>');
							$('.tbody').append('</tr>');
							
						})
						
					}
				});
			});
			
	</script> 
</body>
</html>