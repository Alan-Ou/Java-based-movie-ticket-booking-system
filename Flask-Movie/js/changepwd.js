$(function () {
    $("#change").click(function (event){
        event.preventDefault();
        var old = $("input[name=oldpwd]");
        var newpwdE = $("input[name=newpwd]");
        var confirm = $("input[name=confirmpwd]");
        var oldpwd = old.val();
        var newpwd = newpwdE.val();
        var confirmpwd = confirm.val();
        myajax.post({
            'url': '/back/changepwd/',
            'data': {
                'oldpwd': oldpwd,
                'newpwd': newpwd,
                'confirmpwd': confirmpwd
            },
            'success': function (data) {
                if(data['code'] == 200){
                    myalert.alertSuccessToast("Password modified successfully！");
                    old.val("");
                    newpwdE.val("");
                    confirm.val("");
                }else{
                    var message = data['message'];
                    myalert.alertInfo(message);
                }
            },
            'fail': function (error) {
                myalert.alertNetworkError();
            }
        });
    });


});