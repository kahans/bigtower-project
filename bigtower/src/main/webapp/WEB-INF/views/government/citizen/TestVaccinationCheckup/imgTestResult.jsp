<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="imgTest.jsp" %>
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
							영상코드
						</th>
						<th>
							진료코드
						</th>
						<th>
							파일이름
						</th>
						<th>
							영상검사날짜
						</th>
						<th>
							영상검사정부전송일
						</th>
						
						
					</tr>
			
				<c:forEach var="imageTest" items="${goImageTest.goImageTestTreatSub}" >
				<tr>
					<td>
						<input type="text" name="imageCode" value="${imageTest.goImageTestCode}"  readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="TreatCode" value="${imageTest.goTreatCode}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="fileName" value="${imageTest.goImageTestFileName}"  readonly="readonly"/>
					</td>
					
					<td>
						<input type="text" name="imageTestDate" value="${imageTest.goImageTestDate}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="goImageTestGoRegistrationDate" value="${imageTest.goImageTestGoRegistrationDate}" readonly="readonly"/>
					</td>
					<td>
						<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#${imageTest.goImageTestCode}">영상검사결과</button>
						  <!-- Modal -->
						  <div class="modal fade" id="${imageTest.goImageTestCode}" role="dialog">
						    <div class="modal-dialog modal-lg">
						      <div class="modal-content">
						        <div class="modal-header">
						          <button type="button" class="close" data-dismiss="modal">&times;</button>
						          <h4 class="modal-title">혈액검사 결과파일</h4>
						        </div>
						        <div class="modal-body">
						         	<img alt="혈액검사결과파일" src="<c:url 
						         	value="${imageTest.goImageTestFilePath}${imageTest.goImageTestFileName}">영상검사결과</c:url>">
						         	
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