<!-- the page is provided to the users to update personal information -->

<div class="container ">
	<div class="row">
		<div class="col-md-12">
			<form method="POST" enctype="multipart/form-data" action="<?php echo site_url('Userupdate/start_update'); ?>">
				<div class="form-group">
					<?php 
						$username = $_SESSION['username'];
						$data=$this->status->getstatus($username);
					if(($data->status)=='0'){;?>
						<a href='<?php echo base_url(); ?>email/index'>You need to verify your email</a>;
					<?php	
					}else{
						echo '<h4 style="color:#ffffff;">Verify mailbox successfully</h4>';
					}
					;?>
				</div>
				
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- update image A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Photo:</h4>
					</label>
					<!-- update image B -->
					<input type="file" name="pic">
					<br>
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- update name A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Name:</h4>
					</label>
					<!-- update name B -->
					<input type="text" name="name" class="form-control" aria-describedby="passwordHelpInline">
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- update nationality A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Nationality:</h4>
					</label>
					<!-- update nationality B -->
					<input type="text" name="nationality" class="form-control" aria-describedby="passwordHelpInline">
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- update gender A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Gender:</h4>
					</label>
					<!-- update gender B -->
					<select class="form-control" name="gender">
						<option>Male</option>
						<option>Female</option>
					</select>
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- update age A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Age:</h4>
					</label>
					<!-- update age B -->
					<input type="text" name="age" class="form-control" aria-describedby="passwordHelpInline">
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">
						<!-- update personal statement A -->
						<h4 style="font-size: 25px;  color: #ffffff;font-weight:bold">Personal Statement:</h4>
					</label>
					<!-- update personal statement B -->
					<textarea class="form-control" name="ps" rows="3"></textarea>
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