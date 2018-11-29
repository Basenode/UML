<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>导员审核评测</title>
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
        <li class=""> <a href="<%=request.getContextPath()%>/Instructor/CheckEvaluate" class="afinve"><center>审核评测</center></a> </li>
        <li class=""> <a href="PWChange.jsp" class="afinve"><center>修改密码</center></a> </li>
        </ul>
        </div>
      </div>
      <div class="show">
              请审核下列评测：
        <table class="fl-table">
        <tr>
        	<th>序号</th>
			<th>反馈内容</th>
			<th>学生号</th>
			<th>教师号</th>
			<th>反馈时间</th>
			<th colspan="2">是否通过</th>
		</tr>
		<c:forEach var="f" items="${feedBacks}">
		<tr>
        	<td>${f.fid}</td>
        	<td>${f.fcontent}</td>
        	<td>${f.sno}</td>
        	<td>${f.tno}</td>
        	<td>${f.ftime}</td>
        	<td><input type="button" value="通过"
					onclick="location.href='./submitEvaluate?chuanpass=2&chuanfid=${f.fid}'"/></input>
        	</td>
        	<td><input type="button" value="不通过"
					onclick="location.href='./submitEvaluate?chuanpass=1&chuanfid=${f.fid}'"/></input>
        	</td>
        </tr>
        </c:forEach>
        </table>
      </div>
    </div>
  <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
  <script src="../js/jquery.slimscroll.min.js"></script>
  </body>
</html>
