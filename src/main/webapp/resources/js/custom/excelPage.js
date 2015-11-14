$(document).ready(function () {
    $('#js-get-excel').on('click', function () {
        var user_id = $('#js-user-id').val();
        var begin_date = $('#js-begin_date').val();
        var end_date = $('#js-end_date').val();
        $.ajax({
            type: "POST",
            url: "/excel/" + user_id + "_" + begin_date + "_" + end_date,
            success: function (msg) {
                console.log('ok');
            }
        });
    });
});