<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Medicio landing page template for Health niche</title>

<!-- css -->
<link href="/templates/government/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="/templates/government/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="/templates/government/plugins/cubeportfolio/css/cubeportfolio.min.css">
<link href="/templates/government/css/nivo-lightbox.css"
	rel="stylesheet" />
<link
	href="/templates/government/css/nivo-lightbox-theme/default/default.css"
	rel="stylesheet" type="text/css" />
<link href="/templates/government/css/owl.carousel.css" rel="stylesheet"
	media="screen" />
<link href="/templates/government/css/owl.theme.css" rel="stylesheet"
	media="screen" />
<link href="/templates/government/css/animate.css" rel="stylesheet" />
<link href="/templates/government/css/style.css" rel="stylesheet">

<!-- boxed bg -->
<link id="bodybg" href="/templates/government/bodybg/bg1.css"
	rel="stylesheet" type="text/css" />
<!-- template skin -->
<link id="t-colors" href="/templates/government/color/default.css"
	rel="stylesheet">

<!-- =======================================================
        Theme Name: Medicio
        Theme URL: https://bootstrapmade.com/medicio-free-bootstrap-theme/
        Author: BootstrapMade
        Author URL: https://bootstrapmade.com
    ======================================================= -->
</head>
<body id="page-top" data-spy="scroll" data-target=".navbar-custom">


	<div id="wrapper">
		<!-- 상단 메뉴 -->
		<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
			<div class="container navigation">

				<div class="navbar-header page-scroll">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-main-collapse">
						<i class="fa fa-bars"></i>
					</button>
					<a class="navbar-brand" href="/"> <img
						src="/templates/government/img/logo_gnb_p.png" alt="" width="150"
						height="40" />
					</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<!--  -->
				<div
					class="collapse navbar-collapse navbar-right navbar-main-collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#intro">Home</a></li>
						<li>
							<!-- 드랍하는 메뉴 -->
							<div class="dropdown">
								<a><button class="dropbtn">전체조회</button></a>
								<div class="dropdown-content">
									<a href="/citizen/treat">진료내역</a> <a href="#service">예방접종</a> <a
										href="#service">검사기록</a> <a href="#service">건강검진</a> <a
										href="#service">수술기록</a> <a href="#service">입/퇴원</a>
								</div>
							</div> <!-- <a href="#doctor">의료조회</a> -->
						</li>
						<li class="logout">
							<!-- 로그아웃 하는 페이지로 이동 --> <a href="logout" name="logout">로그아웃
						</a>
						</li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container -->
		</nav>
		<!-- 상단 메뉴 끝 -->
	
	

	</div>
	
		<!-- Section: services 서비스 메뉴 이동 section-->
		<section id="service" class="home-section nopadding paddingtop-50">

			<div class="container">
				<div class="modal fade bs-example-modal-lg" tabindex="-1"
					role="dialog" aria-labelledby="myLargeModalLabel"
					aria-hidden="true">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">...</div>
					</div>
				</div>
				<div class="row">
					<!-- <div class="col-sm-6 col-md-6">
					<div class="wow fadeInUp" data-wow-delay="0.2s">
					<img src="/templates/government/img/dummy/img-1.jpg" class="img-responsive" alt="" />
					</div>
	            </div> -->
					<div class="col-sm-6 col-md-12">
						<div class="wow fadeInRight" data-wow-delay="0.1s">
							<div class="service-box">
								<div class="service-icon">
									<span class="fa fa-stethoscope fa-3x"></span>
								</div>
								<div class="service-desc">
									<h5 class="h-light">진료내역 조회</h5>
									<form action="" method="post">
										<input type="date" name="dateBefore"> ~ <input
											type="date" name="dateAfter"> <input type="submit"
											value="조회">
										<!-- 조회버튼을 돋보기로 하기 -->
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3 col-md-6">
						<div class="wow fadeInRight" data-wow-delay="0.1s">
							<div class="service-box">
								<div class="service-icon">
									<span class="fa fa-list-alt fa-3x"></span>
								</div>
								<div class="service-desc">
									<h5 class="h-light">진료내역 목록</h5>
									<table class="table table-striped">
										<thead>
											<tr>
												<th>Firstname</th>
												<th>Lastname</th>
												<th>Email</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>
													<a href="#" data-toggle="modal" data-target=".bs-example-modal-lg">John</a>
												</td>
												<td>Doe</td>
												<td>john@example.com</td>
											</tr>

										</tbody>
									</table>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	<footer>
	
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-md-4">
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>About Medicio</h5>
						<p>
						Lorem ipsum dolor sit amet, ne nam purto nihil impetus, an facilisi accommodare sea
						</p>
					</div>
					</div>
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>Information</h5>
						<ul>
							<li><a href="#">Home</a></li>
							<li><a href="#">Laboratory</a></li>
							<li><a href="#">Medical treatment</a></li>
							<li><a href="#">Terms & conditions</a></li>
						</ul>
					</div>
					</div>
				</div>
				<div class="col-sm-6 col-md-4">
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>Medicio center</h5>
						<p>
						Nam leo lorem, tincidunt id risus ut, ornare tincidunt naqunc sit amet.
						</p>
						<ul>
							<li>
								<span class="fa-stack fa-lg">
									<i class="fa fa-circle fa-stack-2x"></i>
									<i class="fa fa-calendar-o fa-stack-1x fa-inverse"></i>
								</span> Monday - Saturday, 8am to 10pm
							</li>
							<li>
								<span class="fa-stack fa-lg">
									<i class="fa fa-circle fa-stack-2x"></i>
									<i class="fa fa-phone fa-stack-1x fa-inverse"></i>
								</span> +62 0888 904 711
							</li>
							<li>
								<span class="fa-stack fa-lg">
									<i class="fa fa-circle fa-stack-2x"></i>
									<i class="fa fa-envelope-o fa-stack-1x fa-inverse"></i>
								</span> hello@medicio.com
							</li>

						</ul>
					</div>
					</div>
				</div>
				<div class="col-sm-6 col-md-4">
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>Our location</h5>
						<p>The Suithouse V303, Kuningan City, Jakarta Indonesia 12940</p>		
						
					</div>
					</div>
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>Follow us</h5>
						<ul class="company-social">
								<li class="social-facebook"><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li class="social-twitter"><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li class="social-google"><a href="#"><i class="fa fa-google-plus"></i></a></li>
								<li class="social-vimeo"><a href="#"><i class="fa fa-vimeo-square"></i></a></li>
								<li class="social-dribble"><a href="#"><i class="fa fa-dribbble"></i></a></li>
						</ul>
					</div>
					</div>
				</div>
			</div>	
		</div>
		<div class="sub-footer">
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-md-6 col-lg-6">
					<div class="wow fadeInLeft" data-wow-delay="0.1s">
					<div class="text-left">
					<p>&copy;Copyright - Medicio Theme. All rights reserved.</p>
					</div>
					</div>
				</div>
				<div class="col-sm-6 col-md-6 col-lg-6">
					<div class="wow fadeInRight" data-wow-delay="0.1s">
					<div class="text-right">
						<div class="credits">
                            <!-- 
                                All the links in the footer should remain intact. 
                                You can delete the links only if you purchased the pro version.
                                Licensing information: https://bootstrapmade.com/license/
                                Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Medicio
                            -->
                            <a href="https://bootstrapmade.com/free-business-bootstrap-themes-website-templates/">Business Bootstrap Themes</a> by <a href="https://bootstrapmade.com/">BootstrapMade</a>
                        </div>
					</div>
					</div>
				</div>
			</div>	
		</div>
		</div>
	</footer>

	<!-- Core JavaScript Files -->
	<script src="/templates/government/js/jquery.min.js"></script>
	<script src="/templates/government/js/bootstrap.min.js"></script>
	<script src="/templates/government/js/jquery.easing.min.js"></script>
	<script src="/templates/government/js/wow.min.js"></script>
	<script src="/templates/government/js/jquery.scrollTo.js"></script>
	<script src="/templates/government/js/jquery.appear.js"></script>
	<script src="/templates/government/js/stellar.js"></script>
	<script
		src="/templates/government/plugins/cubeportfolio/js/jquery.cubeportfolio.min.js"></script>
	<script src="/templates/government/js/owl.carousel.min.js"></script>
	<script src="/templates/government/js/nivo-lightbox.min.js"></script>
	<script src="/templates/government/js/custom.js"></script>

</body>
<script type="text/javascript">
	$('#myModal').on('shown.bs.modal', function() {
		$('#myInput').focus()
	})
</script>
</html>
