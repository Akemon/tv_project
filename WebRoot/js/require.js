// JavaScript Document
function display(){
	//alert('ss');
	$.ajax({

		cache: false,

		type: "GET",

		url:"/tv_Project/servlet/UserInfoServlet", 

		data:null, 
		
		//dataType: "JSON", 
		
		error: function(request) {

			alert(request.val);
			alert('haha');
		},
		
		success: function(data) {
			//alert('ss');
			alert(data);
			
			
			//$value=data.split("\n");

			//$("#ajP").html(data); //将返回的结果显示到ajaxDiv中
			//alert($value[3]);
			//$("#newsPublic").html($value[0]);
			//$("#enterprise").html($value[1]);

		}
 
	});
}