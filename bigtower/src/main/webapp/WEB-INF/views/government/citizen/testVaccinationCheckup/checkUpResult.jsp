<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    <%@include file="checkUp.jsp" %>
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
		<table border="1">
					<tr>
						<th>
							건강검진코드
						</th>
						<th>
							진료코드
						</th>
						<th>
							파일경로
						</th>
						<th>
							파일이미지
						</th>
						<th>
							결과등록일자
						</th>
						<th>
							정부DB등록일자
						</th>
					</tr>
					
					
			<c:forEach var="checkUp" items="${checkUp.goCheckupTreatSub}">
				<tr>
					<td>
						<input type="text" name="c.goCheckUpResultCode" value="${checkUp.goCheckUpResultCode}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="c.goTreatCode" value="${checkUp.goTreatCode}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" value="${checkUp.goCheckUpResultFilePath}${checkUp.goCheckUpResultFileName}" readonly="readonly"/>
					</td>
					<td>
						<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#${checkUp.goCheckUpResultCode}">혈액검사결과</button>
						  <!-- Modal -->
						  <div class="modal fade" id="${checkUp.goCheckUpResultCode}" role="dialog">
						    <div class="modal-dialog modal-lg">
						      <div class="modal-content">
						        <div class="modal-header">
						          <button type="button" class="close" data-dismiss="modal">&times;</button>
						          <h4 class="modal-title">혈액검사 결과파일</h4>
						        </div>
						        <div class="modal-body">
						         	<img alt="혈액검사결과파일" src="<c:url 
						         	value="${checkUp.goCheckUpResultFilePath}${checkUp.goCheckUpResultFileName}">혈액검사결과</c:url>">
						        </div>
						        <div class="modal-footer">
						          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						        </div>
						      </div>
						    </div>
						  </div>
					</td>
					<td>
						<input type="text" name="c.goCheckUpResultRegistrationDate" value="${checkUp.goCheckUpResultRegistrationDate}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="c.goCheckUpResultGoRegistrationDate" value="${checkUp.goCheckUpResultGoRegistrationDate}" readonly="readonly"/>
					</td>
				</tr>
			</c:forEach>
			</table>
</body>
</html>