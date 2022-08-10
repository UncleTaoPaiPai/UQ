<!-- user can upload personal albums and add some informations about albums in this page -->

<div class="container ">
	<div class="row">
		<div class="col-md-12">
			<form method="POST" enctype="multipart/form-data" action="<?php echo base_url(); ?>videoupdate/updatevideo">
				<div class="form-group">
					<!-- alblum's video A -->
					<label for="exampleFormControlTextarea1">
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Album:</h4>
					</label>
					<!-- alblum's video B -->
					<input type="file" name="video" size="20"/>
					<br>
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- alblum's name A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Name:</h4>
					</label>
					<!-- alblum's name B -->
					<input type="text" name="name" class="form-control" aria-describedby="passwordHelpInline">
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- alblum's video_name A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Video_name:</h4>
					</label>
					<!-- alblum's video_name B -->
					<input type="text" name="video_name" class="form-control" aria-describedby="passwordHelpInline">
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- alblum's language A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Language:</h4>
					</label>
					<!-- alblum's language B -->
					<input type="text" name="language" class="form-control" aria-describedby="passwordHelpInline">
				</div>

				<br>
				<!-- submit button -->
				<input class="btn btn-primary btn-sm active" type="submit" value="upload" />
				<!-- reset button -->
				<input class="btn btn-primary btn-sm active" type="reset" value="reset" />
			</form>

		</div>
	</div>
</div>
<br>

</body>

</html>