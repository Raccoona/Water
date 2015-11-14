$('#dark-bg').fadeOut();
$("#megaSuperMenMaximAndreyLysiAidarSashaIDR").on('click', function () {
    $('#dark-bg').fadeIn();
    $('#content-body').fadeIn();

    $('#content-body').animate({
        'left': '45%',
        'opacity': '1'
    }, 500);

    $('#content-body').animate({
        'left': '52%'
    }, 500)

    $('#content-body').animate({
        'left': '50%'
    }, 500)
});
$('#dark-bg').on('click', function () {

    $('#dark-bg').fadeOut();
    $('#content-body').animate({
        'left': '200%'
    }, 500);
    $('#content-body').css({
        'left': '50%',
        'opacity': '0.5'
    });
    $('#content-body').fadeOut();
});
