<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/12
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:iterator value="userList" var="users">
        <s:property value="id"/>
        <s:property value="userName"/>
        <br/>
    </s:iterator>
    <s:debug/>
</body>
</html>
