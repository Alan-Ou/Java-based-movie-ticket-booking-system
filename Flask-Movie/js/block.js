$(function () {
    $("#addblock").click(function (event) {
        event.preventDefault();
        myalert.alertOneInput({
            'text':'Please enter movie name',
            'placeholder': 'movie name',
            'confirmCallback': function (inputValue) {
                myajax.post({
                    'url': '/back/addmovie/',
                    'data': {
                        'name': inputValue
                    },
                    'success': function (data) {
                        if(data['code'] == 200){
                            window.location.reload();
                        }else{
                            myalert.alertInfo(data['message']);
                        }
                    }
                });
            }
        });
    });
});

$(function () {
    $(".edit-board-btn").click(function () {
        var self = $(this);
        var tr = self.parent().parent();
        var name = tr.attr('data-name');
        var block_id = tr.attr("data-id");

        myalert.alertOneInput({
            'text': 'Please enter new movie name !',
            'placeholder': name,
            'confirmCallback': function (inputValue) {
                myajax.post({
                    'url': '/back/edit/',
                    'data': {
                        'movie_id': movie_id,
                        'name': inputValue
                    },
                    'success': function (data) {
                        if(data['code'] == 200){
                            window.location.reload();
                        }else{
                            myalert.alertInfo(data['message']);
                        }
                    }
                });
            }
        });
    });
});