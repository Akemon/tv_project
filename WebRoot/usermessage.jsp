<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>coocaa</title>
<link href="css/bootstrap-responsive.css" rel="stylesheet" />
<link href="css/bootstrap-responsive.min.css" rel="stylesheet" />
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link href="css/tv-style.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/require.js"></script>
<script type="text/javascript"> 
window.onload=function(){
	display();
} 
</script> 
</head>
  
<body>
	<div>
	<div>
		<nav class="navbar-inverse" role="navigation">
			<div class="container-fluid">
			<div class="navbar-header toplist">
				<a class="topwords" href="#">媒体资源管理</a>
			</div>
			<ul class="nav navbar-nav navbar-right nav-extend"> 
				<li><a href="#"><span class="glyphicon glyphicon-bell"></span><span class="badge">1</span></a></li><!--新动态-->
				<!--<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li> -->
       		</ul>
       		<!--<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
				<button type="submit" class="btn btn-default">提交按钮</button>
        	</form> -->
			</div>
		</nav>
	</div>
	<div class="menu">
		<div>
			<ul>
				<li class="actives"><a><span class="glyphicon glyphicon-th-list"></span> 菜单</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-book"></span> 统计<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-hd-video"></span> 影视<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
				<li class="actives"><a href="#"><span class="glyphicon glyphicon-user"></span> 用户信息<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-tasks"></span> X X 编辑<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-tasks"></span> X X 申核<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
			</ul>
		</div>
	</div>
	<div class="fixcon"></div>
	<div class="main">
		<div class="container-main">
			<p class="usertitle">用户信息</p>
			<table class="table table-hover table-bordered">
			<thead>
				<tr>
					<th>编号</th>
					<th>名称</th>
					<th>性别</th>
					<th>年龄</th>
					<th>邮箱</th>
					<th>地址</th>
					<th>电话</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody class="table-a" id="tableT">
			<tr>
				<!-- <th>1<input type="hidden" value="1"></th>
				<th>huyujian</th>
				<th>男</th>
				<th>18</th>
				<th>225@qq.com</th>
				<th>szpt</th>
				<th>12345678978</th>
				<th>
					<a href="#" class="glyphicon glyphicon-cog" data-toggle="modal" data-target="#myModal" title="信息修改"></a>&nbsp;
					<a href="#" class="glyphicon glyphicon-trash" title="信息删除"></a>
				</th> -->
			</tr>
			
			<!--极限显示12条记录-->
			</tbody>
			</table>
			<!--<div style="text-align: center">
				<ul class="pagination">
					<li><a href="#">&laquo;</a></li>
					<li class="active"><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">&raquo;</a></li>
				</ul>
			</div>--><!--分页显示-->
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">用户信息修改</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="nickName">名称</label>
	    				<input type="text" class="form-control" id="nickName" name="nickName" placeholder="请输入名称">
					</div>
   					<div class="form-group">
	    				<label for="sex">性别</label>
	    				<input type="text" class="form-control" id="sex" name="sex" placeholder="请输入性别">
					</div>
   					<div class="form-group">
	    				<label for="age">年龄</label>
	    				<input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄">
					</div>
   					<div class="form-group">
	    				<label for="mail">邮箱</label>
	    				<input type="text" class="form-control" id="mail" name="mail" placeholder="请输入邮箱">
    				</div>
    				<div class="form-group">
	    				<label for="address">地址</label>
	    				<input type="text" class="form-control" id="address" name="address" placeholder="请输入城市">
    				</div>
    				<div class="form-group">
	    				<label for="phone">电话</label>
	    				<input type="text" class="form-control" id="phone" name="phone" placeholder="请输入电话">
	    				<input type="hidden" name="hiddenID" id="hiddenID">
    				</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<a type="button" class="btn btn-primary" onclick="change();">提交更改</a>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>	
</div>
</body>
</html>
