<%-- 
    Document   : Listar_turmas_admin
    Created on : 25/04/2017, 00:48:55
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
                        <div id="lista_turmas" class="table-responsive">
                            
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Turno</th>
                                        <th>Série</th>
                                        <th>Sala</th>
                                        <th>Professor</th>
                                        <th>Quantidade Máxima de Alunos</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <c:forEach var="usuario" items="${listaUsuario}">
				<tr>
					<td>${usuario.nome}</td>
					<td>${usuario.sobrenome}</td>
                                        <td>${usuario.login}</td>
                                        <td>${usuario.senha}</td>
                                        <td>${usuario.email}</td> 
				</tr>
                                </c:forEach>
                            </table>
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