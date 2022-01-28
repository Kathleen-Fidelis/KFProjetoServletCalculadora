<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Calculadora Servlet</title>
</head>
<body>
	<div class="container">
		<h1 class="mt-3">Calculadora</h1>
		<form method="post" action="KFServletCalculadora">
		  <div class="mb-3 col-4">
		    <label for="exampleInputValor1" class="form-label">Valor 1</label>
		    <input type="text" class="form-control" name="valor1">
		  </div>
		 <div class="mb-3 col-4">
		    <label for="exampleInputValor2" class="form-label">Valor 2</label>
		    <input type="text" class="form-control" name="valor2">
		  </div>
		  <h4>Resultado soma=${requestScope.resSoma}</h4>
		  <h4>Resultado divisão=${requestScope.resDivisao}</h4>
		  <h4>Resultado subtração=${requestScope.resSubtracao}</h4>
		  <h4>Resultado multiplicação=${requestScope.resMultiplicacao}</h4>
		  <button type="reset" class="btn btn-primary">Limpar</button>	
		   <button type="submit" class="btn btn-primary">Realizar operações</button>	
		</form>
	</div>
</body>
</html>