    <div class="container">
        <div class="row">
        <!-- Checkout cart items -->
            <div class="col-md-8">
                <h4 style="color:#ffffff;">Shopping Cart</h4>
                <?php foreach($money as $items):?>
                <table class="table">
                    <tr>
                        <td style="color:#ffffff;">Product:</td>
                        <td style="color:#ffffff;"><?php echo $items['name']?></td>
                    </tr>
                    <tr>
                        <td style="color:#ffffff;">Amount:</td>
                        <td style="color:#ffffff;"><?php echo $items['qty']?></td>
                    </tr> 
                    <tr>
                        <td style="color:#ffffff;">Unit price:</td>
                        <td style="color:#ffffff;"><?php echo $items['price']?></td>
                    </tr> 
                    <tr>
                        <td style="color:#ffffff;">Total:</td>
                        <td style="color:#ffffff;"><?php echo $items['subtotal']?></td>
                    </tr>     
                </table>
                <?php endforeach;?> 
            </div>
            <div class="col-md-4">
                <a href="<?php echo base_url(); ?>Printout/generate_pdf_report" ><button type="button" class="btn btn-primary">Print</button></a><br>
            </div>
            
            <!-- rating box -->
            <div class="col-md-12">
                <div class="card-body" style="width: 350px;">
                    <label for="name">
                        <h3 style=" color: #ffffff; font-weight:bold ">Please rate this service: </h3>
                    </label>
                    <form method="POST" enctype="multipart/form-data" action="<?php echo site_url('userupdate/getrating'); ?>">
                        <fieldset class="rating"> 
                            <input type="radio" id="star5" name="rating" value="5" />
                            <label class="full" for="star5" ></label>

                            <input type="radio" id="star4half" name="rating" value="4.5" />
                            <label class="half" for="star4half"></label>

                            <input type="radio" id="star4" name="rating" value="4" />
                            <label class="full" for="star4"></label>
                            
                            <input type="radio" id="star3half" name="rating" value="3.5" />
                            <label class="half" for="star3half"></label>
                            
                            <input type="radio" id="star3" name="rating" value="3" />
                            <label class="full" for="star3"></label>
                            
                            <input type="radio" id="star2half" name="rating" value="2.5" />
                            <label class="half" for="star2half"></label>
                            
                            <input type="radio" id="star2" name="rating" value="2" />
                            <label class="full" for="star2"></label>
                            
                            <input type="radio" id="star1half" name="rating" value="1.5" />
                            <label class="half" for="star1half"></label>
                            
                            <input type="radio" id="star1" name="rating" value="1" />
                            <label class="full" for="star1"></label>
                            
                            <input type="radio" id="starhalf" name="rating" value="0.5" />
                            <label class="half" for="starhalf"></label>
                        </fieldset>
                        <input class="btn btn-primary btn-sm active" type="submit" value="submit" />
                            
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>