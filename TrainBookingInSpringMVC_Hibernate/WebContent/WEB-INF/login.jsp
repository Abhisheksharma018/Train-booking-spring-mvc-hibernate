<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src='https://www.google.com/recaptcha/api.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Indian Railway Reservation Portal.</title>
</head>
<body>
	
	<button type="button" onclick="goBack()">Back</button>
	<h3><spring:message code="label.loginForm" /></h3>
	<form action="/TrainBookingInSpringMVC_Hibernate/submitLogin" method="post">
		<table>
			<tr>	
				<td><spring:message code="label.userId" /></td><td><input type="text" name="userId" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.password" /></td><td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.capctha" /></td>
				<td><div class="g-recaptcha" data-sitekey="6Lfy6iwUAAAAAF1qf30B6LwJFj-N4pv0zF_X_PWR"></div></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	</form>
</body>
<script>
function goBack() {
    window.history.back();
}
</script>
</html>