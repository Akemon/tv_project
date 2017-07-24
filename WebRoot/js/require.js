// JavaScript Document
function display(){
	//alert('ss');
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
			//$value=data.split("\n");
			//$("#ajP").html(data); //将返回的结果显示到ajaxDiv中
			//alert($value[3]);
			//$("#newsPublic").html($value[0]);
			//$("#enterprise").html($value[1]);

		}
 
	});
}