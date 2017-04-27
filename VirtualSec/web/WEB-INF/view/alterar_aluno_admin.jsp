<%-- 
    Document   : alterar_aluno_admin
    Created on : 27/04/2017, 01:12:06
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
                                    <h3>Alunos</h3>
                                    <div id="lista_alunos" class="table-responsive">
                            
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Nome</th>
                                        <th>Data de Nascimento</th>
                                        <th>Endereço</th>
                                        <th>Deficiência</th>
                                        <th>Nome</th>
                                        <th>Data de Nascimento</th>
                                        <th>Endereço</th>
                                        <th>Telefone</th>
                                        <th>Email</th>
                                        <th>CPF</th>
                                        <th>RG</th>
                                        <th>Grau de parentesco</th>
                                        <th>Opções</th>
                                    </tr>
                                </thead>
                                <tbody>
				<tr>
					<td>Aluno 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>Não</td>
                                        <td>Responsavel 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>(00) 0000-0000</td>
                                        <td>resp@responsavel.com</td>
                                        <td>000000000-00</td>
                                        <td>0000000</td>
                                        <td>Pai</td>
                                        <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_editar_aluno" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                        <a role="button" data-target="#panelBasemaps" aria-haspopup="true"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                        </td>
				</tr>
                                </tbody>
                                <tbody>
				<tr>
                                    <td>Aluno 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>Não</td>
                                        <td>Responsavel 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>(00) 0000-0000</td>
                                        <td>resp@responsavel.com</td>
                                        <td>000000000-00</td>
                                        <td>0000000</td>
                                        <td>Pai</td>
                                        <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_editar_aluno" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                        <a role="button" data-target="#panelBasemaps" aria-haspopup="true"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                        </td>
				</tr>
                                </tbody>
                                <tbody>
				<tr>
                                    <td>Aluno 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>Não</td>
                                        <td>Responsavel 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>(00) 0000-0000</td>
                                        <td>resp@responsavel.com</td>
                                        <td>000000000-00</td>
                                        <td>0000000</td>
                                        <td>Pai</td>
                                        <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_editar_aluno" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                        <a role="button" data-target="#panelBasemaps" aria-haspopup="true"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                        </td>
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Aluno 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>Não</td>
                                        <td>Responsavel 01</td>
					<td>01/01/2017</td>
                                        <td>IFPE</td>
                                        <td>(00) 0000-0000</td>
                                        <td>resp@responsavel.com</td>
                                        <td>000000000-00</td>
                                        <td>0000000</td>
                                        <td>Pai</td>
                                        <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_editar_aluno" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                        <a role="button" data-target="#panelBasemaps" aria-haspopup="true"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                        </td>
				</tr>
                                </tbody>
                             
                            </table>
                        </div>
        <div class="modal fade" id="modal_editar_aluno" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content" id="caixa_modal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Editar Aluno</h4>
                    </div>
                    <div class="modal-body" style="padding:40px 60px;">
                        <h4>Aluno</h4>
                        <form method="post" action="${pageContext.request.contextPath}">
                                        <div class="form-group">
                                            <label for="nome">Nome:</label>
                                            <input type="text" class="form-control" name="nome" id="nome_aluno" value="" placeholder="Digite o nome" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="data_nascimento">Data de nascimento:</label>
                                            <input type="text" class="form-control" name="data_nascimento" id="data_nascimento_aluno" value="" placeholder="Digite a data de nascimento" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="endereco">Endereço:</label>
                                            <input type="text" class="form-control" name="endereco" id="endereco_aluno" value="" placeholder="Digite o endereço" required>
                                        </div>
                                         <div class="form-group">
                                            <label for="deficiencia">Deficiência:</label>
                                            <select class="form-control" id="deficiencia_aluno">
                                              <option value="1" required>Sim</option>
                                              <option value="0">Não</option>
                                            </select>
                                        </div>
                                        <h4>Pai/Responsável</h4>
                                        <div class="form-group">
                                            <label for="nome">Nome:</label>
                                            <input type="text" class="form-control" name="nome" id="nome_responsavel_aluno" value="" placeholder="Digite o nome" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="data_nascimento">Data de nascimento:</label>
                                            <input type="text" class="form-control" name="data_nascimento" id="data_nascimento_responsavel_aluno" value="" placeholder="Digite a data de nascimento" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="endereco">Endereço:</label>
                                            <input type="text" class="form-control" name="endereco" id="endereco_responsavel_aluno" value="" placeholder="Digite o endereço" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="telefone">Telefone:</label>
                                            <input type="tel" class="form-control" name="telefone" id="telefone_responsavel_aluno" value="" placeholder="Digite o telefone" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="email">Email:</label>
                                            <input type="email" class="form-control" name="email" id="email_responsavel_aluno" value="" placeholder="Digite o email" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="cpf">CPF:</label>
                                            <input type="text" class="form-control" name="cpf" id="cpf_responsavel_aluno" value="" placeholder="Digite o CPF" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="rg">RG:</label>
                                            <input type="text" class="form-control" name="rg" id="rg_responsavel_aluno" value="" placeholder="Digite o RG" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="grau_parentesco">Disciplina:</label>
                                            <input type="text" class="form-control" name="grau_parentesco" id="grau_parentesco_aluno" value="" placeholder="Digite o grau de parentesco" required>
                                        </div>
                                        <div class="form-group">
                                            <input href="#" type="submit" class="btn btn-default" name="btn_cadastro_aluno" value="Cadastrar"/>
                                            <input href="#" type="reset" class="btn btn-default" name="btn_limpar_cadastro" value="Limpar"/>
                                             <!-- btn btn-success btn-block -->
                                        </div>
                                    </form> 
                                </div>
                            </div>	
                            </div>
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
