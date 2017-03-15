<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
<!--
.mainSub {
    border-bottom: 1px solid #000;
}

@media (max-width: 1000px) {
	.main {
	    border-bottom: 1px solid #000;
	}
	img {
		width: auto;
	}
}
-->
</style>

<div class="mainSub">
	<div class="main-inner">
		<div class="container">
			<div class="row">
				<div class="span6">
					<h3>팀 프로젝트</h3>
					여긴 어디오
					일일 방문자 수 : ${resultMap.dayVisitPeople}
					한달 방문자 수 : ${resultMap.monthVisitPeople}
					일년 방문자 수 : ${resultMap.yearVisitPeople}
					일일 진료정보 :
					<c:forEach var="dayTreatVisit" items="${resultMap.dayTreatVisit}" >
						진료과목 : ${dayTreatVisit.hoTreatSubjectName}
						진료과목 방문 수 : ${dayTreatVisit.hoTreatsubjectCount}
					</c:forEach>
					한달간 진료정보 :
					<c:forEach var="dayTreatVisit" items="${resultMap.monthTreatVisit}" >
						진료과목 : ${dayTreatVisit.hoTreatSubjectName}
						진료과목 방문 수 : ${dayTreatVisit.hoTreatsubjectCount}
					</c:forEach>
					일년간 진료정보 :
					<c:forEach var="dayTreatVisit" items="${resultMap.yearTreatVisit}" >
						진료과목 : ${dayTreatVisit.hoTreatSubjectName}
						진료과목 방문 수 : ${dayTreatVisit.hoTreatsubjectCount}
					</c:forEach>
					주간 질병정보 :
					<c:forEach var="weekDisease" items="${resultMap.weekDisease}">
						질병이름  : ${weekDisease.hoDiseaseName}
						질병 처방수 : ${weekDisease.hoDiseaseCount}
					</c:forEach>
					월간 질병정보 : 
					<c:forEach var="monthDisease" items="${resultMap.monthDisease}">
						질병이름  : ${weekDisease.hoDiseaseName}
						질병 처방수 : ${weekDisease.hoDiseaseCount}
					</c:forEach>
					연간 질병정보 : 
					<c:forEach var="yearDisease" items="${resultMap.yearDisease}">
						질병이름  : ${yearDisease.hoDiseaseName}
						질병 처방수 : ${yearDisease.hoDiseaseCount}
					</c:forEach>
					
					
				</div><!-- /span6 -->
				<div class="span6">
					<img src="<c:url value='/resources/bootstrap/img/img-1.png'/>" class="img"/>
					1번영역확인
				</div><!-- /span6 -->
				2번영역확인
			</div><!-- /row -->
			3번영역확인
		</div><!-- /container -->
		4번영역확인
	</div><!-- /main-inner -->
</div><!-- /mainSub -->

<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>

