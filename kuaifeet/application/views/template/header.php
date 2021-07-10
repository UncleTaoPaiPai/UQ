<html>

<head>
	<meta charset="utf-8">
	<title></title>
	<!-- bootstrap configuration  -->
	<link rel="stylesheet" href="<?php echo base_url(); ?>assets/css/bootstrap.min.css">
	<script src="<?php echo base_url(); ?>assets/js/jquery-3.5.1.min.js"></script>
	<script src="<?php echo base_url(); ?>assets/js/bootstrap.bundle.min.js"></script>
	<script src="<?php echo base_url(); ?>assets/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/sharer.js/latest/sharer.min.js"></script>
	<!-- font style -->
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Amatic+SC:wght@700&display=swap" rel="stylesheet">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Josefin+Sans&display=swap" rel="stylesheet">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Akaya+Kanadaka&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">


	<!-- css -->
	<style type="text/css">
		/* the whole page */
		body {
			background-image: url("<?php echo base_url(); ?>assets/img/background.jpg");
			background-repeat: no-repeat;
			background-size: cover
		}

		@import url(https://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css);
        /* @import url(http://fonts.googleapis.com/css?family=Calibri:400,300,700); */

        .rating {
            border: none;
            margin-right: 50px
        }

        .rating>[id^="star"] {
            display: none
        }

        .rating>label:before {
            margin: 5px;
            font-size: 2.25em;
            font-family: FontAwesome;
            display: inline-block;
            content: "\f005"
        }

        .rating>.half:before {
            content: "\f089";
            position: absolute
        }

        .rating>label {
            color: #ddd;
            float: right
        }

        .rating>[id^="star"]:checked~label,
        .rating:not(:checked)>label:hover,
        .rating:not(:checked)>label:hover~label {
            color: #FFD700
        }

        .rating>[id^="star"]:checked+label:hover,
        .rating>[id^="star"]:checked~label:hover,
        .rating>label:hover~[id^="star"]:checked~label,
        .rating>[id^="star"]:checked~label:hover~label {
            color: #FFED85
        }

		


	</style>

	

	

</head>

<body>

	<div class="container">
		<div style=" margin: 0 auto; text-align: center;"></div>
		<div style="width: 300px; margin: 0 auto; text-align: center;">
			<!-- title -->
			<a href="" style="font-family: 'Amatic SC'; font-size: 100px; color: #3368FF; text-decoration: none;">KUAIFEET</a>
		</div>
		<div class="row">
			<div class="col-md-4"></div>
			<!-- navigation bar -->
			<div class="col-md-1">
				<a href="<?php echo base_url(); ?>Home/index" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818;">Home</a>
			</div>
			<!-- navigation bar -->
			<div class="col-md-1">
				<a href="<?php echo base_url(); ?>Search/index" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818;">Search</a>
			</div>
			<!-- navigation bar -->
			<div class="col-md-1">
				<?php if (!$this->session->userdata('logged_in')) : ?>
					<a href="<?php echo base_url(); ?>Registration/index" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818"> Register </a>
				<?php endif; ?>
		
				<?php if ($this->session->userdata('logged_in')) : ?>
					<a href="<?php echo base_url(); ?>User_info/showall/" style="font-family: 'Akaya Kanadaka', cursive; text-decoration: none; font-size: 25px; color: #C04818"> Account </a>
				<?php endif; ?>
				
			</div>
			<!-- navigation bar -->
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
		<hr>
	</div>