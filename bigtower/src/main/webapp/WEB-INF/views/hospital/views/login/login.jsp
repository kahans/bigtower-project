<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
 
<head>
    <meta charset="utf-8">
    <title>Medical Information Cloud System</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes"> 
    
<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.min.css"/>" rel="stylesheet" type="text/css" />

<link href="<c:url value="/resources/bootstrap/css/font-awesome.css"/>" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
    
<link href="<c:url value="/resources/bootstrap/css/style.css"/>" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap/css/pages/signin.css"/>" rel="stylesheet" type="text/css">

</head>

<body>
	
	<div class="navbar navbar-fixed-top">
	
	<div class="navbar-inner">
		
		<div class="container">
			
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</a>
			
			<a class="brand" href="<c:url value="/hospital/"/>">
				Medical Information Cloud System				
			</a>		
			
		</div> <!-- /container -->
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->



<div class="account-container">
	
	<div class="content clearfix">
		
		<form action="<c:url value="/hospital/login"/>" method="post">
		
			<h1>Login</h1>		
			
			<div class="login-fields">
				
				<p>Please provide your details</p>
				

				<div class="field">
					<label for="hoStaffId">YourID</label>
					<input type="text" id="hoStaffId" name="hoStaffId" value="id001" placeholder="YourID" class="login username-field" />
				</div> <!-- /field -->
				
				<div class="field">
					<label for="hoStaffPw">Password:</label>
					<input type="password" id="hoStaffPw" name="hoStaffPw" value="pw001" placeholder="Password" class="login password-field"/>
				</div> <!-- /password -->
				
			</div> <!-- /login-fields -->
			
			<div class="login-actions">
				
				<button class="button btn btn-success btn-large">Sign In</button>
				
			</div> <!-- .actions -->
			
		</form>
		
	</div> <!-- /content -->
	
</div> <!-- /account-container -->


<script src="<c:url value="/resources/bootstrap/js/jquery-1.7.2.min.js"/>"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.js"/>"></script>

<script src="<c:url value="/resources/bootstrap/js/signin.js"/>"></script>

</body>

</html>
