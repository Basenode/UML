<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>首页</title>
  </head>
  <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
  <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/navMenu.css" />
  <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/page.css" />
  
  <body>
    <div>
      <div class="top"><center><font size="+3"; color="#ffffff">软件学院学生评教系统</font></center>
      </div>
      <div class="navMenubox">
        <div id="slimtest1">
        <ul class="navMenu">
        <li class=""> <a href="<%=request.getContextPath()%>/admin/index.jsp" class="afinve"><center>首页</center></a> </li>
        <li class=""> <a href="<%=request.getContextPath()%>/admin/ReviewFeedback" class="afinve"><center>审核评测</center></a> </li>
        <li class=""> <a href="<%=request.getContextPath()%>/admin/ReviewInfo.jsp" class="afinve"><center>审核信息</center></a> </li>
        <li class=""> <a href="<%=request.getContextPath()%>/admin/ImportInfo.jsp" class="afinve"><center>导入信息</center></a> </li>
        <li class=""> <a href="<%=request.getContextPath()%>/admin/PWChange.jsp" class="afinve"><center>修改密码</center></a> </li>
        </ul>
      </div>
      </div>
      <div class="show">
    	<table class="fl-table">
    	  <tr>
        	<th>序号</th>
			<th>反馈内容</th>
			<th>学生号</th>
			<th>教师号</th>
			<th>反馈时间</th>
			<th colspan="2">是否通过</th>
		  </tr>
    		<c:forEach var="rfdk" items="${feedBacks}">
    			<tr>
    				<td>${rfdk.fid}</td>
    				<td>${rfdk.fcontent}</td>
    				<td>${rfdk.sno}</td>
    				<td>${rfdk.tno}</td>
    				<td>${rfdk.ftime}</td>
    				<td><input type="button" value="通过" onclick="location.href='./submitFeedback?pass=2&intno=${rfdk.fid}'"></td>
    				<td><input type="button" value="不通过" onclick="location.href='./submitFeedback?pass=1&intno=${rfdk.fid}'"/></td>
    			</tr>
    		</c:forEach>
    	</table>
    </div>
    </div>
  <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
  <script src="../js/jquery.slimscroll.min.js"></script>
  </body>
</html>