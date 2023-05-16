<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Members</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>

<div align="center">
<a href="new" class="btn btn-primary btn-lg active" role="button" >ADD NEW MEMBER</a>
<table class="table table-striped table-dark">
<tr class="table-active">
<th  scope="col">#</th>
<th  scope="col">id</th>
<th  scope="col">first_name</th>
<th  scope="col">last_name</th>
<th  scope="col">address</th>
<th  scope="col">date_of_birth</th>
<th  scope="col">contact_details</th>
<th  scope="col">gender</th>
<th  scope="col">marital_status</th>
<th  scope="col">baptism_date</th>
<th  scope="col">baptism_location</th>
<th  scope="col">pastor_name</th>
<th  scope="col">Action</th>
</tr>

<c:forEach items="${listMember }" var="member" varStatus="status">
<tr class= " bg-info">
<td  scope="row">${status.index +1 }</td>
<td  scope="row">${member.memberId }</td>
<td scope="row">${member.firstName }</td>
<td scope="row">${member.lastName }</td>
<td scope="row">${member.address }</td>
<td scope="row">${member.dateOfBirth }</td>
<td scope="row">${member.contactDetails }</td>
<td scope="row">${member.gender }</td>
<td scope="row">${member.maritalStatus }</td>
<td scope="row">${member.baptismDate }</td>
<td scope="row">${member.baptismLocation }</td>
<td>
<a class=" btn btn-outline-dark text-white bg-dark" href="edit?id=${member.memberId}">Edit</a>
&nbsp;&nbsp;
<a class="btn btn-outline-dark text-white bg-dark" href="delete?id=${member.memberId}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>