<!-- Search page  -->
<div class="container">

    <?php echo validation_errors(); ?>
    <?php echo form_open('Search/showajax'); ?>
   
    <div class="col-md-12 col-md-offset-12 centered">
        
        <h1 class="text-center" style="color: #FFFFFF;">Search</h1>
        <!-- search box -->
        <input type="text" name="search" id="search_text" placeholder="Search" class="form-control" /><br>
        <div class="row">
            <div class="col-md-1">
		    </div>
            <div class="col-md-10">
            </div>
            <!-- delete box -->
            <div class="col-md-1">
                <a href="<?php echo base_url(); ?>Delete/index" class="btn btn-danger btn-sm active" role="button">delete</a>
		    </div>
        </div>

        <!-- search result box  -->
        <div class="col-md-12 centered" id="result">
            <h3></h3>
            <div class="main">
            </div>
        </div>
    </div>
</div>

<script>
    
    $(document).ready(function() {
        // call search function
        load_data();

        // Search function
        function load_data(query) {
            $.ajax({
                url: "<?php echo base_url(); ?>Search/fetch",
                method: "POST",
                data: {
                    'query': query
                },
                success: function(response) {
                    $('#result').html("");
                    if (response == "No Data Found") {
                        $('#result').html(response);
                    } else {
                        var obj = JSON.parse(response);
                        if (obj.length > 0) {
                            var items = [];
                            $.each(obj, function(i, val) {
                                var name = val.video_name;
                                var songs = "<a href=<?php echo base_url(); ?>Video/find_video/";
                                var h = songs.concat(name);
                                var s = h.concat(">");
                                items.push($("</br>"));
                                items.push($(s).text(val.video_name).add());
                                items.push($("<div style='font-size: 25px;  color: #ffffff;' >").addClass("main").text(val.name));
                                items.push($("<div style='font-size: 25px;  color: #ffffff;' >").addClass("main").text(val.language));
                            });
                            $('#result').append.apply($('#result'), items);
                        } else {
                            $('#result').html(response);
                        };
                    };
                }
            });
        }
        $('#search_text').keyup(function() {
            var search = $(this).val();
            if (search != '') {
                load_data(search);
            } else {
                load_data();
            }
        });
    });
</script>

</body>
</html>