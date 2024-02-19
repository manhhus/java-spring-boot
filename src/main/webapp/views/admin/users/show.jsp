<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${ pageContext.request.contextPath }/css/bootstrap.min.css" ></link>
</head>
<body>

	<div class="col-10 offset-1">
		<div class="row col-12">
			<label class="col-4">Họ Tên</label>		
			<label class="col-6">${ user.username }</label>		
		</div>
		<div class="row col-12">
			<label class="col-4">Email</label>		
			<label class="col-6">${ user.email }</label>		
		</div>
		<div class="row col-12">
			<label class="col-4">Trạng thái</label>		
			<label class="col-6">${ user.activated == 1 ? "Đang hoạt động" : "Vô hiệu hóa" }</label>		
		</div>
		<div class="row col-12">
			<label class="col-4">Tài khoản</label>		
			<label class="col-6">${ user.admin == 1 ? "Admin" : "Member" }</label>		
		</div>
	</div>
</body>
</html>