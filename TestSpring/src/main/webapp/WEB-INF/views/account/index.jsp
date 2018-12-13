<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Login" method="get" >
<label style="width:50px;float:left;text-align:right;">用户名</label>
<input name="username" type="text"/><br/>
<label style="width:50px;float:left;text-align:right;">密码</label>
<input name="password" type="text"/>
<br>
<input type="submit" value="登录"/> 
</form>
<span style="color:red;">${errorMsg}</span>
<%session.removeAttribute("errorMsg"); %>

</body>
</html>