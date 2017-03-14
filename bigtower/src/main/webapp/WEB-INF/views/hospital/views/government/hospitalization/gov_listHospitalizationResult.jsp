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
					<td>입퇴원코드</td>
					<td>진료코드</td>
					<td>입원일자</td>
					<td>퇴원일자</td>
					<td>병원명</td>
					<td>병원주소</td>
					<td>의사명</td>
					<td>환자명</td>
					<td>진료과목</td>
				</tr>
				</thead>
					<tbody>	
				<c:forEach var="hospitalizationList" items="${hospitalizationList}">
					<tr>
						<td>${hospitalizationList.goHospitalizationCode}</td>
						<td>${hospitalizationList.goTreatCode}</td>
						<td>${hospitalizationList.goHospitalizationEnterDate}</td>
						<td>${hospitalizationList.goHospitalizationExitDate}</td>
						<td>${hospitalizationList.goHospitalName}</td>
						<td>${hospitalizationList.goHospitalAddress}</td>
						<td>${hospitalizationList.goDoctorName}</td>
						<td>${hospitalizationList.goCitizenName}</td>
						<td>${hospitalizationList.goTreatSubjectName}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div><!-- /widget-content -->
</div><!-- /widget widget-table action-table -->
