<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/two/js/jquery-3.4.1.js"></script>
<title>用户注册</title>
<style type="text/css">
* {
	margin: 0rem;
	padding: 0rem;
	color: #676464;
}

#div1 {
	height: 556.2px;
	width: 100%;
	background-color: #12548F;
}

table {
	position: relative;
	top: 95.53px;
	margin: 0px auto;
}

#table2 {
	width: 245px;
	text-align: center;
}
</style>
<script type="text/javascript">
	$(function(){
		$("#tijiao").click(function(){
			var sname = $("#sname").val();
			var spassword = $("#spassword").val();
			var spassword2 = $("#spassword2").val();
			$.post("StudentRegisterServlet", {sname:sname, spassword:spassword, spassword2:spassword2}, function(data){
				var i = data.resp;
				if(i == 1){
					alert("注册成功！")
					window.location.href="login.html"
				} else if (i == -1) {
					alert("用户名已存在！")
				} else if (i == -2) {
					alert("密码不一致！")
				}
			}, "json")
		})
		/* $("#search").click(function(){
			var username = $("#name").val();
			var ostate = $("#ostate").val();
			window.location.href="SysUserViewOrderServlet?username="+username+"&ostate="+ostate;
		}) */
	})
</script>
</head>
<body>
	<div id="div1">
			<table>
				<caption style="font-family: 微软雅黑; font-weight: bold; color: white;">用户注册</caption>
				<tr height="50px">
					<td width="100px"
						style="font-family: 宋体; font-size: 14px; color: white; font-weight: bold;">用户名</td>
					<td><input type="text" name="sname" id="sname" value="" /></td>
				</tr>
				<tr>
					<td
						style="font-family: 宋体; font-size: 14px; color: white; font-weight: bold;">密码</td>
					<td><input type="password" name="spassword" id="spassword"/></td>
				</tr>
				<tr>
					<td
						style="font-family: 宋体; font-size: 14px; color: white; font-weight: bold;">确认密码</td>
					<td><input type="password" name="spassword2" id="spassword2"/></td>
				</tr>
	
			</table>
			<table id="table2">
				<tr height="70px">
					<td><input type="submit" name="" id="tijiao" value="注册"
						style="width: 70px; background-color: #ffffff; border: none; font-size: 12px; font-weight: 500;" /></td>
				</tr>
			</table>
	</div>
</body>
</html>