<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>照片审核页面</title>
<link href="/two/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/two/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function(){
		$(".btn").click(function(){
			var pid = $(this).attr("pid");
			var state = $(this).attr("state");
			$.post("ExaminePageServlet", {pid:pid, state:state}, function(data){
				var i = data.resp;
				if(state == 2){
					$("#btn"+pid).remove();
					$("#btnn"+pid).remove();
					$("#pass"+pid).html("审核通过！")
				} else {
					$("#btn"+pid).remove();
					$("#btnn"+pid).remove();
					$("#unpass"+pid).html("审核未通过！")
				}
			}, "json")
		})
	})
</script>
</head>
<body>
	<div class="panel panel-default" style="margin: 0 auto;width: 95%;">
		<div class="panel-heading">
		    <h3 class="panel-title"><span class="glyphicon glyphicon-th-list"></span>&nbsp;&nbsp;待审核照片</h3>
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
						        <p><button id="btn${picture.pid }" class="btn" pid="${picture.pid }" state="2">通过审核</button><span id="pass${picture.pid }"></span></p>
						        <p><button id="btnn${picture.pid }" class="btn" pid="${picture.pid }" state="3">拒绝</button><span id="unpass${picture.pid }"></span></p>
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