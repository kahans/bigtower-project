<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>진료 차트</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <link href="/templates/hospital/css/bootstrap.min.css" rel="stylesheet">
    <link href="/templates/hospital/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"
        rel="stylesheet">
    <link href="/templates/hospital/css/font-awesome.css" rel="stylesheet">
    <link href="/templates/hospital/css/style.css" rel="stylesheet">
    
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	//추가버튼 클릭시 이벤트
	$(document).on('click','#diseaseNameAdd',function(){
		var addSelect = $('#hiddenPrescription').html();
		$(this).parents('#prescription').append(addSelect);
		
	});
	
	$(document).on('click','#diseaseNameRemove',function(){
		$(this).parent('.selectAdd').remove();
			
	});
	
	
	
	</script>
    
    
    
    
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span
                    class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
                </a><a class="brand" href="index.html">진료차트 </a>
                <div class="nav-collapse">
                    <ul class="nav pull-right">
                    	<a href="">로그아웃</a>
                    
                    	
                       <!--  <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="icon-cog"></i> Account <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="javascript:;">Settings</a></li>
                                <li><a href="javascript:;">Help</a></li>
                            </ul>
                        </li>
                        <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="icon-user"></i> EGrappler.com <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="javascript:;">Profile</a></li>
                                <li><a href="javascript:;">Logout</a></li>
                            </ul>
                        </li> -->
                    </ul>
                    <form class="navbar-search pull-right">
                    <input type="text" class="search-query" placeholder="Search">
                    </form>
                </div>
                <!--/.nav-collapse -->
            </div>
            <!-- /container -->
        </div>
        <!-- /navbar-inner -->
    </div>
    <!-- /navbar -->
    <div class="subnavbar">
        <div class="subnavbar-inner">
            <div class="container">
                <ul class="mainnav">
                    <li><a href="index.html"><i class="icon-dashboard"></i><span>병원소개</span> </a>
                    </li>
                    <li><a href="reports.html"><i class="icon-list-alt"></i><span>aaa</span> </a>
                    </li>
                    <li><a href="guidely.html"><i class="icon-facetime-video"></i><span>App Tour</span>
                    </a></li>
                    <li class="active"><a href="/hospital/charts"><i class="icon-bar-chart"></i><span>Charts</span> </a>
                    </li>
                    <li><a href="shortcodes.html"><i class="icon-code"></i><span>Shortcodes</span> </a>
                    </li>
                    <li class="dropdown"><a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="icon-long-arrow-down"></i><span>Drops</span> <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                        	<li><a href="icons.html">Icons</a></li>
                            <li><a href="faq.html">FAQ</a></li>
                            <li><a href="pricing.html">Pricing Plans</a></li>
                            <li><a href="login.html">Login</a></li>
                            <li><a href="signup.html">Signup</a></li>
                            <li><a href="error.html">404</a></li>
                        </ul>	
                    </li>
                </ul>
            </div>
            <!-- /container -->
        </div>
        <!-- /subnavbar-inner -->
    </div>
    <!-- /subnavbar -->
    <div class="main">
        <div class="main-inner">
            <div class="container">
                <div class="row">
                    <div class="span6">
                        <!-- 진료작성 -->
                        <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>진료작성</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                               	<label>이전 진료결과</label>
                               <div style="overflow:scroll; max-width:auto; width:90%; height:150px; padding:20px; background-color:whight;"></div>
                              	<label>진료결과 작성</label>
                              	
                              	<form action="" method="">
                              		<textarea name="" rows="9" cols="20" style="max-width: 96%; width:96%;"></textarea>
									<button class="btn btn-default" type="submit" style="float: right;">결과 등록</button>	
								</form>
                               <!-- 막대기 차트부분 나옴 -->
                               <!--  <canvas id="bar-chart" class="chart-holder" width="538" height="250">
                                </canvas> -->
                                	<!-- /bar-chart -->
                            </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                        
                        <!-- 처방전 -->
                        <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>처방전</h3>
                            </div>
                          <!--   <!-- /widget-header -->
                           <div class="widget-content">
                           <label>이전 처방목록</label>
                               <div style="overflow:scroll; max-width:auto; width:90%; height:150px; padding:20px; background-color:whight;"></div>
                              	<label>처방전 작성</label>
                              	<form action="" method="post">
	                              	<div id="prescription">
	                              		<div>
		                              		<select name="diseaseSelect">
		                              		<!-- for문 돌려서 list 받아올 것 -->
		                              			<option value="">질병명</option>
		                              			<option>열감기</option>
		                              			<option>기침감기</option>
		                              			<option>몸살감기</option>                             			
		                              		</select>
		                              		<i id="diseaseNameAdd" class="icon-large icon-plus-sign"></i>
	                              		</div>
	                              	</div>
	                              	
	                              	
	                              	<div id="hiddenPrescription" style="display: none;">
	                              		<div class="selectAdd">	
		                              		<select name="diseaseSelect">
		                              			<!-- +버튼 눌렀을 때 추가되는 selectBox 마찬가지로 for문으로 list값 가져와야함 -->
		                              			<option value="">질병명</option>
		                              			<option>열감기</option>
		                              			<option>기침감기</option>
		                              			<option>몸살감기</option>                             			
		                              		</select>
		                              		<i id="diseaseNameAdd" class="icon-large icon-plus-sign"></i>
		                              		<i id="diseaseNameRemove" class="icon-large icon-minus-sign"></i>
	                              		</div>
	                              	</div>
	                              	
	                              	<div>
	                              		<label>약품 검색</label>
	                              		<input type="text" name=""><button class="btn btn-default" >검색</button><br/>
	                              	</div>
	                              	
									<button class="btn btn-default" type="submit" style="float: right;">처방하기</button>
                            	</form>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                     </div>   
                     <!-- /span6  -->
                     
                        <div class="span6">  
                       <!-- 검사요청 -->
                        <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>검사 요청</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                              	<form>
	                              	<span>건강검진<input type="checkbox" class="testRequest" value=""/></span>
	                              	<span>혈액검사<input type="checkbox" class="testRequest" value=""/></span>
	                              	<span>영상검사<input type="checkbox" class="testRequest" value=""/></span>
	                              	<button class="btn btn-default" type="submit" style="float: right;">요청</button>
                              	</form>
                              	
                            </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                   
                    <!-- 건강검진결과 -->
                        <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>건강검진결과</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                            	 이 부분에 건강검진결과 이미지파일이 들어와야 한다.<br/>
                            	 <!-- 이미지파일은 가장 최근의 2개만 가지고 와서 보여준다. -->
                            	<img alt="" src=""> <!-- 가장최근  -->
                            	<img alt="" src=""><!-- 두번째 것 -->
                            	
                                <!-- 원형 도표// 나중에 사용할 일 있으면 꺼내 쓸것
                                 <canvas id="donut-chart" class="chart-holder" width="538" height="250">
                                </canvas> -->
                                
                                <!-- /bar-chart -->
                            </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                        
                        
                        <!--  -->
                        <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>
                                    A Chart</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                                <canvas id="line-chart" class="chart-holder" width="538" height="250">
                                </canvas>
                                <!-- /-chart -->
                            </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                    </div>
                    <!-- /span6 -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /main-inner -->
    </div>
    <!-- /main -->
    <div class="extra">
        <div class="extra-inner">
            <div class="container">
                <div class="row">
                    <div class="span3">
                        <h4>
                            About Free Admin Template</h4>
                        <ul>
                            <li><a href="javascript:;">EGrappler.com</a></li>
                            <li><a href="javascript:;">Web Development Resources</a></li>
                            <li><a href="javascript:;">Responsive HTML5 Portfolio Templates</a></li>
                            <li><a href="javascript:;">Free Resources and Scripts</a></li>
                        </ul>
                    </div>
                    <!-- /span3 -->
                    <div class="span3">
                        <h4>
                            Support</h4>
                        <ul>
                            <li><a href="javascript:;">Frequently Asked Questions</a></li>
                            <li><a href="javascript:;">Ask a Question</a></li>
                            <li><a href="javascript:;">Video Tutorial</a></li>
                            <li><a href="javascript:;">Feedback</a></li>
                        </ul>
                    </div>
                    <!-- /span3 -->
                    <div class="span3">
                        <h4>
                            Something Legal</h4>
                        <ul>
                            <li><a href="javascript:;">Read License</a></li>
                            <li><a href="javascript:;">Terms of Use</a></li>
                            <li><a href="javascript:;">Privacy Policy</a></li>
                        </ul>
                    </div>
                    <!-- /span3 -->
                    <div class="span3">
                        <h4>
                            Open Source jQuery Plugins</h4>
                        <ul>
                            <li><a href="http://www.egrappler.com">Open Source jQuery Plugins</a></li>
                            <li><a href="http://www.egrappler.com;">HTML5 Responsive Tempaltes</a></li>
                            <li><a href="http://www.egrappler.com;">Free Contact Form Plugin</a></li>
                            <li><a href="http://www.egrappler.com;">Flat UI PSD</a></li>
                        </ul>
                    </div>
                    <!-- /span3 -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /extra-inner -->
    </div>
    <!-- /extra -->
    <div class="footer">
        <div class="footer-inner">
            <div class="container">
                <div class="row">
                    <div class="span12">
                        &copy; 2013 <a href="http://www.egrappler.com/">Bootstrap Responsive Admin Template</a>.
                    </div>
                    <!-- /span12 -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /footer-inner -->
    </div>
    <!-- /footer -->
    <!-- Le javascript
