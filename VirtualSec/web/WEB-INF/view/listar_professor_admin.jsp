<%-- 
    Document   : listar_professor_admin
    Created on : 27/04/2017, 00:49:15
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
                                    <h3>Professores</h3>
                                    <div id="lista_professores" class="table-responsive">
                            
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Nome</th>
                                        <th>Data de Nascimento</th>
                                        <th>Endereço</th>
                                        <th>Telefone</th>
                                        <th>Email</th>
                                        <th>CPF</th>
                                        <th>RG</th>
                                        <th>Disciplina</th>
                                        <th>Opções</th>
                                    </tr>
                                </thead>
                                <tbody>
				<tr>
					<td>Professor 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>(00)0000-0000</td>
                                        <td>prof@Professor.com</td>
                                        <td>000000000-00</td>
                                        <td>0000000</td>
                                        <td>disciplina 1</td>
                                       
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Professor 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>(00)0000-0000</td>
                                        <td>prof@Professor.com</td>
                                        <td>000000000-00</td>
                                        <td>0000000</td>
                                        <td>disciplina 1</td>
                                     
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Professor 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>(00)0000-0000</td>
                                        <td>prof@Professor.com</td>
                                        <td>000000000-00</td>
                                        <td>0000000</td>
                                        <td>disciplina 1</td>
                                   
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Professor 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>(00)0000-0000</td>
                                        <td>prof@Professor.com</td>
                                        <td>000000000-00</td>
                                        <td>0000000</td>
                                        <td>disciplina 1</td>
                                     
				</tr>
                                </tbody>
                             
                            </table>
                        </div>
        
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
