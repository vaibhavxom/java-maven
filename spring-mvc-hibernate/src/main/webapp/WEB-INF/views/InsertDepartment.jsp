<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Department JSP</title>
</head>
<body>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>
<sp:form action="InsertDepartment" method="post" modelAttribute="department">

Enter Department No: <sp:input path="deptNO"/>
Enter Department Name: <sp:input path="dname"/>
Enter Department Location:<sp:input path="loc"/>

<input type="submit" value="Insert">

</sp:form>
</body>
</html>