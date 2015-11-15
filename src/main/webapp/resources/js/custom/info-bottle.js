$(document).ready(function updateWater() {

    var userId = $('input').val();

    setInterval(query, 5000);

    function query() {
        $.ajax({
            url: "bottles/getAll",
            type: "GET",
            dataType: "html",
            data: {
                userId: userId
            },
            success: function (data) {
                $("#js-bottles").html(data);
            }
        })
    }
});
