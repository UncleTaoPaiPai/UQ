<html>
<head>
	<!-- character encoding  -->
	<meta charset="utf-8">
	<!-- title -->
	<title>Login</title>
	<!-- mobile -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shink-to-fit=no">
	<!-- bootstrap configuration -->
	<link rel="stylesheet" href="<?php echo base_url(); ?>assets/css/bootstrap.min.css">
	<script src="<?php echo base_url(); ?>assets/js/jquery-3.5.1.min.js"></script>
	<script src="<?php echo base_url(); ?>assets/js/bootstrap.bundle.min.js"></script>
	<script src="<?php echo base_url(); ?>assets/js/bootstrap.min.js"></script>
	<!-- font style -->
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Amatic+SC:wght@700&display=swap" rel="stylesheet">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Josefin+Sans&display=swap" rel="stylesheet">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Akaya+Kanadaka&display=swap" rel="stylesheet">
	<!-- icon  -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<!-- css -->
	<style type="text/css">
		/* background */
		#hero {
			position: relative;
		}
		/* background video */
		#hero video {
			height: 100vh;
			width: 100%;
			background-position: absolute;
			z-index: 10;
			object-fit: cover;
		}
		/* login interface */
		#hero .content {
			background: rgba(0, 0, 0, 0.1);
			height: 100%;
			width: 100%;
			z-index: 20;
			position: absolute;
			top: 0;
			left: 0;
		}
		/* login interface */
		#hero .content h1 {
			color: #fff;
			font-weight: 600;
		}
		/* login interface */
		#hero .content h3 {
			color: #fff;
			font-weight: 300;
			top: 50%
		}
		/* login interface button */
		.btn1 {
			border: none;
			outline: none;
			height: 50px;
			width: 100%;
			background-color: #000000;
			color: white;
			border-radius: 4px;
			font-weight: bold;
		}
		/* login interface button */
		.btn1:hover {
			background-color: white;
			border: 1px solid;
			color: black;
		}
	</style>

</head>

<body>

	<div id="hero">
		<!-- background video -->
		<video loop="loop" muted="muted" autoplay="autoplay">
			<source src="<?php echo base_url(); ?>assets/video/login.MOV" type="video/mp4">
			</source>
		</video>

		<div class="content d-flex">
			<div class="container text-center align-content-md-center">
				<!-- title -->
				<h1 style="font-family: 'Amatic SC', cursive; font-size: 100px; color: #3368FF">KUAIFEET</h1>
				<img src="<?php echo base_url(); ?>assets/img/3.png" style="height: 50px; width: 50px;">
				<br>

				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" style=" background: rgba(0,0,0,0.5);">
						<h1 class="font-weight-bold " style="font-family: 'Amatic SC', cursive; font-size: 50px;">Login</h1>
						<hr />
						<h4 class="font-weight-bolder " style="font-family: 'Amatic SC', cursive; font-size: 30px; color: #ffffff">Sign into your account</h4>
						<!-- login interface button -->
						<form method="POST" action="<?php echo base_url(); ?>Login/check_login">
							<div class="form-row">
								<div class="col-lg-1"></div>
								<div class="col-lg-10" >
									<input type="text" style="width: 100%;" class="form-control" name="username" placeholder="username" />
								</div>
								<div class="col-lg-1"></div>
							</div>
							<br>
							<div class="form-row">
								<div class="col-lg-1"></div>
								<div class="col-lg-10" >
									<input type="password" style="width: 100%;" name='password' class="form-control" placeholder="password" />
								</div>
								<div class="col-lg-1"></div>
							</div>

							<div class="form-row">
								<div class="col-lg-1"></div>
								<div class="col-lg-10" >
									<!-- remember me button -->
									<label style="color: #ffffff"><input type="checkbox" style="width: 100%;" name='remember' style="color: #ffffff;" />Remember Me</label>
								</div>
								<div class="col-lg-1"></div>
							</div>

							<div class="form-row">
								<div class="col-lg-1"></div>
								<div class="col-lg-10" >
									<!-- submit button -->
									<input type="submit" class="btn1 mt-3 mb-5" value="submit" />
								</div>
								<div class="col-lg-1"></div>
							</div>

							<div class="form-row">
								<div class="col-lg-1"></div>
								<div class="col-lg-10" >
									<!-- facebook link -->
									<a href="<?php echo base_url(); ?>face/index"><i class="fa fa-facebook-square" style="font-size:48px;color:#16A6FB"></i></a>
								</div>
								<div class="col-lg-1"></div>
							</div>

							<div class="form-row">
								<div class="col-lg-1"></div>
								<div class="col-lg-10">
									<!-- home link -->
									<a href="<?php echo base_url(); ?>Home/index">Back to home</a><br />
									<!-- forget password link -->
									<a href="<?php echo base_url(); ?>Forgetpassword/index">Forget Password</a>
									<!-- register account link -->
									<p style="color: #ffffff;">Don't have an account? <a href="<?php echo base_url(); ?>Registration/index">Register here</a></p>
								</div>
								<div class="col-lg-1"></div>
							</div>
						</form>
					</div>
					<div class="col-md-4"></div>
				</div>
			</div>
		</div>

	</div>

</body>

</html>