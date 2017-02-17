<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>
$(document).ready(function(){
	
	function getContextPath() {
		var hostIndex = location.href.indexOf( location.host ) + location.host.length;
		return location.href.substring( hostIndex, location.href.indexOf('/', hostIndex + 1) );
	};
		
	$("#btn").bind("click",function(){
		if($('#hoPatientCode').val()==""){
			alert('환자이름을 입력하세요');
			return;
		}
		console.log('getContextPath:'+getContextPath());
		$.ajax({
			url : getContextPath()+"/getpatient",
			type : "POST",
			data : {"hoPatientCode" : $("#hoPatientCode").val()},
			success : function(data){
				if(!data){
					$("#hoPatientName").val("");
					$("#hoPatientGender").val("");
					$("#hoPatientPhone").val("");
					$("#goCitizenId").val("");
					$("#hoHospitalCode").val("");
					$("#hoZipCode").val("");
					$("#hoPatientAddress").val("");
					$("#hoPatientDetailAddress").val("");
					return false;
				}
				$("#hoPatientName").val(data.hoPatientName);
				$("#hoPatientGender").val(data.hoPatientGender);
				$("#hoPatientPhone").val(data.hoPatientPhone);
				$("#goCitizenId").val(data.goCitizenId);
				$("#hoHospitalCode").val(data.hoHospitalCode);
				$("#hoZipCode").val(data.hoZipCode);
				$("#hoPatientName").val(data.hoPatientName);
				$("#hoPatientDetailAddress").val(data.hoPatientDetailAddress);
			
			}
		});
	});
});

</script>

</head>
<body>

<form action="<c:url value='/hospital_YJ/tempSearchPatient'/>" method="post">
		<div>
			환자ID : <input id="hoPatientCode"type="text" name="hoPatientCode"/>
			<button id="btn" type="button" class="btn btn-info">조회</button>
		</div>
		<div>
				이 름 : <input id="hoPatientName" type="text" name="hoPatientName" readonly="readonly"/>
		</div>			
		<div>
				성 별 : <input id="hoPatientGender" type="text" name="hoPatientGender" readonly="readonly"/>
		</div>	
		<div>
				연락처 : <input id="hoPatientPhone" type="text" name="hoPatientPhone" readonly="readonly"/>
		</div>	
		<div>
				국민ID : <input id="goCitizenId" type="text" name="goCitizenId" readonly="readonly"/>
		</div>
		<div>
				병원코드 : <input id="hoHospitalCode" type="text" name="hoHospitalCode" readonly="readonly"/>
		</div>
		<div>
				우편번호 : <input id="hoZipCode" type="text" name="hoZipCode" readonly="readonly"/>
		</div>	
		<div>
				주소 : <input id="hoPatientAddress" type="text" name="hoPatientAddress" readonly="readonly"/>
		</div>
		<div>
				상세주소 : <input id="hoPatientDetailAddress" type="text" name="hoPatientDetailAddress" readonly="readonly"/>
		</div>
				
				
			
</form>	

	
</body>
</html>