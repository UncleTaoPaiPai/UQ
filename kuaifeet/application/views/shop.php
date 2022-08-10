<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<?php echo base_url(); ?>assets/css/bootstrap.min.css">
	<script src="<?php echo base_url(); ?>assets/js/jquery-3.5.1.min.js"></script>
	<script src="<?php echo base_url(); ?>assets/js/bootstrap.bundle.min.js"></script>
	<script src="<?php echo base_url(); ?>assets/js/bootstrap.min.js"></script>
    <title>Document</title>
</head>
<body>
    <div class="container">
        
        <div class="row">
            <!-- Commodity interface -->
            <div class="col-md-8">
                <h4 style="color:#ffffff;">Products:</h4>
                <div class="row">
                    <?php foreach($data->result() as $row):?>
                        <div class="thumbnail">
                            <img width="200" src="<?php echo base_url();?>assets/picture/<?php echo $row->image;?>">
                            <div class="caption">
                                <h4 style="color:#ffffff;"><?php echo $row->name;?></h4>
                                <div class="row">
                                    <div class="col-md-7">
                                        <h4 style="color:#ffffff;">AUD<?php echo $row->price;?></h4>
                                    </div>
                                    <div class="col-md-5">
                                        <input type="number" name="quantity" id="<?php echo $row->id;?>" value="1" class="quantity form-control">
                                    </div>
                                </div>
                                <button class="add_cart btn btn-success btn-block" data-productid="<?php echo $row->id;?>" data-productname="<?php echo $row->name;?>" data-productprice="<?php echo $row->price;?>" >Add Into Cart</button>
                            </div>
                        </div>
                    <?php endforeach;?>    
                </div>
                    
            </div>

            <!-- Shopping Cart interface -->
            <div class="col-md-4">
                <h4 style="color:#ffffff;">Shopping Cart:</h4>
                <table class="table">
                        <tr>
                            <th style="color:#ffffff;">items</th>
                            <th style="color:#ffffff;">price</th>
                            <th style="color:#ffffff;">qty</th>
                            <th style="color:#ffffff;">total</th>
                        </tr>
                   
                    <tbody id="detail_cart">
                    
                    </tbody>
                </table>
                <a href="<?php echo base_url(); ?>product/order" class="btn btn-primary btn-lg active" role="button">Checkout</a>
            </div>
        </div>
    </div>

<script>
    // .add_cart's javascript interaction
    $(document).ready(function(){
        $('.add_cart').click(function(){
            var id = $(this).data('productid');
            var name = $(this).data('productname');
            var price = $(this).data('productprice');
            var quantity = $('#' + id).val();
            $.ajax({
                url: "<?php echo site_url('product/add_to_cart');?>",
                method: "POST",
                data: {id:id,name:name,price:price,qty:quantity},
                success: function(data){
                    $('#detail_cart').html(data);
                }
            });    

        });

        // #detail_cart's javascript interaction
        $('#detail_cart').load("<?php echo site_url('product/load_cart');?>");
        
        // .remove_cart's javascript interaction
        $(document).on('click','.remove_cart',function(){
            var row_id=$(this).attr("id");
            $.ajax({
                url:"<?php echo site_url('product/delete_cart');?>",
                method:"POST",
                data:{row_id:row_id},
                success: function(data){
                    $('#detail_cart').html(data);
                }
            });
        });

    });
</script>
    
</body>
</html>