================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/templates/hospital/js/jquery-1.7.2.min.js"></script>
    <script src="/templates/hospital/js/excanvas.min.js"></script>
    <script src="/templates/hospital/js/chart.min.js" type="text/javascript"></script>
    <script src="/templates/hospital/js/bootstrap.js"></script>
    <script src="/templates/hospital/js/base.js"></script>
    <script>
        var doughnutData = [
				{
				    value: 30,
				    color: "#F7464A"
				},
				{
				    value: 50,
				    color: "#46BFBD"
				},
				{
				    value: 100,
				    color: "#FDB45C"
				},
				{
				    value: 40,
				    color: "#949FB1"
				},
				{
				    value: 120,
				    color: "#4D5360"
				}

			];

        var myDoughnut = new Chart(document.getElementById("donut-chart").getContext("2d")).Doughnut(doughnutData);


        var lineChartData = {
            labels: ["January", "February", "March", "April", "May", "June", "July"],
            datasets: [
				{
				    fillColor: "rgba(220,220,220,0.5)",
				    strokeColor: "rgba(220,220,220,1)",
				    pointColor: "rgba(220,220,220,1)",
				    pointStrokeColor: "#fff",
				    data: [65, 59, 90, 81, 56, 55, 40]
				},
				{
				    fillColor: "rgba(151,187,205,0.5)",
				    strokeColor: "rgba(151,187,205,1)",
				    pointColor: "rgba(151,187,205,1)",
				    pointStrokeColor: "#fff",
				    data: [28, 48, 40, 19, 96, 27, 100]
				}
			]

        }

        var myLine = new Chart(document.getElementById("area-chart").getContext("2d")).Line(lineChartData);


        var barChartData = {
            labels: ["January", "February", "March", "April", "May", "June", "July"],
            datasets: [
				{
				    fillColor: "rgba(220,220,220,0.5)",
				    strokeColor: "rgba(220,220,220,1)",
				    data: [65, 59, 90, 81, 56, 55, 40]
				},
				{
				    fillColor: "rgba(151,187,205,0.5)",
				    strokeColor: "rgba(151,187,205,1)",
				    data: [28, 48, 40, 19, 96, 27, 100]
				}
			]

        }

var myLine = new Chart(document.getElementById("bar-chart").getContext("2d")).Bar(barChartData);

var pieData = [
				{
				    value: 30,
				    color: "#F38630"
				},
				{
				    value: 50,
				    color: "#E0E4CC"
				},
				{
				    value: 100,
				    color: "#69D2E7"
				}

			];

				var myPie = new Chart(document.getElementById("pie-chart").getContext("2d")).Pie(pieData);

				var chartData = [
			{
			    value: Math.random(),
			    color: "#D97041"
			},
			{
			    value: Math.random(),
			    color: "#C7604C"
			},
			{
			    value: Math.random(),
			    color: "#21323D"
			},
			{
			    value: Math.random(),
			    color: "#9D9B7F"
			},
			{
			    value: Math.random(),
			    color: "#7D4F6D"
			},
			{
			    value: Math.random(),
			    color: "#584A5E"
			}
		];
				var myPolarArea = new Chart(document.getElementById("line-chart").getContext("2d")).PolarArea(chartData);
	</script>
</body>
</html>