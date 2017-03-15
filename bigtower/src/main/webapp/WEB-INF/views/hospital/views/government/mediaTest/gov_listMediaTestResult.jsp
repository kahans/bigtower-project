<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	
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
				<th>파일경로</th>
				<th>검사일</th>
              </tr>
            </thead>
            <tbody>
            	<c:forEach var="getMediaTest" items="${imageTestList}">
					<tr>
						<td>${getMediaTest.goCitizenName}</td>
						<td>${getMediaTest.goDoctorName}</td>
						<td>${getMediaTest.goTreatSubjectName}</td>
						<td>${getMediaTest.goHospitalName}</td>
						<td><a href="#" data-toggle="tooltip" title="${getMediaTest.goImageTestFilePath} ${getMediaTest.goImageTestFileName}"><button><i class="icon-folder-open"></i></button></a></td>
						<td>${getMediaTest.goImageTestDate}</td>
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



