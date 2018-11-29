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
    <jsp:useBean id="colteacherinfo" scope="request" class="com.hfut.uml.domain.Colteacherinfo" />
    <jsp:useBean id="outteacherinfo" scope="request" class="com.hfut.uml.domain.Outteacherinfo" />
    <jsp:useBean id="schteacherinfo" scope="request" class="com.hfut.uml.domain.Schteacherinfo" />
    
    <c:set var="reviewed">
    	<font color="green">已审核</font>
    </c:set>
    <c:set var="noreview">
    	<font color="red">未审核</font>
    </c:set>
    
    <form:form action="./submitSchteacherinfo"  modelAttribute="schteacherinfo">
    	<tr>
    		<td>Schteacherinfo</td>
    		<td><a href='./submitSchteacherinfo'>加载</a></td>
    	</tr>
    	<br/>
    	<c:forEach var="schteacherinfo" items="${schteacherinfoList}">
    		<tr>
    			<td>${schteacherinfo.intno}</td>
    			<td>${schteacherinfo.name}</td>
    			<td>${schteacherinfo.type}</td>
    			<td>${schteacherinfo.college}</td>
    			<td>${schteacherinfo.teacourse}</td>
    			<td>${schteacherinfo.title}</td>
    			<td>${schteacherinfo.degree}</td>
    			<td>${schteacherinfo.age}</td>
    			<td>${schteacherinfo.graduatesch}</td>
    			<td>${schteacherinfo.overseaxp}</td>
    			<td>${schteacherinfo.engineerbg}</td>
    			<td>${schteacherinfo.manageitem}</td>
    			<td>${schteacherinfo.scientficpa}</td>
    			<td>${schteacherinfo.patent}</td>
    			<td>${schteacherinfo.softbook}</td>
    			<td>${schteacherinfo.monograph}</td>
    			<td>${schteacherinfo.teapaper}</td>
    			<td>${schteacherinfo.sciresearch}</td>
    			<td>${schteacherinfo.teaethichon}</td>
    			<td>${schteacherinfo.cooperesult}</td>
    			<td>${schteacherinfo.review==0?noreview:reviewed}</td>
    			<td><input type="button" value="通过" onclick="location.href='./submitSchteacherinfo?pass=1;intno=${schteacherinfo.intno}'"></td>
    			<td><input type="button" value="不通过" onclick="location.href='./submitSchteacherinfo?pass=0;intno=${schteacherinfo.intno}'"/></td>
    		</tr>
    	</c:forEach>
    </form:form>
    
    <form:form action="./submitOutteacherinfo"  modelAttribute="outteacherinfo">
    	<tr>
    		<td>Outteacherinfo</td>
    		<td><a href='./submitOutteacherinfo'>加载</a></td>
    	</tr>
    	<br/>
    	<c:forEach var="outteacherinfo" items="${outteacherinfoList}">
    		<tr>
    			<td>${outteacherinfo.outtno}</td>
    			<td>${outteacherinfo.name}</td>
    			<td>${outteacherinfo.type}</td>
    			<td>${outteacherinfo.workteam}</td>
    			<td>${outteacherinfo.job}</td>
    			<td>${outteacherinfo.degree}</td>
    			<td>${outteacherinfo.workyear}</td>
    			<td>${outteacherinfo.graduatesch}</td>
    			<td>${outteacherinfo.teacourse}</td>
    			<td>${outteacherinfo.espertise}</td>
    			<td>${outteacherinfo.projectitem}</td>
    			<td>${outteacherinfo.qualification}</td>
    			<td>${outteacherinfo.review==0?noreview:reviewed}</td>
    			<td><input type="button" value="通过" onclick="location.href='./submitOutteacherinfo?pass=1;intno=${outteacherinfo.outtno}'"></td>
    			<td><input type="button" value="不通过" onclick="location.href='./submitOutteacherinfo?pass=0;intno=${outteacherinfo.outtno}'"/></td>
    		</tr>
    	</c:forEach>
    </form:form>
    
    <form:form action="./submitColteacherinfo"  modelAttribute="colteacherinfo">
    	<tr>
    		<td>Colteacherinfo</td>
    		<td><a href='./submitColteacherinfo'>加载</a></td>
    	</tr>
    	<br/>
    	<c:forEach var="colteacherinfo" items="${colteacherinfoList}">
    		<tr>
    			<td>${colteacherinfo.coltno}</td>
    			<td>${colteacherinfo.name}</td>
    			<td>${colteacherinfo.source}</td>
    			<td>${colteacherinfo.type}</td>
    			<td>${colteacherinfo.teacourse}</td>
    			<td>${colteacherinfo.title}</td>
    			<td>${colteacherinfo.degree}</td>
    			<td>${colteacherinfo.age}</td>
    			<td>${colteacherinfo.graduatesch}</td>
    			<td>${colteacherinfo.overseaxp}</td>
    			<td>${colteacherinfo.engineerbg}</td>
    			<td>${colteacherinfo.manageitem}</td>
    			<td>${colteacherinfo.scientficpa}</td>
    			<td>${colteacherinfo.patsent}</td>
    			<td>${colteacherinfo.softbook}</td>
    			<td>${colteacherinfo.monograph}</td>
    			<td>${colteacherinfo.teapaper}</td>
    			<td>${colteacherinfo.sciresearch}</td>
    			<td>${colteacherinfo.teaethichon}</td>
    			<td>${colteacherinfo.cooperesult}</td>
    			<td>${colteacherinfo.review==0?noreview:reviewed}</td>
    			<td><input type="button" value="通过" onclick="location.href='./submitSchteacherinfo?pass=1;intno=${colteacherinfo.coltno}'"></td>
    			<td><input type="button" value="不通过" onclick="location.href='./submitSchteacherinfo?pass=0;intno=${colteacherinfo.coltno}'"/></td>
    		</tr>
    	</c:forEach>
    </form:form>
      </div>
    </div>
  <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
  <script src="../js/jquery.slimscroll.min.js"></script>
  </body>
</html>

