
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Login</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/loginscript.js"></script>
</head>
<body>
  <form:form action="userCheck" modelAttribute="loginDetails" id="loginForm" method="post">
   	<ol>
	            <li>
	            	<div>
	                <p><label> Enter User Name:</label>
	               	<input type="text" name="name">
	               	</div>
	            </li>
	            <li>
	             	<div>
	                <p><label> Enter Password :</label>
	                <input type="password" name="pwd"/>
	               	</div>
	            </li>
	            <li>
	             	<div>
	                <input type="submit" id="SignIn" value='Sign In'>
	               	</div>
	               	<div>
	                <input type="button" id="SignUp"  value='Sign Up'>
	               	</div>
	            </li>
	</ol>
  </form:form>
</body>
</html>