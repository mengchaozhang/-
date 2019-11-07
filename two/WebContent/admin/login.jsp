<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理员登陆</title>
<link href="/two/css/bootstrap.min.css" rel="stylesheet">
<script src="/two/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="/two/js/jquery-3.4.1.js"></script>
<style type="text/css">
	#main{
		position: absolute;
		width: 400px;
		height: 300px;
		left:50%;
		top:40%;
		margin-left: -200px;
		margin-top: -100px;
	}
	</style>
</head>
<body>
<div id="main" class="panel panel-primary">
	<div class="panel-heading">
		<div class="panel-title">
			后台管理员登录
		</div>
	</div>
	<div class="panel-body">
		<form action="AdminLoginServlet" method="post">
			<div class="form-group">
				<label>用户名:</label>
				<input type="text" name="aname" id="" class="form-control" placeholder="请输入用户名"/>
			</div>
			<div class="form-group">
				<label>密码:</label>
				<input type="password" name="apassword" id="password" class="form-control" placeholder="请输入密码"/>
			</div>
			<div class="form-group" style="text-align: center;">
				<input type="submit" value="登录" class="btn btn-primary">
				<input type="reset" value="重置" class="btn btn-default">
			</div>
		</form>
	</div>
</div>
</body>
</html>