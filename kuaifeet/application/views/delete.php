<!-- the page is provided to the users to delete albums video -->

<div class="container ">
	<div class="row">
		<div class="col-md-12">
			<form method="POST" enctype="multipart/form-data" action="<?php echo site_url('Delete/deletevideo'); ?>">
				
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- delete video name A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">video name:</h4>
					</label>
					<!-- delete video name B -->
					<input type="text" name="video_name" class="form-control" aria-describedby="passwordHelpInline">
				</div>
				
				<br>
				<!-- submit button -->
				<input class="btn btn-primary btn-sm active" type="submit" value="submit" />
				<!-- reset button -->
				<input class="btn btn-primary btn-sm active" type="reset" value="reset" />
			</form>
		</div>
	</div>
</div>
<br >
</body>
</html>