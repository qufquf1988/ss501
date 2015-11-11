<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String cp=request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="<%=cp%>/bbs/write_ok.do" method="post">
	이름:<input type="text" name="name"><br> <!--  name 꼭 써줘야된다. -->
	제목:<input type="text" name="subject"><br>
	<input type="submit" value="보내기">
</form>

</body>
</html>
