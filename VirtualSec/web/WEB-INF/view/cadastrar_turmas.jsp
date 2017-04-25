<%-- 
    Document   : cadastro_aluno
    Created on : 24/04/2017, 23:48:58
    Author     : carlo
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
	<div id="wrapper" class="">
            <div id="logo" class="">
                <img id="imagem_titulo" alt="logo VirtualSec" src="imagens/LOGO1.png" >
                <h1 id="titulo_login">VirtualSec</h1>
                <p id="titulo_login">Gerenciamento acadêmico</p>
            </div>
		  	<div class="container-fluid">
		    	<div class="row">
		      		<nav class="navbar navbar-default">
		        		<div class="navbar-reader">
		          			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navBar">
		            		<span class="icon-bar"></span>
		            		<span class="icon-bar"></span>
		            		<span class="icon-bar"></span>
		          			</button>
		        		</div>
		        		<div class="collapse navbar-collapse" id="navBar">
		          			<ul class="nav navbar-nav">
					            <li id="opcaoNav"><a href="WEB-INF/view/menu_admin.jsp">Home</a></li>
                                                    <li id="opcaoNav" class="dropdown active">
    							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Turmas<strong class="caret"></strong></a>
    							<ul class="dropdown-menu">
                                                            <li class="active">
                                                                <a href="#" id="">Cadastrar Turma</a>
                                                            </li>
                                                            <li>
                                                                <a href="#" id="">Alterar Turma</a>
                                                            </li>
                                                            <li>
                                                                <a href="#" id="">Listar Turmas</a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Professores<strong class="caret"></strong></a>
    							<ul class="dropdown-menu">
                                                            <li>
                                                                <a href="#" id="">Cadastrar Professor</a>
                                                            </li>
                                                            <li>
                                                                <a href="#" id="">Editar Cadastro</a>
                                                            </li>
                                                            <li>
                                                                <a href="#" id="">Listar Professores</a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Responsáveis<strong class="caret"></strong></a>
    							<ul class="dropdown-menu">
                                                            <li>
                                                                <a href="#" id="">Cadastrar Responsável</a>
                                                            </li>
                                                            <li>
                                                                <a href="#" id="">Editar Cadastro</a>
                                                            </li>
                                                            <li>
                                                                <a href="#" id="">Listar Responsáveis</a>
                                                            </li>
                                                        </ul>
                                                    </li>
					        </ul>
		        		</div>
		      		</nav>
		    	</div>
		  	</div>  
		  	<div class="container-fluid">
                            <div class="row">
                                <div id="cadastro_turma">
                                    <h3>Nova Turma</h3>
                                    <form method="post" action="${pageContext.request.contextPath}">
                                        <div class="form-group">
                                            <label for="turno">turno:</label>
                                            <input type="text" class="form-control" name="turno" id="turno_turma" value="teste" placeholder="Digite o turno" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="serie">Série:</label>
                                            <input type="text" class="form-control" name="serie" id="serie_turma" value="teste" placeholder="Digite a série" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="sala">Sala:</label>
                                            <input type="text" class="form-control" name="sala" id="sala_turma" value="9999999" placeholder="Digite a sala" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="login">Login:</label>
                                            <input type="text" class="form-control" name="login" id="login_usuario" value="teste" placeholder="Digite o login" required>
                                        </div>
                                        <div class="form-group">
                                            <label for=quantidade_alunos">Quantidade Máxima de Alunos:</label>
                                            <input type="text" class="form-control" name="quantidade_alunos" id="quantidade_alunos_turma" value="teste" placeholder="Digite a quantidade máxima de alunos" required>
                                        </div>
                                        <div class="form-group">
                                            <input href="#" type="submit" class="btn btn-default" name="btn_cadastro_turma" value="Cadastrar"/>
                                             <!-- btn btn-success btn-block -->
                                        </div>
                                    </form>
                                </div>
                            </div>	

		  	</div>          
            <footer id="footer" class="">
                <div class="inner">
                    <p id=info><span ></span>&copy; VirtualSec. All rights reserved.</p>
                    <p id=info><span ></span>WEB 2</p>
                </div>
            </footer>
	</div>
			

			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	</body>
</html>
