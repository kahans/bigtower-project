<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
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
							건강검진코드
						</th>
						<th>
							진료코드
						</th>
						<th>
							파일경로
						</th>
						<th>
							파일명
						</th>
						<th>
							결과등록일자
						</th>
						<th>
							정부DB등록일자
						</th>
					</tr>
			<c:forEach var="c" items="${checkUp}">
				<tr>
					<td>
						<input type="text" name="c.goCheckUpResultCode" value="${c.goCheckUpResultCode}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="c.goTreatCode" value="${c.goTreatCode}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="c.goCheckUpResultFilePath" value="${c.goCheckUpResultFilePath}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="c.goCheckUpResultFileName" value="${c.goCheckUpResultFileName}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="c.goCheckUpResultRegistrationDate" value="${c.goCheckUpResultRegistrationDate}" readonly="readonly"/>
					</td>
					<td>
						<input type="text" name="c.goCheckUpResultGoRegistrationDate" value="${c.goCheckUpResultGoRegistrationDate}" readonly="readonly"/>
					</td>
				</tr>
			</c:forEach>
			</table>
</body>
</html>