c<%-- 
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
					            <li id="opcaoNav"><a href="Menu?acao=Home">Home</a></li>
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle active" data-toggle="dropdown">Turmas<strong class="caret"></strong></a>
    							<ul class="dropdown-menu" id="opcao_menu">
                                                            <li>
                                                                <a class="active" href="Menu?acao=cadastrar_turma" id="">Cadastrar Turma</a>
                                                            </li>
                                                            <li>
                                                                <a href="Menu?acao=alterar_turmas" id="">Alterar Turma</a>
                                                            </li>
                                                            <li>
                                                                <a href="Menu?acao=listar_turmas" id="">Listar Turmas</a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Professores<strong class="caret"></strong></a>
    							<ul class="dropdown-menu" id="opcao_menu">
                                                            <li>
                                                                <a href="Menu?acao=cadastrar_prof" id="">Cadastrar Professor</a>
                                                            </li>
                                                            <li>
                                                                <a href="Menu?acao=alterar_prof" id="">Editar Cadastro</a>
                                                            </li>
                                                            <li>
                                                                <a href="Menu?acao=listar_prof" id="">Listar Professores</a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Alunos<strong class="caret"></strong></a>
    							<ul class="dropdown-menu" id="opcao_menu">
                                                            <li>
                                                                <a href="Menu?acao=cadastrar_aluno" id="">Cadastrar Aluno</a>
                                                            </li>
                                                            <li>
                                                                <a href="Menu?acao=alterar_alunos" id="">Editar Cadastro</a>
                                                            </li>
                                                            <li>
                                                                <a href="Menu?acao=listar_alunos" id="">Listar Alunos</a>
                                                            </li>
                                                        </ul>
                                                    </li>
					        </ul>
						<ul class="nav navbar-nav navbar-right"><li id="opcaoNav"><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-off"></span> Sair</a></li></ul>
		        		</div>
		      		</nav>
		    	</div>
           </div> 
            
		  	<div class="container-fluid">
                            <div class="row">
                                <div id="caixa_conteudo">
                                    <h3>Cadastrar uma Turma</h3>
                                    <form method="post" action="${pageContext.request.contextPath}/CadastroTurmaServlet">
                                        <div class="form-group">
                                            <label for="turno">turno:</label>
                                            <input type="text" class="form-control" name="turno" id="turno_turma" value="" placeholder="Digite o turno" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="serie">Série:</label>
                                            <input type="text" class="form-control" name="serie" id="serie_turma" value="" placeholder="Digite a série" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="sala">Sala:</label>
                                            <input type="text" class="form-control" name="sala" id="sala_turma" value="" placeholder="Digite a sala" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="professor">Professor:</label>
                                            <select class="form-control" id="professor_turma">
                                              <option value="1" required>Professor 1</option>
                                              <option value="2">Professor 2</option>
                                              <option value="3">Professor 3</option>
                                              <option value="4">Professor 4</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for=quantidade_alunos">Quantidade Máxima de Alunos:</label>
                                            <input type="text" class="form-control" name="quantidade_alunos" id="quantidade_alunos_turma" value="" placeholder="Digite a quantidade máxima de alunos" required>
                                        </div>
                                        <div class="form-group">
                                            <input href="#" type="submit" class="btn btn-default" name="btn_cadastro_turma" value="Cadastrar"/>
                                            <input href="#" type="reset" class="btn btn-default" name="btn_limpar_cadastro" value="Limpar"/>
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
