$(document).ready(function () {
    $("#home").click(function () {
        $.ajax({
            url: 'user/home',
            type: 'GET',
            dataType: 'html',
            success: function (response) {
                $("title").text("home");
                $("#home").parent("li").addClass("active");
                $("#provider").parent("li").removeClass("active");
                $("#statistics").parent("li").removeClass("active");
                $("#clients").parent("li").removeClass("active");
                $("#content").html(response);
                $.getScript("/resources/js/custom/home.js");
            }
        });
    });

    $("#provider").click(function () {
        $.ajax({
            url: 'user/providers/get',
            type: 'GET',
            dataType: 'html',
            success: function (response) {
                $("title").text("home");
                $("#provider").parent("li").addClass("active");
                $("#home").parent("li").removeClass("active");
                $("#statistics").parent("li").removeClass("active");
                $("#clients").parent("li").removeClass("active");
                $("#content").html(response);
                $.getScript("/resources/js/custom/provider.js");
            }
        });
    });

    $("#clients").click(function () {
        $.ajax({
            url: 'user/clients/get',
            type: 'GET',
            dataType: 'html',
            success: function (response) {
                $("title").text("home");
                $("#clients").parent("li").addClass("active");
                $("#home").parent("li").removeClass("active");
                $("#statistics").parent("li").removeClass("active");
                $("#provider").parent("li").removeClass("active");
                $("#content").html(response);
                $.getScript("/resources/js/custom/clients.js");
            }
        });
    });

    /*
    $("#statistics").click(function () {
        $.ajax({
            url: 'user/providers/get',
            type: 'GET',
            dataType: 'html',
            success: function (response) {
                $("title").text("home");
                $("#provider").parent("li").addClass("active");
                $("#home").parent("li").removeClass("active");
                $("#statistics").parent("li").removeClass("active");
                $("#clients").parent("li").removeClass("active");
                $("#content").html(response);
                $.getScript("/resources/js/custom/provider.js");
            }
        });
    });
    */
});
