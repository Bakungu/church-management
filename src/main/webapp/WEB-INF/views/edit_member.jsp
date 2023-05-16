<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT MEMBER INFO</title>
</head>
<body>
<div align="center">
<h1>Edit Member Information</h1>
<form:form action="save" method="post" modelAttribute="member">
<table>
<tr>
<td>ID:</td>
<td>
${member.memberId}
<form:hidden path="memberId"/>
</td>
</tr>
<tr>
<td>firstName:</td>
<td><form:input path="firstName" /></td>
</tr>
<tr>
<td>last_name:</td>
<td><form:input path="lastName" /></td>
</tr>
<tr>
<td>address:</td>
<td><form:input path="address" /></td>
</tr>
<tr>
<td>date_of_birth:</td>
<td><form:input path="dateOfBirth" /></td>
</tr>
<tr>
<td>contact_details:</td>
<td><form:input path="contactDetails" /></td>
</tr>
<tr>
<td>gender:</td>
<td><form:input path="gender" /></td>
</tr>
<tr>
<td>marital_status:</td>
<td><form:input path="maritalStatus" /></td>
</tr>
<tr>
<td>baptism_date:</td>
<td><form:input path="baptismDate" /></td>
</tr>
<tr>
<td>baptism_location:</td>
<td><form:input path="baptismLocation" /></td>
</tr>
<tr>
<td>pastor_name:</td>
<td><form:input path="pastorName" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Save" /></td>
</tr>
</table>

</form:form>
</div>
</body>
</html>