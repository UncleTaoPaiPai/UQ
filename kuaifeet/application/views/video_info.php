<!-- the information of per album -->

<div class="container">
	<div class="row ">
		<div class="col-md-12" style=" background-color: rgba(255,255,255,0.1);  height: 250px;">
			<!-- slideshow -->
			<div class="container">
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
		<br>
		<div class="col-md-8" style="height: 460px; background-color: rgba(255,255,255,0.1);">
			<div class="row row-cols-1">
				<!-- albums video -->
				<div class="col embed-responsive embed-responsive-16by9">
					<video loop="loop" width="700" autoplay="autoplay" height="650" color="#000000" controls="controls" controlsList="nodownload">
						<?php foreach ($listdata as $item) : ?>
							<source src="<?= base_url() ?>assets/videoes/<?= $item['video'] ?>" type="video/mp4">
							</source>
						<?php endforeach; ?>
					</video>
				</div>
			</div>
		</div>
		
		<!-- rating -->
		<div class="col-md-4" style="height: 460px; background-color: rgba(255,255,255,0.1);">
			
			<div class="row row-cols-1">
				<div class="col">
					<div class="row">
						<div class="col-md-1" style="height: 100px;">
						</div>
						<div class="col-md-11" style="height: 100px;">
							<br>
							
							<br>
							<table style="background-color: rgba(255,255,255,0.2);">
								<tr>
									<!-- albums video's author -->
									<td style="font-size: 25px; color: #000000; font-weight:bold">·Author: </td>
									<?php foreach ($listdata as $item) : ?>
										<td style="font-size: 20px;  color: #ffffff;font-weight:bold"><?= $item['name'] ?></td>
									<?php endforeach; ?>
								</tr>
								<tr>
									<!-- albums video's song name-->
									<td style="font-size: 25px; color: #000000; font-weight:bold">·Song name:</td>
									<?php foreach ($listdata as $item) : ?>
										<td style="font-size: 20px;  color: #ffffff;font-weight:bold"><?= $item['video_name'] ?></td>
									<?php endforeach; ?>
								</tr>
								<tr>
									<!-- albums video's language -->
									<td style="font-size: 25px; color: #000000; font-weight:bold">·Language:</td>
									<?php foreach ($listdata as $item) : ?>
										<td style="font-size: 20px;  color: #ffffff;font-weight:bold"><?= $item['language'] ?></td>
									<?php endforeach; ?>
								</tr>
							</table>
							
						</div>
					
					</div>
				</div>
				<br>

				<div class="col">

					<!-- add comment area -->
					<form role="form" method="POST" action="<?php echo base_url(); ?>Video/addcomments">
						<div class="form-group">
							<br>
							<br>
							<br>
							<br>
							<br>
							<a href="#" class="facebook-btn"><i class="fa fa-3x fa-facebook-square"></i></a>
							<br>
							<br>
							<label for="name">
								<h3 style=" color: #000000; background-color: rgba(255,255,255,0.2); font-weight:bold ">· Add Public Comment :</h3>
							</label><br>
							<!-- albums name -->
							<input type="text" placeholder="Please type video name:" name="video_name" /><br><br>
							<!-- comments -->
							<textarea class="form-control" rows="3" name="comments" placeholder="Please type comments:"></textarea>
							<!-- submit button -->
							<input style="float:right" type="submit" value="submit" />
							<br>

						</div>
					</form>

				</div>
			</div>
		</div>
	</div>
</div>

<!-- check comments area -->
<div class="container" style="background-color: rgba(255,255,255,0.1); height: 300px;">
	<label for="name">
		<h3 style="color: #000000; background-color: rgba(255,255,255,0.2); font-weight:bold ">· Comment :</h3>
	</label>
	<div class="row row-cols-1 ">
		<div class="col-md-12">
			<!-- comments context -->
			<?php foreach ($listcomments as $item) : ?>
				<div class="" style="font-size: 20px; ">
					<p style="font-size: 25px;  color: #ffffff;font-weight:bold"><?= $item['name'] ?> said: " <?= $item['comments'] ?>"</p>
				</div>
			<?php endforeach; ?>

		</div>

	</div>
</div>


<script>
		const facebookbtn = document.querySelector(".facebook-btn");
		function start() {
			let postUrl = encodeURI(document.location.href);
			facebookbtn.setAttribute(
				"href",
				`https://www.facebook.com/sharer.php?u=${postUrl}`
			);
		}
		start();
	</script>
</body>

</html>