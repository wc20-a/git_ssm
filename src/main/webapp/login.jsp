<%--
  Created by IntelliJ IDEA.
  User: 汪诚
  Date: 2020/2/3
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/user/login">
    用户名: <input type="text" name="username"/></br>
    密码: &nbsp; &nbsp;<input type="text" name="password"/></br>
    <input type="submit" value="登录">
</form>
${false}
</body>
</html>
