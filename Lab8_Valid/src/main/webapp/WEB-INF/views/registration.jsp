<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<h1>Registration Form</h1>
	<br>

	<form:form modelAttribute="student" action="registration" method="post">
		<fieldset>
			<label>Id: </label>
			<form:input type="text" path="id" />
			<div style="text-align: center;">
				<form:errors path="id" cssStyle="color : red;" />
			</div>

			<br> <label>Student FirstName: </label>
			<form:input type="text" path="firstName" />
			<div style="text-align: center;">
				<form:errors path="firstName" cssStyle="color : red;" />
			</div>


			<br> <label>Student LastName: </label>
			<form:input type="text" path="lastName" />
			<div style="text-align: center;">
				<form:errors path="lastName" cssStyle="color : red;" />
			</div>


			<br> <label>Student Email:</label>
			<form:input type="text" path="email" />
			<div style="text-align: center;">
				<form:errors path="email" cssStyle="color : red;" />
			</div>


			<%-- <br> <label>Student BirthDate:</label>
			<form:input  path="birthday" id="birthday" /> --%>

			<br> <label>Student Phone:</label>
			<form:input type="text" path="phone.area"  />
			-<form:input type="text" path="phone.prefix"  />
			-<form:input type="text" path="phone.number"  />
			<div style="text-align: center;">
				<form:errors path="phone/*" cssStyle="color : red;" />
			</div>







			<br> <br> <br> <input type="submit" value="Register">
		</fieldset>

	</form:form>


</body>





































</body>
</html>