<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<div class="widget widget-table action-table">
        <div class="widget-header"> <i class="icon-th-list"></i>
          <!-- <h3>접수 대기자 목록</h3> -->
        </div>
        <!-- /widget-header -->
        <div class="widget-content">
          <table class="table table-striped table-bordered">
            <thead>
              <tr>
              	<th>환자명</th>
				<th>의사명</th>
				<th>진료과목</th>
				<th>병원명</th>
				<th>접종명</th>
				<th>접종차수</th>
				<th>접종일</th>
              </tr>
            </thead>
            <tbody>
            	<c:forEach var="vaccinList" items="${vaccinationList}">
					<tr>
						<td>${vaccinList.goCitizenName}</td>
						<td>${vaccinList.goDoctorName}</td>
						<td>${vaccinList.goTreatSubjectName}</td>
						<td>${vaccinList.goHospitalName}</td>
						<td>${vaccinList.goVaccinationName}</td>
						<td>${vaccinList.goVaccinationResultDegree}</td>
						<td>${vaccinList.goCheckupResultRegistrationDate}</td>
					</tr>
				</c:forEach>
            
            </tbody>
          </table>
        </div>
        <!-- /widget-content --> 
      </div>
      <!-- /widget --> 
      
<script>
	$(document).ready(function(){
	    $('[data-toggle="tooltip"]').tooltip();   
	});
</script>

<%-- <h4>예방접종 리스트</h4>
	<table border="1">
		<tr>
			<td>접종명</td>
			<td>접종 차수</td>
			<td>접종일</td>
			<td>정부등록일</td>
		</tr>
	
		<c:forEach var="vaccinList" items="${vaccinationList}">
			<tr>
				<td>${vaccinList.goVaccinationName}</td>
				<td>${vaccinList.goVaccinationResultDegree}</td>
				<td>${vaccinList.goVaccinationResultRegistrationDate}</td>
				<td>${vaccinList.goVaccinationResultGoRegistrationDate}</td>
			</tr>
		</c:forEach>
	</table> --%>
	