<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<style>
<!--
.widget {
	
	position: relative;
		
	clear: both;
		
	width: auto;
		
	margin-bottom: 2em;
		
	overflow: hidden;
		
	margin: 100px 200px 200px 200px;
}

@media (max-width: 1000px) {
.widget {
	
	position: relative;		
	clear: both;		
	width: auto;		
	margin-bottom: 2em;		
	overflow: auto;		
	margin: auto auto 100px auto;

}
-->
</style>
	<div class="widget widget-table action-table">
        <div class="widget-header"> <i class="icon-th-list"></i>
          <h3>접수 목록</h3>
        </div>
        <!-- /widget-header -->
        <div class="widget-content">
          <table class="table table-striped table-bordered">
            <thead>
              <tr>
                <th> 환자명 </th>
                <th> 진료과</th>
                <th> 방문목적</th>
                <th> 접수일</th>
                <th class="td-actions"> </th>
              </tr>
            </thead>
            <tbody>
              <c:forEach var="ReceiveList" items="${receiveList}">
				<tr>				
					<td>${ReceiveList.hoPatientName }</td>
					<td>${ReceiveList.hoTreatSubjectName }</td>
					<td>${ReceiveList.hoReceivePurpose }</td>
					<td>${ReceiveList.hoReceiveRegistrationDate }</td>
					<td><a href="<c:url value='/hospital/addTreat?
												hoPatientCode=${ReceiveList.hoPatientCode}&
												hoReceiveCode=${ReceiveList.hoReceiveCode}&
												hoTreatSubjectCode=${ReceiveList.hoTreatSubjectCode}'/>">
						<button>${ReceiveList.hoReceiveStateName }</button></a>
					</td>
				</tr>
			  </c:forEach>
            
            </tbody>
          </table>
        </div>
        <!-- /widget-content --> 
      </div>
      <!-- /widget --> 

	
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
