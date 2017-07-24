
jQuery(document).ready(function() {

    $('.page-container form').submit(function(){
        var username = $(this).find('.username').val();
        var password = $(this).find('.password').val();
		var repassword = $(this).find('.repassword').val();
		var email = $(this).find('.email').val();
		var answer = $(this).find('.answer').val();
		var verify=$(this).find('.verify').val();
        if(username == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '27px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.username').focus();
            });
            return false;
        }
        if(password == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '96px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.password').focus();
            });
            return false;
        }
		if(repassword == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '165px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.repassword').focus();
            });
            return false;
        }
		if(email == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '234px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.email').focus();
            });
            return false;
        }
		if(answer == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '369px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.email').focus();
            });
            return false;
        }
		if(verify == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '234px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.verify').focus();
            });
            return false;
        }
		
    });

    $('.page-container form .username, .page-container form .password, .page-container form .repassword, .page-container form .email').keyup(function(){
        $(this).parent().find('.error').fadeOut('fast');
    });

});


function over(){
document.getElementById("admin").style.innerHTML="";
}
function out(){
document.getElementById("admin").style.innerHTML="管理员";
}

