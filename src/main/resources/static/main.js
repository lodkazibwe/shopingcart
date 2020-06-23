
$("document").ready(function(){
    var arry=[];

    $(".table #edit_btn").on("click",function(event){
        event.preventDefault();

        var href=$(this).attr("href");

        $.get(href, function(Product, status){
            $("#p_id").val(Product.id);
            $("#p_name").val(Product.name);
            $("#unitPrice").val(Product.unitPrice);
            $("#quantty").val(Product.quantity);

        });
        $("#updateModal").modal();
    });

    $(".table #del_btn").on("click",function(event){
        event.preventDefault();
        var href=$(this).attr("href");
        $("#deleteModal #del_ref").attr("href",href);
        $("#deleteModal").modal();
    });


    $(".table #cart_btn").on("click",function(event){
        event.preventDefault();

        var href=$(this).attr("href");

        $.get(href, function(Product){

            //
            if(jQuery.inArray(Product.id,arry) == -1){
                var index=$('#orderDetails tbody tr').length;
                console.log(index);
                var content = '';
                content +='<tr>';
                content += '<td><input type="text" class="form-control"  name="orderdetails['+index+'].product.id" value="'+Product.id+'" readonly></td>';
                content += '<td><input type="text" class="form-control"   name="orderdetails['+index+'].product.name" value="'+Product.name+'" readonly></td>';
                content += '<td><input type="text" class="form-control"  name="orderdetails['+index+'].quantity" value="1" ></td>';
                content += '<td><input type="text" class="form-control"  name="orderdetails['+index+'].amount" value="'+Product.unitPrice+'" readonly></td>';
                content += '</tr>';

                $('#orderDetails tbody').append(content);
                arry.push(Product.id);
            };






        });

        });


});



