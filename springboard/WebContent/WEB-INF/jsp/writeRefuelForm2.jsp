<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Refuel</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="js/justified-nav.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="js/ie-emulation-modes-warning.js"></script>
<script type="text/javascript" src="js/jquery-1.8.0.js" charset="utf-8"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<script type="text/javascript">
	$(document).ready(function() {
		//$("#home").removeClass("active") ;
		//$("#refuel").addClass("active") ;
		
		$("li").removeClass("active") ;
		$("#refuel").addClass("active") ;
		
		
	});

	function doSubmit() {
		if (refuelFrm.refuel_date.value == "") {
			alert("주유일을 입력해주세요.");
			return;
		}
		if (refuelFrm.distance.value == "") {
			alert("총주행거리를 입력해주세요.");
			return;
		}

		refuelFrm.submit();
	}
</script>
</head>

<body>
	<div class="container">

		<div class="masthead">
			<h3 class="text-muted">Car Log</h3>
			<nav>
				<jsp:include page="gnb_carlog.jsp" />
			</nav>
		</div>

		<form class="form-horizontal" role="form" name="refuelFrm"
			action="writeRefuel2.do" method="post">
			<div class="form-group">
				<label class="col-sm-2 control-label">주유일</label>
				<div class="col-sm-10">
					<input class="form-control" id="focusedInput" type="text"
						name="refuel_date">
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">총주행거리</label>
				<div class="col-sm-10">
					<input class="form-control" id="focusedInput" type="text"
						name="distance">
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">주유량</label>
				<div class="col-sm-10">
					<input class="form-control" id="focusedInput" type="text"
						name="gas_liter">
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">주유비</label>
				<div class="col-sm-10">
					<input class="form-control" id="focusedInput" type="text"
						name="price">
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">단가(리터당)</label>
				<div class="col-sm-10">
					<input class="form-control" id="focusedInput" type="text"
						name="unit_price">
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">주유소</label>
				<div class="col-sm-10">
					<input class="form-control" type="text" name="gas_station">
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label" for="comment">Comment</label>
				<div class="col-sm-10">
					<textarea class="form-control" rows="5" name="description"></textarea>
				</div>
			</div>

			<button type="submit" class="btn btn-default">Submit</button>

		</form>
		
		
		<!-- Site footer -->
      <footer class="footer">
        <jsp:include page="footer_carlog.jsp"/>
      </footer>
      
	</div> <!-- /container -->
</body>
</html>
