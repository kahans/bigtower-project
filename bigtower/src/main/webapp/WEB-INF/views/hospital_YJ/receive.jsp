<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>병원_환자접수</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>


<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
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
    	$("#btn").bind("click",function(){
    		if($('#goCitizenIdSearch').val()==""){
    			alert('값입력하세요');
    		}
    		console.log('getContextPath:'+getContextPath());
    		console.log('location.host:'+location.host);
    		console.log('location.href:'+location.href);
    	    $.ajax({
    	        url : getContextPath()+"/hospital/searchPatient",
    	        type: "post",
    	        data : { "goCitizenId" : $("#goCitizenIdSearch").val() },
    	        success : function(data){
    				//@ResponseBody 를 이용해서 이미 json객체로 넘어오기때문에 parse를 할필요가 없다.
    	            //var data = JSON.parse(responseData); $("#goCitizenId").val(data.goCitizenId);
    	             $("#goCitizenId").val("900101-100000");
    	            $("#hoHospitalCode").val("hospital_");
    	            $("#hoPatientName").val("");
    	            $("#hoPatientPhone").val("010-1234-1234");
    	            $("#hoZipCode").val("");
    	            $("#hoPatientAddress").val("");
    	            $("#hoPatientDetailAddress").val("");
    	            if(!data){
    	                alert("접수기록이 없는 회원입니다.");
    	                return false;
    	            }
    	            $("#goCitizenId").val(data.goCitizenId);
    	            $("#hoHospitalCode").val(data.hoHospitalCode);
    	            $("#hoPatientName").val(data.hoPatientName);
    	            $("#hoPatientPhone").val(data.hoPatientPhone);
    	            $("#hoZipCode").val(data.hoZipCode);
    	            $("#hoPatientAddress").val(data.hoPatientAddress);
    	            $("#hoPatientDetailAddress").val(data.hoPatientDetailAddress);
    	        }
    	    });
    	});
    });
</script>
</head>
<body>

	<h1>receive.jsp</h1>
	<h2>환자접수</h2>
	<input id="goCitizenIdSearch" type="text" value="900101-100000" placeholder="주민번호">
			<button id="btn">조회</button>
	<form action="<c:url value="/hospital/receive"/>" method="post">
		<div>
			<input id="hoCitizenId" type="text" name="hoCitizenId" value="900101-100000" placeholder="주민번호">
			ex)900101-1000001 / 900101-1000002 ... 900101-1000005 / 900101-2000001 ... 900101-2000005
			
		</div>
		<div>
			<input id="hoHospitalCode" type="text" name="hoHospitalCode" value="hospital_" placeholder="병원코드">ex)hospital_1 / hospital_2 ~ hospital_5
		</div>

		<div>
			<input id="hoPatientName" type="text" name="hoPatientName" placeholder="이름">
		</div>
		<div>
			<input id="hoPatientPhone" type="text" name="hoPatientPhone" value="010-1234-1234" placeholder="전화번호">ex)010-1234-1234
		</div>
		<div>
			<input id="hoZipCode" type="text" name="hoZipCode" placeholder="우편번호">
			<input type="button" onClick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
			<input id="hoPatientAddress" type="text" name="hoPatientAddress" placeholder="주소">
			<input id="hoPatientDetailAddress" type="text" name="hoPatientDetailAddress" placeholder="상세주소">
		</div>
		<div>
			<input type="submit" value="접수">
		</div>
	</form>
</body>
</html>