<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TREAT SUBJECT</title>
</head>
<body>
	TREAT SUBJECT
	<div>
	<table>
		<c:forEach items="${list}" var="ts">
			<div>
				${ts.goTreatSubjectCode}/
				${ts.goTreatSubjectName}
			</div>
			
		</c:forEach>
		</table>
	</div>
</body>
</html>