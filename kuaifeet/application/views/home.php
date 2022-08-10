<html>

<head>
	<!-- character encoding  -->
	<meta charset="utf-8">
	<!-- title -->
	<title>home</title>
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
		/* slogon interface */
		#hero .content {
			background: rgba(0, 0, 0, 0.1);
			height: 100%;
			width: 100%;
			z-index: 20;
			position: absolute;
			top: 0;
			left: 0;

		}
		/* slogon interface */
		#hero .content h1 {
			color: #fff;
			font-weight: 600;

		}

	</style>

</head>

<body>

	<div id="hero">
		<!-- background video -->
		<video loop="loop" muted="muted" autoplay="autoplay">
			<source src="<?php echo base_url(); ?>assets/video/home.mp4" type="video/mp4">
			</source>
		</video>

		<div class="content d-flex">
			<div class="container text-center align-content-md-center">
				<!-- title -->
				<h1 style="font-family: 'Amatic SC', cursive; font-size: 100px; color: #3368FF">KUAIFEET</h1>
				<div class="container">
					<div style=" margin: 0 auto; text-align: center;"></div>
					<!-- navigation bar -->
					<div class="row">
						<div class="col-md-4"></div>
						<div class="col-md-1">
							<a href="<?php echo base_url(); ?>Home" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818;">Home</a>
						</div>
						<div class="col-md-1">
							<a href="<?php echo base_url(); ?>Search" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818;">Search</a>
						</div>
						<div class="col-md-1">
							<?php if (!$this->session->userdata('logged_in')) : ?>
								<a href="<?php echo base_url(); ?>Registration" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818"> Register </a>
							<?php endif; ?>
							<?php if ($this->session->userdata('logged_in')) : ?>
								<a href="<?php echo base_url(); ?>User_info/showall" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818"> Account </a>
							<?php endif; ?>
						</div>
						<div class="col-md-1">
							<?php if (!$this->session->userdata('logged_in')) : ?>
								<a href="<?php echo base_url(); ?>Login/index" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818"> Login </a>
							<?php endif; ?>
							<?php if ($this->session->userdata('logged_in')) : ?>
								<a href="<?php echo base_url(); ?>Login/logout" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818"> Logout </a>
							<?php endif; ?>
						</div>
						<div class="col-md-4"></div>
					</div>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
				</div>
				<div class="row">
					<div class="col-md-2"></div>
					<div class="col-md-8">
						<a href="<?php echo base_url(); ?>Home/index" style="text-decoration: none;">
						<!-- slogon -->
							<h1 class="font-weight-bold " style="font-family: 'Amatic SC', cursive; font-size: 50px;">Take every step in life with heart</h1>
						</a>
					</div>
					<div class="col-md-2"></div>
				</div>
			</div>
		</div>

	</div>

</body>

</html>