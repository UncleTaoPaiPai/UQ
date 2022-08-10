<div class="container">
    
    <div class="row">
    <!-- Shopping cart items -->
        <div class="col-md-3"></div>
        <?php
        foreach($pay as $data) {
        ?>
        <div class="col-md-3">
            
            <div class="thumbnail">
                <img src="<?= base_url() ?>assets/picture/<?= $data['image'] ?>" height="200" width="200" >
                <div class="caption">
                    <h3 style="color: white"><?php echo $data['name']?></h3>
                    <p style="color: white"><?php echo $data['description']?></p>
                    <p style="color: white">
                        <div style="color: white">AUD <?php echo $data['price']?></div>
                    </p>
                </div>
            </div>
        </div>
        <?php
        }
        ?>
        <div class="col-md-3"></div>
    </div>
    
</div>