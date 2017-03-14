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
					<th>진료내용</th>
					<th>진료등록일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="list" items="${treatList}">
					<tr>
						<td>${list.goHospitalName}</td>
						<td>${list.goDoctorName}</td>
						<td>${list.goTreatSubjectName}</td>
						<td>${list.goCitizenName}</td>
						<td>${list.goTreatContents}</td>
						<td>${list.goTreatRegistrationDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div><!-- /widget-content -->
</div><!-- /widget widget-table action-table -->
