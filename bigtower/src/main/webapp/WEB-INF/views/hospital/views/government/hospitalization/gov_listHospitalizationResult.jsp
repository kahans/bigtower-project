<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="widget widget-table action-table">
	<div class="widget-header">
		<i class="icon-list-alt"></i>
	</div>
	<div class="widget-content">
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>병원명</th>
					<th>의사명</th>
					<th>진료과목</th>
					<th>환자명</th>
					<th>입원일자</th>
					<th>퇴원일자</th>
				</tr>
				</thead>
					<tbody>	
				<c:forEach var="hospitalizationList" items="${hospitalizationList}">
					<tr>
						<td>${hospitalizationList.goHospitalName}</td>
						<td>${hospitalizationList.goDoctorName}</td>
						<td>${hospitalizationList.goTreatSubjectName}</td>
						<td>${hospitalizationList.goCitizenName}</td>
						<td>${hospitalizationList.goHospitalizationEnterDate}</td>
						<td>${hospitalizationList.goHospitalizationExitDate}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div><!-- /widget-content -->
</div><!-- /widget widget-table action-table -->
