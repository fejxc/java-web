var usernameObj;
var usernameMsgObj;

var passwordObj;
var passwordMsgObj;

var repasswordObj;
var repasswordMsgObj;

var emailObj;
var emailMsgObj;

var phoneObj;
var phoneMsgObj;

window.onload=function(){
	usernameObj = document.getElementById("usernameid");
	usernameMsgObj = document.getElementById("usernameMsg");
	
	passwordObj = document.getElementById("passwordid");
	passwordMsgObj = document.getElementById("passwordMsg");
	
	repasswordObj = document.getElementById("repasswordid");
	repasswordMsgObj = document.getElementById("repasswordMsg");
	
	emailObj = document.getElementById("emailid");
	emailMsgObj = document.getElementById("emailMsg")
	
	phoneObj = document.getElementById("phoneid");
	phoneMsgObj = document.getElementById("phoneMsg");
	
	
}
function checkusername(){
		
		var regex = /^[a-zA-Z_]\w{0,9}$/;	
		var value = usernameObj.value;
		var msg = "";						
		if (!value)							
			msg = "用户名不能为空";			
		else if (!regex.test(value))		
			msg = "用户名不符合要求";			
		usernameMsg.innerHTML = msg;		
		usernameObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";	
		return msg == "";				
}
function checkpassword(){
	var regex = /\w{8,16}$/;
	var value = passwordObj.value;
	var msg = "";
	if (!value)
		msg = "密码不能为空";
	else if (!regex.test(value))
		msg = "密码不符合要求";
	passwordMsg.innerHTML = msg;
	passwordObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
	
}
function recheckpassword() {		// 验证确认密码
	var passwordValue = passwordObj.value;
	var repasswordValue = repasswordObj.value;
	var msg = "";

    if(!repasswordValue){
	    msg = "确认密码必须填写";
	}
	else if (passwordValue != repasswordValue){
		msg = "密码必须保持一致";
    }
    repasswordMsg.innerHTML = msg;
    repasswordObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}
function checkemail(){
	
	var regex = /^[\w-]+@([\w-]+\.)+[a-zA-Z]{2,4}$/;
	var value = emailObj.value;
	var msg = "";
	if (!value)
		msg = "邮箱不能位空";
	else if (!regex.test(value))
		msg = "邮箱格式不符合";
	emailMsg.innerHTML = msg;
	emailObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
	
}
function checkphone(){
	var regex =/^[1][3,4,5,7,8][0-9]{9}$/;	
	var value = phoneObj.value;
	var msg = "";
	if (!value)
		msg = "手机不能为空";
	else if (!regex.test(value))
		msg = "手机号码格式错误";
	phoneMsg.innerHTML = msg;
	phoneObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}
function checkAll(){
	if(checkusername() & checkpassword() & recheckpassword() &checkphone() )
		return true; 
	else
		return false;
	
}

