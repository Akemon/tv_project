<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>欣创</title>
<link href="css/bootstrap-responsive.css" rel="stylesheet" />
<link href="css/bootstrap-responsive.min.css" rel="stylesheet" />
<link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link href="css/tv-style.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
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
			<tbody class="table-a">
			<tr>
				<th>1</th>
				<th>ss</th>
				<th>ss</th>
				<th>ss</th>
				<th>ss</th>
				<th>ss</th>
				<th>ss</th>
				<th>
					<a href="#" class="glyphicon glyphicon-cog" data-toggle="modal" data-target="#myModal" title="信息修改"></a>&nbsp;
					<a href="#" class="glyphicon glyphicon-trash" title="信息删除"></a>
				</th>
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
				<div class="modal-body">、
					<div class="form-group">
					<label for="name">名称</label>
    				<input type="text" class="form-control" id="name" placeholder="请输入名称">
					</div>
   					<div class="form-group">
    				<label for="name">性别</label>
    				<input type="text" class="form-control" id="name" placeholder="请输入性别">
					</div>
   					<div class="form-group">
    				<label for="name">年龄</label>
    				<input type="text" class="form-control" id="name" placeholder="请输入年龄">
					</div>
   					<div class="form-group">
    				<label for="mail">邮箱</label>
    				<input type="text" class="form-control" id="mail" placeholder="请输入邮箱">
    				</div>
    				<div class="form-group">
    				<label for="city">地址</label>
    				<input type="text" class="form-control" id="city" placeholder="请输入城市">
    				</div>
    				<div class="form-group">
    				<label for="phone">电话</label>
    				<input type="text" class="form-control" id="phone" placeholder="请输入电话">
    				</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary">提交更改</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>	
</div>
</body>
</html>
