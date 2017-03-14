<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<style>

.widget {
	
	position: relative;
		
	clear: both;
		
	width: auto;
		
	margin-bottom: 2em;
		
	overflow: auto;
		
	margin: 100px 450px 200px 450px;
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

</style>
	<div class="widget widget-table action-table">
		 
              <div class="widget-header">
                  <i class="icon-pencil"></i>
                  <h3>수술일지 등록</h3>
              </div>
              <!-- /widget-header -->
              <div class="widget-content">
                 <form action="<c:url value='/hospital/operationView'/>" method="post" >		
					<input type="hidden" value="${hoOperation.hoOperationCode}" name="hoOperationCode">
					<table class="table table-striped table-bordered">
						<tr>
							<th><span>환자명 :</span></th>
							<td>
								<input type="text" class="span6 disabled" value="${hoOperation.hoPatientName}" readonly="readonly">
							</td>
						</tr>
						<tr>
							<th>수술명 : </th>
							<td>
								<input type="text" class="span6 disabled" value="${hoOperation.hoOperationTypeName}" readonly="readonly">	
							</td>
						</tr>
						<tr>
							<th>수술시작일 : </th>
							<td>
								<input type="text" class="span6 disabled" value="${hoOperation.hoOperationStartDate}" name="hoOperationStartDate" id="hoOperationStartDate" readonly="readonly">	
							</td>
						</tr>
						<tr>
							<th>수술종료일 :</th>
							<td>
								<input type="date" value="${hoOperation.hoOperationEndDate}" name="hoOperationEndDate">		
							</td>
						</tr>
						<tr>
							<th>수술일지 : </th>
							<td>
								<textarea class="form-control" cols="100" rows="10" name="hoOperationDiary" 
								style="max-width: 57%; width:57%;"
								>${hoOperation.hoOperationDiary}</textarea>		
							</td>
						</tr>
					</table>
					
				</form>
					<div style="text-align: center">
						<input type="submit" value="작성 완료">
					</div>
              </div>
              <!-- /widget-content -->
          </div>
          <!-- widget widget-table action-table -->
	
	
	<!-- <script>
		var Today = new Date();
		document.getElementById('hoOperationStartDate').valueAsDate = ${hoOperation.hoOperationStartDate};
	</script> -->
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>