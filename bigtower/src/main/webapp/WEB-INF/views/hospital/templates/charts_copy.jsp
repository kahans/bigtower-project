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
                              		<div align="center">
										<button class="btn btn-default" type="submit">결과 등록</button>	
									</div>
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
	                              		<input type="text" name="" value="A"><button class="btn btn-default">검색</button><br/>
	                              	</div>
	                              	<div>
	                              		<table class="table table-hover">
	                              			<tr>
	                              				<td>A01</td>
	                              				<td>몸살에 좋은 감기약</td>
	                              				<td><input type="checkbox"/></td>
	                              			</tr>
	                              			<tr>
	                              				<td>AA007</td>
	                              				<td>빈혈방지용 철분제</td>
	                              				<td><input type="checkbox"/></td>
	                              			</tr>
	                              		
	                              		</table>
	                              	
	                              	</div>
	                              	<div align="center">
									<button class="btn btn-default" type="submit">처방하기</button>
									</div>
                            	</form>
	                        </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                     </div>   
                     <!-- /span6  -->
                     
                        <div class="span3">  
                       <!-- 검사요청 -->
                        <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>검사 요청</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                              	<form>
                              	<div align="center">
                              		
                              			<span>건강검진<input type="checkbox" class="testRequest" value=""/></span>
                              			<span>혈액검사<input type="checkbox" class="testRequest" value=""/></span>
                              			<span>영상검사<input type="checkbox" class="testRequest" value=""/></span>
	                              		<button class="btn btn-default" type="submit">요청</button>
	                              	</div>
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
                            	 이 부분에 건강검진결과 날짜순으로 들어와야 한다.<br/>
                            	 <table class="table table-hover">
                            	 	<tr>
                            	 		<th>날짜</th>
                            	 		<th>이미지파일이름</th>
                            	 	</tr>
                            	 	<tr>
                            	 		<td>2017-02-17</td>
                            	 		<td><a href="">이미지파일</a></td>
                            	 	</tr>
                            	 	<tr>
                            	 		<td>2016-12-30</td>
                            	 		<td><a href="">이미지파일</a></td>
                            	 	</tr>
                            	 	<tr>
                            	 		<td>2016-04-09</td>
                            	 		<td><a href="">이미지파일</a></td>
                            	 	</tr>
                            	 </table>
                            	 <!-- 이미지파일은 가장 최근의 2개만 가지고 와서 보여준다. -->
                            	
                            	<!-- 이미지 이런식으로 나오도록 -->
                            	<!-- <img alt="" src="/templates/mainCss/img/AA_001.jpg"> 가장최근 
                            	<img alt="" src=""> --><!-- 두번째 것 -->
                            	<!-- 여기까지 -->
                            	
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
                                <h3>검사결과</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                               	검사결과 나오는 곳 버튼 누르면 팝업창이 뜬다
                               	바로 위의 건강검진결과 보여주는 것 처럼 혈액 누르면
                               	혈액 팝업창이 뜨고 테이블이 보이고 거기서 이미지파일 이름을 누르면
                               	사진이 뜨는 식
                               	<br/>
                               	<button class="btn btn-default">혈액</button>
                               	
                               	<button class="btn btn-default">영상</button>                               	
                                <!-- /-chart -->
                            </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                         
                         
                          <!-- 예방접종 -->
                        <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>예방접종</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                               	예방접종 
                               	<br/>
                               	<div>
	                              <form action="">
	                              		
		                           		<ul class="unstyled">
		                               		<li><select>
	                               					<option>예방접종명</option>
	                               					<option>독감</option>
	                               					<option>간염</option>
	                               				</select>
	                               			</li>
	                               			<li>
	                               				<select size="auto">
	                               					<option>접종차수</option>
	                               					<option>1회차</option>
	                               					<option>2회차</option>
	                               				</select>
	                               			</li>                            
		                               	</ul>
		                               	<button class="btn btn-default" type="submit" style="float: left;">등록</button> 
	                               </form>
                             	</div>
                              	<div>         
	                               <table class="table table-hover">
	                               		<tr>
	                               			<th>날짜</th>
	                               			<th>예방접종명</th>
	                               			<th>현재접종차수</th>
	                               		</tr>
	                               		<tr>
	                               			<td>2017-01-22</td>
	                               			<td>독감</td>
	                               			<td>1회</td>
	                               		</tr>
	                               		<tr>
	                               			<td>2016-10-03</td>
	                               			<td>B형간혐</td>
	                               			<td>2회</td>
	                               		</tr>
	                               </table> 
                               </div>                	
                                <!-- /-chart -->
                            </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                      </div>
                      <!-- span3 -->
                        <div class="span3">
                        <!-- 대기자목록 -->
                           <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>대기자목록</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                               	오늘접수대기자만 가져옴
                               	<br/>
                               
                              	<div>         
	                               <table class="table table-hover">
	                               		<tr>
	                               			<th>환자이름</th>
	                               		</tr>
	                               		<tr>
	                               			<td>최유민(환자이름)</td>
	                               		</tr>
	                               		<tr>
	                               			<td>이명철</td>
	                               		</tr>
	                               		<tr>
	                               			<td>홍인용</td>
	                               		</tr>
	                               		<tr>
	                               			<td>정상일</td>
	                               		</tr>
	                               		
	                               </table> 
                               </div>                	
                                <!-- /-chart -->
                            </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                        
                        <!-- 입/퇴원  -->
                          <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>입/퇴원</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                               	입/퇴원 요청
                               	<br/>
                               
                              	<div align="center">         
									<button class="btn btn-default">입원요청</button>
									<button class="btn btn-default">퇴원요청</button>
                               </div>                	
                                <!-- /-chart -->
                            </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                        
                        <!-- 수술  -->
                          <div class="widget">
                            <div class="widget-header">
                                <i class="icon-bar-chart"></i>
                                <h3>수술</h3>
                            </div>
                            <!-- /widget-header -->
                            <div class="widget-content">
                            <label>수술기록지</label>
                               <div style="overflow:scroll; max-width:auto; width:90%; height:150px; padding:20px; background-color:whight;"></div>
                              	<label>수술기록지 작성</label>
                              	
                              	<form action="" method="">
                              		<textarea name="" rows="9" cols="20" style="max-width: 96%; width:96%;"></textarea>
                              		<div align="center">
										<button class="btn btn-default" type="submit">결과 등록</button>	
									</div>
								</form>
                               	
                                <!-- /-chart -->
                            </div>
                            <!-- /widget-content -->
                        </div>
                        <!-- /widget -->
                        
                        
                        
                    </div>
                    <!-- /span3 -->
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