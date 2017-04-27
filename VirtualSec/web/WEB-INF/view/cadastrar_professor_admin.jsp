<%-- 
    Document   : admin_professores
    Created on : 25/04/2017, 00:01:39
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
					            <li id="opcaoNav"><a href="HomeServlet">Home</a></li>
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Turmas<strong class="caret"></strong></a>
    							<ul class="dropdown-menu" id="opcao_menu">
                                                            <li>
                                                                <a href="CadastroTurmaServlet" id="">Cadastrar Turma</a>
                                                            </li>
                                                            <li>
                                                                <a href="AlterarTurmaServlet" id="">Alterar Turma</a>
                                                            </li>
                                                            <li>
                                                                <a href="ListarTurmaServlet" id="">Listar Turmas</a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Professores<strong class="caret"></strong></a>
    							<ul class="dropdown-menu" id="opcao_menu">
                                                            <li>
                                                                <a href="CadastroProfServlet" id="">Cadastrar Professor</a>
                                                            </li>
                                                            <li>
                                                                <a href="AlterarProfServlet" id="">Editar Cadastro</a>
                                                            </li>
                                                            <li>
                                                                <a href="ListarProfServlet" id="">Listar Professores</a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle active" data-toggle="dropdown">Alunos<strong class="caret"></strong></a>
    							<ul class="dropdown-menu" id="opcao_menu">
                                                            <li>
                                                                <a href="CadastroAlunoServlet" id="">Cadastrar Aluno</a>
                                                            </li>
                                                            <li>
                                                                <a class="active" href="AlterarAlunoServlet" id="">Editar Cadastro</a>
                                                            </li>
                                                            <li>
                                                                <a href="ListarAlunoServlet" id="">Listar Alunos</a>
                                                            </li>
                                                        </ul>
                                                    </li>
					        </ul>
						<ul class="nav navbar-nav navbar-right"><li id="opcaoNav"><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-off"></span>Sair</a></li></ul>
		        		</div>
		      		</nav>
		    	</div>
           </div>   
		  	<div class="container-fluid">
                            <div class="row">
                                <div id="caixa_conteudo">
                                    <h3>Cadastrar um Professor</h3>
                                    <form method="post" action="${pageContext.request.contextPath}">
                                        <div class="form-group">
                                            <label for="nome">Nome:</label>
                                            <input type="text" class="form-control" name="nome" id="nome_professor" value="" placeholder="Digite o nome" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="data_nascimento">Data de nascimento:</label>
                                            <input type="text" class="form-control" name="data_nascimento" id="data_nascimento_professor" value="" placeholder="Digite a data de nascimento" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="endereco">Endereço:</label>
                                            <input type="text" class="form-control" name="endereco" id="endereco_professor" value="" placeholder="Digite o endereço" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="telefone">Telefone:</label>
                                            <input type="tel" class="form-control" name="telefone" id="telefone_professor" value="" placeholder="Digite o telefone" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="email">Email:</label>
                                            <input type="email" class="form-control" name="email" id="email_professor" value="" placeholder="Digite o email" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="cpf">CPF:</label>
                                            <input type="text" class="form-control" name="cpf" id="cpf_professor" value="" placeholder="Digite o CPF" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="rg">RG:</label>
                                            <input type="text" class="form-control" name="rg" id="rg_professor" value="" placeholder="Digite o RG" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="disciplina">Disciplina:</label>
                                            <input type="text" class="form-control" name="disciplina" id="disciplina_professor" value="" placeholder="Digite a disciplina" required>
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

