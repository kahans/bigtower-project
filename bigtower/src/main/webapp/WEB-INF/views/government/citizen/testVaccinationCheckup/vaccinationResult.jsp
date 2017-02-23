<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="vaccination.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>예방접종 결과목록</title>
</head>
<body>
	<div class="container">

			<table>
					<tr>
						<th>
							예방접종 결과 코드
						</th>
						<th>
							진료코드
						</th>
						<th>
							예방접종 코드
						</th>
						<th>
							예방접종 차수
						</th>
						<th>
							예방접종등록일
						</th>
						
						
					</tr>
			
				<c:forEach var="vaccination" items="${vaccination.goVaccinationResultTreatSub}">
				<tr>
					<td>
						<input type="text" name="goVaccinationResultCode" value="${vaccination.goVaccinationResultCode}"  readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="goTreatCode" value="${vaccination.goTreatCode}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="goVaccinationCode" value="${vaccination.goVaccinationCode}" readonly="readonly"/>
					</td>
					
					<td>
						<input type="text" name="goVaccinationResultDegree" value="${vaccination.goVaccinationResultDegree}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="goVaccinationResultRegistrationDate" value="${vaccination.goVaccinationResultRegistrationDate}" readonly="readonly"/>
					</td>
					
				</tr>
				</c:forEach>
			</table>
	</div>	
			 
</body>
</html>