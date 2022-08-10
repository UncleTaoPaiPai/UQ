<div class="container text-center">
	<div class="row">
		<div class="col-md-6" style="height: 300px;">
		<!-- user image -->
			<?php foreach ($listdata as $item) : ?>
				<img src="<?= base_url() ?>assets/picture/<?= $item['image'] ?>">
			<?php endforeach; ?>
		</div>

		<div class="col-md-6" style="height: 300px;">

			<table class="table">
				<tr>
					<!-- user name -->
					<td style="font-size: 25px;  color: #ffffff;font-weight:bold">Name:</td>
					<?php foreach ($listdata as $item) : ?>
						<td style="font-size: 25px;  color: #ffffff;font-weight:bold"><?= $item['name'] ?></td>
					<?php endforeach; ?>
				</tr>

				<tr>
					<!-- user gender -->
					<td style="font-size: 25px;  color: #ffffff;font-weight:bold">Gender:</td>
					<?php foreach ($listdata as $item) : ?>
						<td style="font-size: 25px;  color: #ffffff;font-weight:bold"><?= $item['gender'] ?></td>
					<?php endforeach; ?>
				</tr>

				<tr>
					<!-- user nationality -->
					<td style="font-size: 25px;  color: #ffffff;font-weight:bold">Nationality:</td>
					<?php foreach ($listdata as $item) : ?>
						<td style="font-size: 25px;  color: #ffffff;font-weight:bold"><?= $item['nationality'] ?></td>
					<?php endforeach; ?>
				</tr>

				<tr>
					<!-- user age -->
					<td style="font-size: 25px;  color: #ffffff;font-weight:bold">Age:</td>
					<?php foreach ($listdata as $item) : ?>
						<td style="font-size: 25px;  color: #ffffff;font-weight:bold"><?= $item['age'] ?></td>
					<?php endforeach; ?>
				</tr>

				<tr>
					<!-- user personal statement -->
					<td style="font-size: 25px;  color: #ffffff;font-weight:bold">Personal Statement:</td>
					<?php foreach ($listdata as $item) : ?>
						<td style="font-size: 25px;  color: #ffffff;font-weight:bold"><?= $item['ps'] ?></td>
					<?php endforeach; ?>
				</tr>

			</table>
			<div class="col-md-12">
				<!-- update user information button -->
				<div class="col-md-12">
					<a href="<?php echo base_url(); ?>Userupdate/index" class="btn btn-primary btn-sm active" role="button">info update</a>
					<a href="<?php echo base_url(); ?>product/index" class="btn btn-primary btn-sm active" role="button">shop</a>
				</div>
			</div>
			

		</div>

	</div>
</div>
<br>
<br>
<br>
<br>

<div class="container text-center">
	<div class="row">
		<h3 style="font-size: 25px;  color: #ffffff;font-weight:bold">Personal Albums:</h3>
		<div class="col-md-12">
			<!-- upload user album -->
			<a href="<?php echo base_url(); ?>Videoupdate/index" class="btn btn-primary btn-sm active" role="button">Upload Album</a>
		</div>
		<div class="col-md-12" style="height: 300px;">

			<div class="container">
				<!-- slideshow -->
				<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<div class="row">
								<!-- slideshow first page -->
								<?php foreach ($listvideo as $item) : ?>
									<div class="col-3">
										<a href="<?php echo base_url(); ?>Video/find_video/<?= $item['video'] ?>"><video src="<?php echo base_url(); ?>assets/videoes/<?= $item['video'] ?>" style="height:250px; width:300px"></video></a>
									</div>
								<?php endforeach; ?>
							</div>
						</div>
						<div class="carousel-item  ">
							<div class="row">
								<!-- slideshow second page -->
								<?php foreach ($listdataa as $item) : ?>
									<div class="col-3">
										<a href="<?php echo base_url(); ?>Video/find_video/<?= $item['video'] ?>"><video src="<?php echo base_url(); ?>assets/videoes/<?= $item['video'] ?>" style="height:250px; width:300px"></video></a>
									</div>
								<?php endforeach; ?>
							</div>
						</div>
					</div>
				</div>
				<!-- slideshow's left button -->					
				<a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<!-- slideshow's right button -->
				<a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>

			</div>

		</div>
	</div>
</div>

</body>

</html>