<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="bloodTestResultForm.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

			<table border="1">
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
							파일경로
						</th>
						<th>
							파일명
						</th>
						<th>
							검사일
						</th>
					</tr>
			<c:forEach var="b" items="${goTest}">
				<tr>
					<td>
						<input type="text" name="b.goTreatCode" value="${b.goTreatCode}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="b.goBloodTestBloodSugar" value="${b.goBloodTestBloodSugar}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="b.goBloodTestPlatelet" value="${b.goBloodTestPlatelet}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="b.goBloodTestFilePath" value="${b.goBloodTestFilePath}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="b.goBloodTestFileName" value="${b.goBloodTestFileName}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="b.goBloodTestDate" value="${b.goBloodTestDate}" readonly="readonly"/>
					</td>
				</tr>
			</c:forEach>
			</table>
</body>
</html>