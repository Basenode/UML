<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
</head>
<link rel="stylesheet" type="text/css"
	href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/navMenu.css" />
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/page.css" />

<body>
	<div>
		<div class="top">
			<center>
				<font size="+3" ; color="#ffffff">软件学院学生评教系统</font>
			</center>
		</div>
		<div class="navMenubox">
			<div id="slimtest1">
				<ul class="navMenu">
					<li class=""><a
						href="<%=request.getContextPath()%>/Teacher/lookup" class="afinve"><center>查看评测</center></a>
					</li>
					<li class=""><a href="ShowInfo.jsp" class="afinve"><center>个人信息</center></a>
					</li>
					<li class=""><a href="PWChange.jsp" class="afinve"><center>修改密码</center></a>
					</li>
					<li class=""><a href="Upload.jsp" class="afinve"><center>上传文件</center></a>
					</li>
				</ul>
			</div>
		</div>
		<div class="show"></div>
	</div>
	<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.slimscroll.min.js"></script>
</body>
</html>
