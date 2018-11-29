<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>登陆界面</title>
  </head>
  <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/page.css" />
  <body background="<%=request.getContextPath()%>/images/801.jpg">
    <div>
      <div class="contain_top">
      	<img src="<%=request.getContextPath()%>/images/sign.png" width="515" height="134"/>
      </div>
      <div class="contain_bottom">
      	<center>
		<jsp:useBean id="user" scope="request" class="com.hfut.uml.domain.UserLG" />
        <form:form modelAttribute="user" action="./UserLogin" method="POST" style="text-align:center">
        <br /><br />
    	用户名:<form:input path="username" /><br/>
    	<font color=red size='-1'><i><form:errors path="username"/></i></font>
        <br /><br />
              密&nbsp;&nbsp;码:<form:password path="password" /><br/>
        <font color=red size='-1'><i><form:errors path="password"/></i></font>
        <br /><br />
        <select name="status">
		  <option value="student">学生</option>
		  <option value="teacher">教师</option>
		  <option value="instructor">导员</option>
		</select>
		<br />
        <input type="submit" value="登录"/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="重置" >
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <br/>
        <p><font color='red' size="-1"><i><form:errors /></i></font></p>
    </form:form></center>
      </div>
    </div>
  </body>
</html>
