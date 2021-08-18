    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
	
<link href="<c:url value='/resources/css/style.css' />">
<script src="<c:url value='/resources/js/script.js'/>"></script>

<title>Handle Complex Form</title>
</head>
<body>


	<div class="container">



		<div class="card border-secondary mx-auto mt-5" style="width: 50%">
		
			<img alt="My Image" src="<c:url value='/resources/images/spring logo.png' />">
			<div class="card-body">
				<h2 class="text-center m-3 ">Registrarion Form</h2>
				
				
				<div class="alert alert-danger" role="alert">
				<form:errors path="student.*"/>
</div>
				
				<form action="process" method="post">
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Your
							Name</label> <input type="text" name="name" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp"
							placeholder="Enter your name">
					</div>

					<div class="mb-3">
						<label for="id" class="form-label">Your ID</label> <input
							type="text" name="id" class="form-control" id="id"
							placeholder="Enter your id">
					</div>

					<div class="mb-3">
						<label for="dob" class="form-label">Your Date of Birth</label> <input
							type="text" name="dob" class="form-control" id="dob"
							placeholder="Enter your date of birth (DD/MM/YYYY)">
					</div>

					<div class="mb-3">
						<label class="form-label">Select courses</label> <select
							name="courses" class="form-select" multiple>
							<option selected value="Java">Java</option>
							<option value="Python">Python</option>
							<option value="Spring">Spring</option>
							<option value="Django">Django</option>
						</select>
					</div>

					<div class="mb-3">
						<label class="form-label">Select your gender </label>
						<div class="form-check">

							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="gender"
									id="inlineRadio1" value="Male"> <label
									class="form-check-label" for="inlineRadio1">Male</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="gender"
									id="inlineRadio2" value="Female"> <label
									class="form-check-label" for="inlineRadio2">Female</label>
							</div>

						</div>
					</div>

					<div class="mb-3">
						<label class="form-label">Select type</label> <select name="type"
							class="form-select" aria-label="Default select example">
							<option selected value="0">Select type</option>
							<option value="new">New Student</option>
							<option value="old">Old Student</option>
						</select>
					</div>

					<div class="card">
						<div class="card-body">

							<div class="mb-3">
								<label class="form-label">Your Street</label> <input type="text"
									name="address.street" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter your street">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Your
									Street</label> <input type="text" name="address.city"
									class="form-control" placeholder="Enter your city">
							</div>
						</div>
					</div>

					<div class="container text-center mt-3">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>

				</form>
			</div>
		</div>


	</div>



	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
    -->
</body>
</html>
