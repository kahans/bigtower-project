<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ include file="./hospital/views/index.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>병원_환자접수</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>  
    $( document ).ready(function() {
    	function getContextPath() {
    		var hostIndex = location.href.indexOf( location.host ) + location.host.length;
    		return location.href.substring( hostIndex, location.href.indexOf('/', hostIndex + 1) );
    	};

	    //ajax실행
    	$("#btn").bind("click",function(){
    		if($('#hoCitizenIdSearch').val()==""){
    			alert('값입력하세요');
    			
    		}
    		console.log('getContextPath:'+getContextPath());
    		console.log('location.host:'+location.host);
    		console.log('location.href:'+location.href);
    		console.log('파라미터의 값 : '+$('#hoCitizenIdSearch').val());
    	    $.ajax({
    	        url : getContextPath()+"/hospital/searchReceive",
    	        type: "post",
    	        data : { "hoCitizenId" : $("#hoCitizenIdSearch").val() },
    	        success : function(data){
    				//@ResponseBody 를 이용해서 이미 json객체로 넘어오기때문에 parse를 할필요가 없다.
    	            //var data = JSON.parse(responseData); $("#goCitizenId").val(data.goCitizenId);
    	            $("#hoCitizenId").val();
    	            $("#hoHospitalCode").val();
    	            $("#hoPatientName").val();
    	            $("#hoPatientPhone").val();
    	            $("#hoZipCode").val();
    	            $("#hoPatientAddress").val();
    	            $("#hoPatientDetailAddress").val();
    	            if(!data){
    	                alert("접수기록이 없는 회원입니다.");
    	                return false;
    	            }
    	            $("#hoCitizenId").val(data.hoCitizenId);
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
	<input id="hoCitizenIdSearch" type="text" value="${hoCitizenId}" placeholder="주민번호">
			<button id="btn">조회</button>
	<form action="<c:url value="/hospital/receive"/>" method="post">	
		<input id="hoCitizenId" type="hidden" name="hoCitizenId" placeholder="주민번호">	
		<div>
			병원코드 : 
			<input id="hoHospitalCode" type="text" name="hoHospitalCode" placeholder="병원코드">ex)hospital_1 / hospital_2 ~ hospital_5
		</div>
		<div>
			접수목적 :
			<input type="text" name="hoReceivePurpose" placeholder="ex)골절상">
		</div>
		<div>
			진료과목 :
			<select name="hoTreatSubjectCode">
				<option>:::선택하세요:::</option>
				<c:forEach items="${treatSubjectList}" var="treatSubjectList">
					<option value="${treatSubjectList.hoTreatSubjectCode}">${treatSubjectList.hoTreatSubjectName}</option>
				</c:forEach>
			</select>
		</div>
		
		
		<div>
			환자명 : 
			<input id="hoPatientName" type="text" name="hoPatientName" placeholder="이름">
		</div>
		<div>
			연락처 : 
			<input id="hoPatientPhone" type="text" name="hoPatientPhone" placeholder="전화번호">ex)010-1234-1234
		</div>
		<div>
			<input type="submit" value="접수">
		</div>
	</form>
</body>
</html>