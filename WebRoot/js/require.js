// JavaScript Document
function display(){
	//alert('ss');
	var tb=document.getElementById("tableT");
	tb.innerHTML=tb.innerHTML+"<tr><th>1<input type=\"hidden\" value=\"1\"></th><th>haha</th><th>ss</th><th>ss</th><th>ss</th><th>ss</th><th>ss</th><th><a href=\"#\" class=\"glyphicon glyphicon-cog\" data-toggle=\"modal\" data-target=\"#myModal\" title=\"信息修改\"></a>&nbsp;<a href=\"#\" class=\"glyphicon glyphicon-trash\" title=\"信息删除\"></a></th></tr>";
	//tb.innerHTML=tb.innerHTML+"<tr><th>1<input type=\"hidden\" value=\"1\"></th><th>haha</th><th>ss</th><th>ss</th><th>ss</th><th>ss</th><th>ss</th><th><a href=\"#\" class=\"glyphicon glyphicon-cog\" data-toggle=\"modal\" data-target=\"#myModal\" title=\"信息修改\"></a>&nbsp;<a href=\"#\" class=\"glyphicon glyphicon-trash\" title=\"信息删除\"></a></th></tr>";
	$.ajax({

		cache: false,

		type: "GET",

		url:"/tv_Project/servlet/GetUserInfoServlet", 

		data:null, 
		
		//dataType: "JSON", 
		
		error: function(request) {

			alert(request.val);
		},
		
		success: function(data) {
			alert(data);
			//var t=eval(data);
			//alert(t.data[0].id);
			var myobj = eval('(' + data + ')'); 
			alert(myobj.listInformation[0].id);
		}
 
	});
}