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
				</div><!-- /span6 -->
				<div class="span6">
					<img src="<c:url value='/resources/bootstrap/img/img-1.png'/>" class="img"/>
				</div><!-- /span6 -->
			</div><!-- /row -->
		</div><!-- /container -->
	</div><!-- /main-inner -->
</div><!-- /mainSub -->

<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>

