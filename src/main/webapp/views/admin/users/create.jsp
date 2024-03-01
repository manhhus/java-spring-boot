<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<title>Insert title here</title>
<link rel="stylesheet" href="${ pageContext.request.contextPath }/css/bootstrap.min.css" ></link>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light px-5">
	  <a class="navbar-brand" href="#">Navbar</a>
	
	  <div class="collapse navbar-collapse">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="#">Users</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Categories</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Products</a>
	      </li>
	    </ul>
	  </div>
	</nav>

	<div class="mt-5 col-10 offset-1">
		<form:form
			modelAttribute="user"
			method="POST"
			action="${ pageContext.request.contextPath }/admin/users/store">

			<div class="form-group">
				<label for="username">Name</label>
			    <input type="text" class="form-control" id="username" name="username" autocomplete="off">
			    <small id="name_error" class="form-text text-danger"></small>
			</div>
			<div class="form-group">
				<label for="email">Email</label>
			    <input type="email" class="form-control" id="email" name="email" autocomplete="off">
			    <small id="email_error" class="form-text text-danger"></small>
			</div>
			<div class="form-group">
				<label for="password">Password</label>
			    <input type="password" class="form-control" id="password" name="password" autocomplete="off">
			    <small id="password_error" class="form-text text-danger"></small>
			</div>
			
			<div class="form-group">
				<label for="admin">Role</label>
				<select name="admin" id="admin" class="form-control" required>
					<option selected disabled>Choose</option>
					<option value="0">User</option>
					<option value="1">Admin</option>
				</select>
			    <small id="role_error" class="form-text text-danger"></small>
			</div>
			<div class="form-group">
				<label for="photo">Image</label>
			    <input type="file" class="form-control" id="photo" name="photo">
			    <small id="avatar_error" class="form-text text-danger"></small>
			</div>
			<div class="form-group">
				<label for="status">Status</label>
				<select name="activated" id="activated" class="form-control" required>
					<option selected disabled>Choose</option>
					<option value="1">Active</option>
					<option value="0">Inactive</option>
				</select>
			    <small id="status_error" class="form-text text-danger"></small>
			</div>
			<div class="form-group">
				<button class="btn btn-primary">Submit</button>
				<button type="reset" class="btn btn-danger">Clear</button>
			</div>
		</form:form>
	</div>
</body>
</html>