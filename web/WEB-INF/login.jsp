<%@page language="java" contentType="text/html; charset=utf-8" %>
<form action="<%=basePath%>/login" method="post">
    用户名:<input type="text" name="account"/> <br/>
    密码:<input type="text" name="password"/><br/>
    <input type="submit" value="登录" />
</form>