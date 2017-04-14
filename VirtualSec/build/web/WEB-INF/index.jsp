<%-- 
    Document   : index
    Created on : 07/04/2017, 19:18:20
    Author     : Aluno
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>VirtualSec</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link href="css/style.css" rel="stylesheet" type="text/css"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		

	</head>
	<body>
		<!-- Wrapper -->
		
			<div id="wrapper" class="col-sm-12">

				<!-- Intro -->
					<section id="intro" class="">
						<div id="teste" class="col-sm-10">
							<img id="imagem_titulo" alt="logo VirtualSec" src="imagens/LOGO1.png" >
							<h1 id="titulo_login">VirtualSec</h1>
							<p id="titulo_login">Gerenciamento acadêmico</p>
							<section>
									<form method="post" action="Login">
										
											<div class="form-group">
												<label class="control-label" id="nomeCaixa">Login:</label>
												<input class="form-control" type="text" name="login" id="login" value="" required placeholder="Insira seu login"/>
											</div>
											<div class="form-group">
												<label class="control-label" id="nomeCaixa">Senha:</label>
												<input class="form-control" type="password" name="senha" id="login" value="" required placeholder="Insira sua senha"/>
											</div>
											<div class="form-group">
												<input class="form-control btn btn-default" type="submit" name="btn_login" value="Entrar"/>	
											</div>
										
									</form>
							</section>
						</div>
					</section>
					<div class="row">
						<footer id="footer" class="col-sm-12">
							<div class="inner">
								<p id=info><span ></span>&copy; VirtualSec. All rights reserved.</p>
          						<p id=info><span ></span>WEB 2</p>
							</div>
						</footer>
					</div>
			</div>


		
				

		<!-- Scripts -->
		<!--
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->

			

			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	</body>
</html>