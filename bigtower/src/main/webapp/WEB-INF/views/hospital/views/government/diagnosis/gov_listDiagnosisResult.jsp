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
					<th>진료과목명</th>
					<th>환자명</th>
					<th>질병명</th>
					<th>진단등록일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="listDiagnosis" items="${diagnosisList}">
					<tr>
						<td>${listDiagnosis.goHospitalName}</td>
						<td>${listDiagnosis.goDoctorName}</td>
						<td>${listDiagnosis.goTreatSubjectName}</td>
						<td>${listDiagnosis.goCitizenName}</td>
						<td>${listDiagnosis.goDiseaseKor}</td>
						<td>${listDiagnosis.goDiagnosisWriteDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div><!-- /widget-content -->
</div><!-- /widget widget-table action-table -->
