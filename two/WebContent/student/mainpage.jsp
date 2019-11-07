<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品列表页</title>
<link href="/two/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/two/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			state = $("#state").val();
			window.location.href="MainServlet?state="+state;
		})
		/* $("#btn").click(function(){
			alert(12);
			var purl = $(this).attr("purl");
			$.get("DownServlet?filename="+purl,"json")
		}) */
		/* $("#search").click(function(){
			var username = $("#name").val();
			var ostate = $("#ostate").val();
			window.location.href="SysUserViewOrderServlet?username="+username+"&ostate="+ostate;
		}) */
	})
</script>
</head>
<body>
	<div class="panel panel-default" style="margin: 0 auto;width: 95%;">
		<div class="panel-heading">
		   	<button onclick="window.location.href='upload.jsp'">上传照片</button>
		    <select id="state">
		    	<option value="2">所有审核通过的照片</option>
		    	<option value="5">本人审核通过照片</option>
		    	<option value="1">本人未审核照片</option>
		    	<option value="3">本人审核拒绝照片</option>
		    </select>
		    <button id="btn">刷新</button>
		</div>
		<div class="panel-heading">
		    <h3 class="panel-title"><span class="glyphicon glyphicon-th-list"></span>&nbsp;&nbsp;照片列表</h3>
		</div>
		<div class="panel-body">
			<div class="row" style="margin: 0 auto;">
				<c:forEach items="${pictureList }" var="picture">
			    	<div class="col-sm-3">
					    <div class="thumbnail">
					   		<img src="/two/img/${picture.purl }" width="180" height="180"  alt="小米6" />
						    <div class="caption">
						        <p>上传者：${picture.sname }</p>
						        <%-- <p><button id="btn" purl="${picture.purl }">下载</button></p> --%>
						        <p><a href="DownServlet?filename=${picture.purl }">下载</a></p>
					            <p style="color:orange">上传时间：${picture.uploadTime }</p>
						    </div>
					    </div>
					</div>
				</c:forEach>
			</div>
	   	</div>
	</div>
</body>
</html>