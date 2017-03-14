<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
	
	<div align="center" class="container">
		 <div class="widget">
              <div class="widget-header">
                  <i class="icon-pencil"></i>
                  <h3>수술일지 등록</h3>
              </div>
              <!-- /widget-header -->
              <div class="widget-content">
                 <form action="<c:url value='/hospital/operationView'/>" method="post" >		
					<input type="hidden" value="${hoOperation.hoOperationCode}" name="hoOperationCode">
					<table class="table table-hover">
						<tr>
							<th>환자명 :</th>
							<td>
								<input type="text" class="form-control" value="${hoOperation.hoPatientName}" readonly="readonly">
							</td>
						</tr>
						<tr>
							<th>수술명 : </th>
							<td>
								<input type="text" class="form-control" value="${hoOperation.hoOperationTypeName}" readonly="readonly">	
							</td>
						</tr>
						<tr>
							<th>수술시작일 : </th>
							<td>
								<input type="text" class="form-control" value="${hoOperation.hoOperationStartDate}" name="hoOperationStartDate" id="hoOperationStartDate" readonly="readonly">	
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
								<textarea class="form-control" cols="100" rows="10" name="hoOperationDiary" >${hoOperation.hoOperationDiary}</textarea>		
							</td>
						</tr>
					</table>
					<input type="submit" value="작성 완료">	
				</form>	
              </div>
              <!-- /widget-content -->
          </div>
          	<!-- /widget -->
	</div>
	<!-- /container  -->
	
	<!-- <script>
		var Today = new Date();
		document.getElementById('hoOperationStartDate').valueAsDate = ${hoOperation.hoOperationStartDate};
	</script> -->
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>