<%@ page language="java" pageEncoding="utf8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザーのログインページ</title>
<s:head />
</head>
<body>
<p> 社内のシステム
    <s:form action="Login">
        <s:textfield name="userId" label="User Name" />
        <s:password name="password" label="Password" />
        <s:submit value="Login" />
    </s:form>
</body>
</html>