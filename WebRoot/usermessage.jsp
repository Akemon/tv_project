<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>����</title>
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
				<a class="topwords" href="#">ý����Դ����</a>
			</div>
			<ul class="nav navbar-nav navbar-right nav-extend"> 
				<li><a href="#"><span class="glyphicon glyphicon-bell"></span><span class="badge">1</span></a></li><!--�¶�̬-->
				<!--<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> ��¼</a></li> -->
       		</ul>
       		<!--<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
				<button type="submit" class="btn btn-default">�ύ��ť</button>
        	</form> -->
			</div>
		</nav>
	</div>
	<div class="menu">
		<div>
			<ul>
				<li class="actives"><a><span class="glyphicon glyphicon-th-list"></span> �˵�</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-book"></span> ͳ��<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-hd-video"></span> Ӱ��<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
				<li class="actives"><a href="#"><span class="glyphicon glyphicon-user"></span> �û���Ϣ<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-tasks"></span> X X �༭<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-tasks"></span> X X ���<span class="glyphicon glyphicon-chevron-right rightFloat"></span></a></li>
			</ul>
		</div>
	</div>
	<div class="main">
		<div class="container-main">
			<p class="usertitle">�û���Ϣ</p>
			<table class="table table-hover table-bordered">
			<thead>
				<tr>
					<th>���</th>
					<th>����</th>
					<th>�Ա�</th>
					<th>����</th>
					<th>����</th>
					<th>��ַ</th>
					<th>�绰</th>
					<th>����</th>
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
					<a href="#" class="glyphicon glyphicon-cog" data-toggle="modal" data-target="#myModal" title="��Ϣ�޸�"></a>&nbsp;
					<a href="#" class="glyphicon glyphicon-trash" title="��Ϣɾ��"></a>
				</th>
			</tr>
			
			<!--������ʾ12����¼-->
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
			</div>--><!--��ҳ��ʾ-->
		</div>
	</div>
	<!-- ģ̬��Modal�� -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">�û���Ϣ�޸�</h4>
				</div>
				<div class="modal-body">��
					<div class="form-group">
					<label for="name">����</label>
    				<input type="text" class="form-control" id="name" placeholder="����������">
					</div>
   					<div class="form-group">
    				<label for="name">�Ա�</label>
    				<input type="text" class="form-control" id="name" placeholder="�������Ա�">
					</div>
   					<div class="form-group">
    				<label for="name">����</label>
    				<input type="text" class="form-control" id="name" placeholder="����������">
					</div>
   					<div class="form-group">
    				<label for="mail">����</label>
    				<input type="text" class="form-control" id="mail" placeholder="����������">
    				</div>
    				<div class="form-group">
    				<label for="city">��ַ</label>
    				<input type="text" class="form-control" id="city" placeholder="���������">
    				</div>
    				<div class="form-group">
    				<label for="phone">�绰</label>
    				<input type="text" class="form-control" id="phone" placeholder="������绰">
    				</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">�ر�</button>
					<button type="button" class="btn btn-primary">�ύ����</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>	
</div>
</body>
</html>
