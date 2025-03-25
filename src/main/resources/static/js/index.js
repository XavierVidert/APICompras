$("#data").on('change', function() {
    let data = $(this).val();
    $.ajax({
        url: "/",
        method: "POST",
        data: {
            data: data
        },
        success: function(resposta) {
            $(".dados").html(resposta);
        },
        error: function() {
            alert("Deu Ruim!");
        }
    });
});
