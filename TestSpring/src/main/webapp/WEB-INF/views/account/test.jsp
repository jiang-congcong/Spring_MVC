<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="${pageContext.request.contextPath}/jquery/jquery-1.11.3.min.js"></script>
<!--或 <script src="/TestSpringMVC/jquery/jquery-1.11.3.js"></script> -->
<script>
function checkUsername() {
var name=$("#username").val();
$.ajax({ type : "post",
url: "${pageContext.request.contextPath}/Account/CheckUsername", 
data:{"username":name},
dataType : "html",
success: function(msg) {
$("#show").html(msg);
}
});
}
</script>

</head>
<body>
<input type="text" id="username">
<button onclick="checkUsername()">检测</button>
<span id="show" style="color:red;"></span>
</body>
</html>