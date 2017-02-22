<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="bloodTestResultForm.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">

			<table>
					<tr>
						<th>
							진료코드
						</th>
						<th>
							혈당수치
						</th>
						<th>
							혈소판
						</th>
						<th>
							혈액검사결과Img
						</th>
						
					</tr>
			
				<c:forEach var="bloodTest" items="${goTestBlood.goBloodTest}">
				<tr>
					<td>
						<input type="text" name="TreatCode" value="${bloodTest.goTreatCode}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="bloodSugar" value="${bloodTest.goBloodTestBloodSugar}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="Platelet" value="${bloodTest.goBloodTestPlatelet}" readonly="readonly"/>
					</td>
					<td>
						<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">혈액검사결과</button>
						  <!-- Modal -->
						  <div class="modal fade" id="myModal" role="dialog">
						    <div class="modal-dialog modal-lg">
						      <div class="modal-content">
						        <div class="modal-header">
						          <button type="button" class="close" data-dismiss="modal">&times;</button>
						          <h4 class="modal-title">혈액검사 결과파일</h4>
						        </div>
						        <div class="modal-body">
						         	<img alt="혈액검사결과파일" src="<c:url 
						         	value="${bloodTest.goBloodTestFilePath}${bloodTest.goBloodTestFileName}">혈액검사결과</c:url>">
						        </div>
						        <div class="modal-footer">
						          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						        </div>
						      </div>
						    </div>
						  </div>
					</td>
				</tr>
				</c:forEach>
			</table>
	</div>	
			
</body>
</html>