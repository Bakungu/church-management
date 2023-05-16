<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container" align="center">
<h1>Member Registration Form:</h1>
<div class="card">
<div class="card-body">
<form:form action="save" method="post" modelAttribute="member">
<div class="form-group row">
<label for="memberId" class="col-sm-2 col-form-label">Member id:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="memberId" 
placeholder="Enter id" path="memberId"/>
</div>
</div>
<div class="form-group row">
<label for="owner" class="col-sm-2 col-form-label">first name:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="first_name" 
placeholder="Enter first name" path="firstName"/>
</div>
</div>
<div class="form-group row">
<label for="last_name" class="col-sm-2 col-form-label">last name:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="last_name" 
 path="lastName" />
</div>
</div>
<div class="form-group row">
<label for="address" class="col-sm-2 col-form-label">address:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="address" 
 path="address" />
</div>
</div>
<div class="form-group row">
<label for="date_of_birth" class="col-sm-2 col-form-label">date of birth:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="dateOfBirth" 
 path="dateOfBirth" />
</div>
</div>
<div class="form-group row">
<label for="contact_details" class="col-sm-2 col-form-label">contact details:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="contact_details" 
 path="contactDetails" />
</div>
</div>
<div class="form-group row">
<label for="gender" class="col-sm-2 col-form-label">gender:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="gender" 
 path="gender" />
</div>
</div>
<div class="form-group row">
<label for="marital_status" class="col-sm-2 col-form-label">marital status:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="marital_status" 
 path="maritalStatus" />
</div>
</div>
<div class="form-group row">
<label for="baptism_date" class="col-sm-2 col-form-label">baptism date:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="baptism_date" 
 path="baptismDate" />
</div>s
</div>
<div class="form-group row">
<label for="baptism_location" class="col-sm-2 col-form-label">baptism location:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="baptism_location" 
 path="baptismLocation" />
</div>
</div>
<div class="form-group row">
<label for="pastor_name" class="col-sm-2 col-form-label">pastor_name:</label>
<div class="col-sm-7">
<form:input type="text" class="form-control" name="pastor_name" 
 path="pastorName" />
</div>
</div>
<button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</div>
</div>
</div>
</body>
</html>