<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
</head>
<body>
	<h1>환자 등록</h1>
	<h3>환자 등록시 자동으로 차트가 생성됩니다</h3>
	<form action="<c:url value='/hospital/addPatient'/>" method="post">
		<table>
			<tr>
				<td>환자명 : </td>
				<td>
					<input type="text" name="hoPatientName" >
				</td>
			</tr>
			<tr>
				<td>주민번호 : </td>
				<td>
					<input type="text" name="hoCitizenId" placeholder="ex)910101-1234567" id="hoCitizenId">
					<button type="button" id="checkBtn">중복확인</button>
				</td>
			</tr>
			<tr>
				<td>연락처 : </td>
				<td>
					<input type="text" name="hoPatientPhone" placeholder="ex)010-2345-6789">
				</td>
			</tr>
			<tr>
				<td>우편번호 : </td>
				<td>
					<input id="hoZipCode" type="text" name="hoZipCode" placeholder="우편번호">
					<input type="button" onClick="sample6_execDaumPostcode()" value="우편번호 찾기">
				</td>
			</tr>
			<tr>
				<td>주소 : </td>
				<td>
					<input id="hoPatientAddress" type="text" name="hoPatientAddress" placeholder="주소">
				</td>
			</tr>
			<tr>
				<td>상세주소 : </td>
				<td>
					<input id="hoPatientDetailAddress" type="text" name="hoPatientDetailAddress" placeholder="상세주소">
				</td>
			</tr>
		</table>
		<input type="submit" value="등록하기">
	</form>
	
	<script>
		function sample6_execDaumPostcode() {
		    new daum.Postcode({
		        oncomplete: function(data) {
		            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
		
		            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
		            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
		            var fullAddr = ''; // 최종 주소 변수
		            var extraAddr = ''; // 조합형 주소 변수
		
		            // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
		            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
		                fullAddr = data.roadAddress;
		
		            } else { // 사용자가 지번 주소를 선택했을 경우(J)
		                fullAddr = data.jibunAddress;
		            }
		
		            // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
		            if(data.userSelectedType === 'R'){
		                //법정동명이 있을 경우 추가한다.
		                if(data.bname !== ''){
		                    extraAddr += data.bname;
		                }
		                // 건물명이 있을 경우 추가한다.
		                if(data.buildingName !== ''){
		                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
		                }
		                // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
		                fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
		            }
		
		            // 우편번호와 주소 정보를 해당 필드에 넣는다.
		            document.getElementById('hoZipCode').value = data.zonecode; //5자리 새우편번호 사용
		            document.getElementById('hoPatientAddress').value = fullAddr;
		
		            // 커서를 상세주소 필드로 이동한다.
		            document.getElementById('hoPatientDetailAddress').focus();
		        }
		    }).open();
		}
		
		$( document ).ready(function() {
	    	function getContextPath() {
	    		var hostIndex = location.href.indexOf( location.host ) + location.host.length;
	    		return location.href.substring( hostIndex, location.href.indexOf('/', hostIndex + 1) );
	    	};

		    //ajax실행
	    	$("#checkBtn").bind("click",function(){
	    		if($('#hoCitizenId').val()==""){
	    			alert('주민등록번호를 입력하세요');
	    		}
	    		console.log('getContextPath:'+getContextPath());
	    		console.log('location.host:'+location.host);
	    		console.log('location.href:'+location.href);
	    		console.log('파라미터의 값 : '+$('#hoCitizenId').val());
	    	    $.ajax({
	    	        url : getContextPath()+"/government/checkCitizenId",
	    	        type: "post",
	    	        data : { "citizenId" : $("#hoCitizenId").val() },
	    	        success : function(data){
	    	            var checkResult = data;
	    	            console.log('checkResult : '+checkResult);
	    	        	if(checkResult === 'true'){
	    	                alert("사용 가능한 주민번호입니다.");	    	                
	    	            } else {
	    	            	alert("등록되지 않은 주민번호입니다.");
	    	            	 $("#hoCitizenId").val('');
	    	            	return false;
	    	            }
	    	        }
	    	    });
	    	});
	    });
	</script>
</body>
</html>