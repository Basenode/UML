<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>上传文件</title>
    
  </head>
  
  <body>
    <h3>上传图片</h3>
    <form action="./ExcelUploadCtrl" method="POST" enctype="multipart/form-data">
        <input type="file" name="excelFile" accept="application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"/>
        <input type="submit" value="上传文件" /><br>
        ${fileError}
    </form>
  </body>
</html>
