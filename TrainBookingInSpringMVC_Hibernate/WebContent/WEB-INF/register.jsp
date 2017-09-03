<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<script src='https://www.google.com/recaptcha/api.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Indian Railway Reservation Portal.</title>
</head>
<body>
	<button type="button" onclick="goBack()">Back</button>
	<h3><spring:message code="label.registerForm" /></h3>
	<form:errors path="user.*" cssStyle="color:red;"/>
	<form action="/TrainBookingInSpringMVC_Hibernate/submitRegistration.html" method="post">
		<table>
			<tr>	
				<td><spring:message code="label.userId" /></td><td><input type="text" name="userId" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.password" /></td><td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.confirmPassword" /></td><td><input type="password" name="confirmpassword" /></td>
			</tr>
		</table>
		<h3><spring:message code="label.personalDetails" /></h3>
		<table>	
			<tr>
				<td><spring:message code="label.fName" /></td><td><input type="text" name="fName" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.mName" /></td><td><input type="text" name="mName" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.lName" /></td><td><input type="text" name="lName" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.gender" /></td>
				<td><input type="radio" name="gender" value="Male"/><spring:message code="label.male" /></td>
				<td><input type="radio" name="gender" value="Female"/><spring:message code="label.female" /></td>
				<td><input type="radio" name="gender" value="Other"/><spring:message code="label.other" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.maritalStatus" /></td>
				<td><input type="radio" name="maritalStatus" value="Married"/><spring:message code="label.married" /></td>
				<td><input type="radio" name="maritalStatus" value="Unmarried"/><spring:message code="label.unmarried" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.dob" /></td><td><input type="date" name="userDOB" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.occupation" /></td><td><select name="occupation">
														<option value="Government">Government</option>
														<option value="Public">Public</option>
												   		<option value="Private">Private</option>
												   		<option value="Professional">Professional</option>
												   		<option value="SelfEmployed">SelfEmployed</option>
												   		<option value="Student">Student</option>
												   		<option value="Others">Others</option>
												   </select></td>
			</tr>
			<tr>
				<td><spring:message code="label.aadharNo" /></td><td><input type="text" name="aadharCard" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.panNo" /></td><td><input type="text" name="panCard" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.email" /></td><td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.mobile" /></td><td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.nationality" /></td><td><select name="nationality" multiple>
														<option value="India">India</option>
														<option value="USA">USA</option>
												   		<option value="Australia">Australia</option>
												   		<option value="Nepal">Nepal</option>
												   </select></td>
			</tr>
			<tr>
				<td><h3><spring:message code="label.residentialAddress" /></h3></td>
			</tr>
			<tr>
				<td><spring:message code="label.flatNo" /></td><td><input type="text" name="userAddress.flatNo"></td>
			</tr>	
			<tr>	
				<td><spring:message code="label.street" /></td><td><input type="text" name="userAddress.street"></td>
			</tr>
			<tr>	
				<td><spring:message code="label.area" /></td><td><input type="text" name="userAddress.area"></td>
			</tr>
			<tr>	
				<td><spring:message code="label.country" /></td><td><input type="text" name="userAddress.country"></td>
			</tr>
			<tr>	
				<td><spring:message code="label.pincode" /></td><td><input type="text" name="userAddress.pincode"></td>
			</tr>
			<tr>	
				<td><spring:message code="label.state" /></td><td><input type="text" name="userAddress.state"></td>
			</tr>
			<tr>	
				<td><spring:message code="label.city" /></td><td><input type="text" name="userAddress.city"></td>
			</tr>
			<tr>	
				<td><spring:message code="label.postoffice" /></td><td><input type="text" name="userAddress.postOffice"></td>
			</tr>
			<tr>	
				<td><spring:message code="label.phone" /></td><td><input type="text" name="userAddress.phone"></td>
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