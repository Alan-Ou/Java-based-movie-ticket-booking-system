

$(function () {
    $('.nav-sidebar>li>a').click(function (event) {
        var that = $(this);
        if(that.children('a').attr('href') == '#'){
            event.preventDefault();
        }
        if(that.parent().hasClass('unfold')){
            that.parent().removeClass('unfold');
        }else{
            that.parent().addClass('unfold').siblings().removeClass('unfold');
        }
        console.log('coming....');
    });

    $('.nav-sidebar a').mouseleave(function () {
        $(this).css('text-decoration','none');
    });
});


$(function () {
    var url = window.location.href;
    if(url.indexOf('info') >= 0){
        var profileLi = $('.profile-li');
        profileLi.addClass('unfold').siblings().removeClass('unfold');
        profileLi.children('.subnav').children().eq(0).addClass('active').siblings().removeClass('active');
    } else if(url.indexOf('changepwd') >= 0){
        var profileLi = $('.profile-li');
        profileLi.addClass('unfold').siblings().removeClass('unfold');
        profileLi.children('.subnav').children().eq(1).addClass('active').siblings().removeClass('active');
    } else if(url.indexOf('posts') >= 0){
        var postManageLi = $('.post-manage');
        postManageLi.addClass('unfold').siblings().removeClass('unfold');
    }else if(url.indexOf('block') >= 0){
        var boardManageLi = $('.board-manage');
        boardManageLi.addClass('unfold').siblings().removeClass('unfold');
    }else if(url.indexOf('users') >= 0){
        var userManageLi = $('.user-manage');
        userManageLi.addClass('unfold').siblings().removeClass('unfold');
    }else if(url.indexOf('comments') >= 0) {
        var commentsManageLi = $('.comments-manage');
        commentsManageLi.addClass('unfold').siblings().removeClass('unfold');
    }
});