function doAjaxShowUserHomePage() {
    $.ajax({
        url: 'home',
        type: 'GET',
        dataType: 'html',
        success: function (response) {
            $("title").text("home");
            $("#showU").parent("li").addClass("active");
            $("#showF").parent("li").removeClass("active");
            $("#showOU").parent("li").removeClass("active");
            $("#content").html(response);
            $.getScript("/resources/myJs/home.js");
        }
    });
}

function doAjaxShowFriends() {
    $.ajax({
        url: 'friends',
        type: 'GET',
        dataType: 'html',
        success: function (response) {
            $("title").text("friends");
            $("#showF").parent("li").addClass("active");
            $("#showU").parent("li").removeClass("active");
            $("#showOU").parent("li").removeClass("active");
            $("#content").html(response);
            $.getScript("/resources/myJs/friends.js");
        }
    });
}

function doAjaxShowOtherUsers() {
    $.ajax({
        url: 'users',
        type: 'GET',
        dataType: 'html',
        success: function (response) {
            $("title").text("users");
            $("#showOU").parent("li").addClass("active");
            $("#showF").parent("li").removeClass("active");
            $("#showU").parent("li").removeClass("active");
            $("#content").html(response);
            $.getScript("/resources/myJs/otherUsers.js");
        }
    });
}
