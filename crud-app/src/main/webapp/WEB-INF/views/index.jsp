<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-5">
		<h2 class="text-center mb-5">Welcome To Products App</h2>
		<div class="card border-secondary mx-auto mt-5">
			<div class="card-body p-3">
				<div class="text-left mb-5">
					<a href="add" class="btn btn-success">Add New Product</a>
				</div>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">S.NO</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col" colspan="2">Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products}" var="product">
							<tr>
								<th scope="row">${product.id}</th>
								<td>${product.name }</td>
								<td>${product.description }</td>
								<td>${product.price }</td>
								<td>
									<a href="delete/${product.id}"><i class="fas fa-trash text-danger"></i></a>
								</td>
								<td><a href="update/${product.id}"><i class="fas fa-edit "></i></a></td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>

	</div>


</body>
</html>

