<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>BootStrap Sample Page</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="js/justified-nav.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

	<body>

	<div class="container">

		<div class="masthead">
			<h3 class="text-muted">Car Log</h3>
			<nav>
				<jsp:include page="gnb_carlog.jsp"/>
			</nav>
		</div>
		
		<div class="form-group">
		
			<label for="usr">Name:</label>
			<input type="text" class="form-control" id="usr">
		  
			<label for="comment">Comment:</label>
			<textarea class="form-control" rows="5" id="comment"></textarea>

			<div class="checkbox">
				<label><input type="checkbox" value="">Option 1</label>
			</div>
			<div class="checkbox">
				<label><input type="checkbox" value="">Option 2</label>
			</div>
			<div class="checkbox disabled">
				<label><input type="checkbox" value="" disabled>Option 3</label>
			</div>
			
			<label class="checkbox-inline"><input type="checkbox" value="">Option 1</label>
			<label class="checkbox-inline"><input type="checkbox" value="">Option 2</label>
			<label class="checkbox-inline"><input type="checkbox" value="">Option 3</label>
			
			
			<div class="radio">
				<label><input type="radio" name="optradio">Option 1</label>
			</div>
			<div class="radio">
				<label><input type="radio" name="optradio">Option 2</label>
			</div>
			<div class="radio disabled">
				<label><input type="radio" name="optradio" disabled>Option 3</label>
			</div>
			
			<label class="radio-inline"><input type="radio" name="optradio">Option 1</label>
			<label class="radio-inline"><input type="radio" name="optradio">Option 2</label>
			<label class="radio-inline"><input type="radio" name="optradio">Option 3</label>
			<p>
			<label for="sel1">Select list:</label>
			<select class="form-control" id="sel1">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
			</select>
		  
		</div>
		
		 <form class="form-horizontal" role="form">
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="email">Email:</label>
		    <div class="col-sm-10">
		      <p class="form-control-static">someone@example.com</p>
		    </div>
		  </div>
		</form>
		
		
		<form class="form-horizontal" role="form">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">Focused</label>
		    <div class="col-sm-10">
		      <input class="form-control" id="focusedInput" type="text" value="Click to focus">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">Disabled</label>
		    <div class="col-sm-10">
		      <input class="form-control" id="disabledInput" type="text" disabled>
		    </div>
		  </div>
		  <fieldset disabled>
		    <div class="form-group">
		      <label for="disabledTextInput" class="col-sm-2 control-label">Fieldset disabled</label>
		      <div class="col-sm-10">
		        <input type="text" id="disabledTextInput" class="form-control">
		      </div>
		    </div>
		    <div class="form-group">
		      <label for="disabledSelect" class="col-sm-2 control-label"></label>
		      <div class="col-sm-10">
		        <select id="disabledSelect" class="form-control">
		          <option>Disabled select</option>
		        </select>
		      </div>
		    </div>
		  </fieldset>
		  <div class="form-group has-success has-feedback">
		    <label class="col-sm-2 control-label" for="inputSuccess">Input with success and icon</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="inputSuccess">
		      <span class="glyphicon glyphicon-ok form-control-feedback"></span>
		    </div>
		  </div>
		  <div class="form-group has-warning has-feedback">
		    <label class="col-sm-2 control-label" for="inputWarning">Input with warning and icon</label>
		    <div class="col-sm-8">
		      <input type="text" class="form-control" id="inputWarning">
		      <span class="glyphicon glyphicon-warning-sign form-control-feedback"></span>
		    </div>
		  </div>
		  <div class="form-group has-error has-feedback">
		    <label class="col-sm-2 control-label" for="inputError">Input with error and icon</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputError">
		      <span class="glyphicon glyphicon-remove form-control-feedback"></span>
		    </div>
		  </div>
		</form>
		
		<form class="form-inline" role="form">
		  <div class="form-group">
		    <label for="focusedInput">Focused</label>
		    <input class="form-control" id="focusedInput" type="text">
		  </div>
		  <div class="form-group">
		    <label for="inputPassword">Disabled</label>
		    <input class="form-control" id="disabledInput" type="text" disabled>
		  </div>
		  <div class="form-group has-success has-feedback">
		    <label for="inputSuccess2">Input with success</label>
		    <input type="text" class="form-control" id="inputSuccess2">
		    <span class="glyphicon glyphicon-ok form-control-feedback"></span>
		  </div>
		  <div class="form-group has-warning has-feedback">
		    <label for="inputWarning2">Input with warning</label>
		    <input type="text" class="form-control" id="inputWarning2">
		    <span class="glyphicon glyphicon-warning-sign form-control-feedback"></span>
		  </div>
		  <div class="form-group has-error has-feedback">
		    <label for="inputError2">Input with error</label>
		    <input type="text" class="form-control" id="inputError2">
		    <span class="glyphicon glyphicon-remove form-control-feedback"></span>
		  </div>
		</form>
		
		
		
		<form class="form-inline" role="form">
		  <div class="form-group">
		    <label for="inputdefault">Default input</label>
		    <input class="form-control" id="inputdefault" type="text">
		  </div>
		  <div class="form-group">
		    <label for="inputlg">input-lg</label>
		    <input class="form-control input-lg" id="inputlg" type="text">
		  </div>
		  <div class="form-group">
		    <label for="inputsm">input-sm</label>
		    <input class="form-control input-sm" id="inputsm" type="text">
		  </div>
		</form>
		
		<form class="form-horizontal" role="form">
		  <div class="form-group form-group-lg">
		    <label class="col-sm-2 control-label" for="lg">form-group-lg</label>
		    <div class="col-sm-10">
		      <input class="form-control" type="text" id="lg">
		    </div>
		  </div>
		  <div class="form-group form-group-sm">
		    <label class="col-sm-2 control-label" for="sm">form-group-sm</label>
		    <div class="col-sm-10">
		      <input class="form-control" type="text" id="sm">
		    </div>
		  </div>
		</form>

		
		
	
		<!-- Jumbotron -->
		<div class="jumbotron">
			<h1>Marketing stuff!</h1>
			<p class="lead">부트스트랩에서 말하는 Jumbotron 은 사이트에서 주요 내용을 소개하기 위한 박스 형태의 스타일을 말합니다.
메인페이지에 보면 컨텐츠 상단에 가장 중요한 글이나 주요내용을 표시하는 공간이 있는데요. 바로 그런 부분을 말합니다.</p>
			<p><a class="btn btn-lg btn-success" href="#" role="button">Get started today</a></p>
		</div>

      <!-- Example row of columns -->
      <!--
      <div class="row">
        <div class="col-lg-4">
          <h2>Safari bug warning!</h2>
          <p class="text-danger">As of v8.0, Safari exhibits a bug in which resizing your browser horizontally causes rendering errors in the justified nav that are cleared upon refreshing.</p>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-lg-4">
          <h2>Heading</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
       </div>
        <div class="col-lg-4">
          <h2>Heading</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa.</p>
          <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
        </div>
      </div>
      -->

      <!-- Site footer -->
      <footer class="footer">
        <p>&copy; Company 2014</p>
      </footer>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
