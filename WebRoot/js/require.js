// JavaScript Document
function display(){
	var tb=document.getElementById("tableT");
	$.ajax({
		cache: false,
		type: "POST",
		url:"/tv_Project/servlet/GetUserInfoServlet", 
		data:null, 
		error: function(request) {
			alert(request.val);
		},
		success: function(data) {
			//alert(data);
			var myobj = eval('(' + data + ')'); 
			var size=0;
			for (key in myobj.listInformation) {
				//if (obj.hasOwnProperty(key))
				var number=size+1;
				//  alert(myobj.listInformation[size].nickName);
				tb.innerHTML=tb.innerHTML+"<tr><th>"+number+"<input name=\"userID\" id=\"userID\" type=\"hidden\" value=\""+myobj.listInformation[size].userID+"\"></th>" +
				"<th>"+myobj.listInformation[size].nickName+"</th>" +
				"<th>"+myobj.listInformation[size].sex+"</th>" +
				"<th>"+myobj.listInformation[size].age+"</th>" +
				"<th>"+myobj.listInformation[size].mail+"</th>" +
				"<th>"+myobj.listInformation[size].address+"</th>" +
				"<th>"+myobj.listInformation[size].phone+"</th>" +
				"<th><a href=\"#\" class=\"glyphicon glyphicon-cog\" onclick=\"getVal("+
				myobj.listInformation[size].userID+",'"+myobj.listInformation[size].nickName+"','"+
				myobj.listInformation[size].sex+"','"+myobj.listInformation[size].age+"','"+
				myobj.listInformation[size].mail+"','"+myobj.listInformation[size].address+"','"+
				myobj.listInformation[size].phone+"');\" data-toggle=\"modal\" data-target=\"#myModal\" title=\"信息修改\"></a>&nbsp;&nbsp;" +
				"<a href=\"#\" class=\"glyphicon glyphicon-trash\" onclick=\"isdelete("+myobj.listInformation[size].userID+");\" title=\"信息删除\"></a></th></tr>";
				
				size++;
			}
			//alert(myobj.listInformation[0].nickName);
			//alert(myobj.listInformation[1].id);
		}
 
	});
}
function adminlogin(){
	var adminName=document.getElementById("adminName").value;
	var adminPass=document.getElementById("adminPass").value;
	$.ajax({
		cache: false,
		type: "GET",
		url:"/tv_Project/servlet/AdminLoginServlet", 
		data:"adminName="+adminName+"&adminPass="+adminPass, 
		error: function(request) {
			alert(request.val);
		},
		success: function(data) {
			//alert(data);
			if(data=="success"){
				top.location="usermessage.jsp";
			}
			else{
				alert('账号或则密码错误！');
			}
		}
 
	});
}
function change(){
	var userID=document.getElementById("hiddenID").value;
	var nickName=document.getElementById("nickName").value;
	var sex=document.getElementById("sex").value;
	var age=document.getElementById("age").value;
	var mail=document.getElementById("mail").value;
	var address=document.getElementById("address").value;
	var phone=document.getElementById("phone").value;
	$.ajax({
		cache: false,
		type: "GET",
		url:"/tv_Project/servlet/ModifyUserInfoServlet", 
		data:"userID="+userID+"&nickName="+nickName+"&sex="+sex+"&age="+age+"&mail="+mail+"&phone="+phone+"&address="+address, 
		error: function(request) {
			alert(request.val);
		},
		success: function(data) {
			//alert(data);
			if(data=="success"){
				alert('更改成功！');
				top.location="usermessage.jsp";
			}
			else{
				alert('更改信息失败！');
			}
		}
 
	});
}
function getVal(userID,nickName,sex,age,mail,address,phone){
	//var str = t.parentNode.getElementsByTagName("th")[1].innerHTML;
	document.getElementById("hiddenID").value=userID;
	document.getElementById("nickName").value=nickName;
	document.getElementById("sex").value=sex;
	document.getElementById("age").value=age;
	document.getElementById("mail").value=mail;
	document.getElementById("address").value=address;
	document.getElementById("phone").value=phone;
}

function isdelete(userID){
	//alert('ss');
	var isdelete=confirm("确认删除该用户？")
	if(isdelete==true){
		$.ajax({
			cache: false,
			type: "GET",
			url:"/tv_Project/servlet/DeleteUserInfoServlet", 
			data:"userID="+userID, 
			error: function(request) {
				alert(request.val);
			},
			success: function(data) {
				//alert(data);
				if(data=="success"){
					alert('删除成功！');
					top.location="usermessage.jsp";
				}
				else{
					alert('删除失败！');
				}
			}
		});
	}
}