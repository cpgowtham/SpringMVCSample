/**
 * 
 */

$(document).ready(function() {

		$('#SignIn').click(function() {
			$( "#loginForm" ).submit();
		});
		
		$('#SignUp').click(function() {
			userSignup();
		});
	
});

function userSignup() {
	
}

function userlogin() {
	var username=$('#name').val();
	var password=$('#pwd').val();
	var param = { "name" : username, "pwd" : password};
        $.ajax({
            url : "usercheck",
            type: "POST",
            contentType: "application/json",        
            data: JSON.stringify(param),
            success : function(data) {
            	var msg="";
            	if(data==1){
            		msg="you are logged in successfully";
            	}
            	else{
            		msg="Username or Password is invalid";
            	}
            	var url=decodeURIComponent("/resources/view/success.jsp?message="+msg);
            	window.location.href=url;
            	
            },
            error: function(data){
            	alert("error");
            }
        });
    }