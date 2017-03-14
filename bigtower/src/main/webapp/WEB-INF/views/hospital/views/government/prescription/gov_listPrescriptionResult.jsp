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
					<th>환자이름</th>
					<th>1일투약횟수</th>
					<th>1회투여량</th>
					<th>총투약일수</th>
					<th>용법</th>
					<th>처방작성일자</th>			
				</tr>
			</thead>
			<tbody>
				<c:forEach var="listPrescription" items="${prescriptionList}">
					<tr>
						<td>${listPrescription.goHospitalName}</td>
						<td>${listPrescription.goDoctorName}</td>
						<td>${listPrescription.goTreatSubjectName}</td>
						<td>${listPrescription.goCitizenName}</td>
						<td>${listPrescription.goPrescriptionResultInjectionNumber}</td>
						<td>${listPrescription.goPrescriptionResultDosage}</td>
						<td>${listPrescription.goPrescriptionResultTotalDate}</td>
						<td>${listPrescription.goPrescriptionResultUsage}</td>
						<td>${listPrescription.goPrescriptionResultWriteDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div><!-- /widget-content -->
</div><!-- /widget widget-table action-table -->