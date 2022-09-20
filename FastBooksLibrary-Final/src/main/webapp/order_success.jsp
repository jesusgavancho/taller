<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2;">
	<%@include file="all_component/navbar.jsp"%>
	
	<div class="container text-center mt-3">
		<i class="fas fa-check-circle fa-5x text-success"></i>
		<h1>Thanks</h1>
		<h2>Order Successful</h2>
		<h5>Within 7 days your order will be delivered in your respective
			address</h5>
		<a href="index.jsp" class="btn btn-primary mt-3 m-3" >Home</a><a
			href="order.jsp" class="btn btn-danger mt-3 m-3">View Order</a>

	</div>
<%@include file="all_component/footer.jsp"%>
</body>
</html>