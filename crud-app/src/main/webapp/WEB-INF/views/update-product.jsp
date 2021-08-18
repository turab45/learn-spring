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

		<div class="card border-secondary mx-auto mt-5" style="width: 50%;  ">
			<div class="card-body p-3">

				<h1 class="text-center">Update Product</h1>
				<form action="${pageContext.request.contextPath}/create-product" method="post">
				
				<input type="number" name="id" value="${product.id}" hidden="true">
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Product
							Name</label> <input name="name" value="${product.name}" type="text" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter product name here.">

					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Product
							Description</label>
							<textarea  style="height: 100px;" name="description" class="form-control" id="validationTextarea"
								placeholder="Enter product description.." >${product.description}</textarea>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Product
							Price</label> <input name="price" type="number" value="${product.price}" class="form-control"
							 placeholder="Enter product price here.">

					</div>
					
					<div class="text-center">
					<a href="${pageContext.request.contextPath}/" class="btn btn-danger">Cancel</a>
					<button type="submit" class="btn btn-success">Update Product</button>
					</div>
				</form>

			</div>
		</div>

	</div>

</body>
</html>

