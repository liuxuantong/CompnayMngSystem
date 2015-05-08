<%@ page language="java" 	pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Registration Page</title>
<s:head />
<style type="text/css">
@import url(style.css);
</style>
</head>
<body>
<s:form action="saveOrUpdateUser">
	<s:push value="loginUser">
		<s:hidden name="userId" />
		<s:textfield name="kanjiName" label="User Name" />
		<s:submit />
	</s:push>
</s:form>

<s:if test="userList.size() > 0">
	<div class="content">
	<table class="userTable" cellpadding="5px">
		<tr class="even">
			<th>ユーザーID</th>
			<th>名前</th>
		</tr>
		<s:iterator value="userList" status="userStatus">
			<tr
				class="<s:if test="#userStatus.odd == true ">odd</s:if> <s:else>even</s:else>">
				<td><s:property value="userId" /></td>
				<td><s:property value="kanjiName" /></td>
				<td>
                <s:url id="editURL" action="editUser">
					<s:param name="userId" value="%{id}"></s:param>
				</s:url>
                <s:a href="%{editURL}">編集</s:a>
                </td>
				<td>
                <s:url id="deleteURL" action="deleteUser">
					<s:param name="userId" value="%{id}"></s:param>
				</s:url>
                <s:a href="%{deleteURL}">削除</s:a>
                </td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>
</body>
</html>