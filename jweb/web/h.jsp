<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello world
<%--<%=%> 这个是表达式--%>
<%= pageContext.getAttribute("pageContext")%>
<%= request.getAttribute("request")%>
<%= session.getAttribute("session")%>
<%= application.getAttribute("application")%>
</body>
</html>