<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/two/js/jquery-3.4.1.js"></script>
<title>照片上传</title>
<script type="text/javascript">
	$(function(){
		$("#tijiao").click(function(){
			alert("上传成功！")
		})
	})
</script>
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
</head>
<body>
	<div id="div1">
		<form action="UploadServlet" method="post" enctype="multipart/form-data">
			<table>
				<caption style="font-family: 微软雅黑; font-weight: bold; color: white;">照片上传</caption>
				<tr height="50px">
					<td><input type="file" name="picture2" id="file2" style="color: white;"/></td>
				</tr>
				<tr height="50px">
					<td><input type="file" name="picture3" id="file3" style="color: white;"/></td>
				</tr>
				<tr height="50px">
					<td><input type="file" name="picture3" id="file3" style="color: white;"/></td>
				</tr>
		
			</table>
			<table id="table2">
				<tr height="50px">
					<td><input type="submit" name="" id="tijiao" value="确认上传"
						style="width: 70px; background-color: #ffffff; border: none; font-size: 12px; font-weight: 500;" /></td>
				</tr>
				<tr>
					<td><a href="MainServlet" style="color: white;">返回主页面</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>