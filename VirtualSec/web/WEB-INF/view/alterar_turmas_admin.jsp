<%-- 
    Document   : alterar_turmas_admin
    Created on : 25/04/2017, 23:53:52
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
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle active" data-toggle="dropdown">Turmas<strong class="caret"></strong></a>
    							<ul class="dropdown-menu" id="opcao_menu">
                                                            <li>
                                                                <a href="#" id="">Cadastrar Turma</a>
                                                            </li>
                                                            <li>
                                                                <a class="active" href="#" id="">Alterar Turma</a>
                                                            </li>
                                                            <li>
                                                                <a href="#" id="">Listar Turmas</a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li id="opcaoNav" class="dropdown">
    							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Professores<strong class="caret"></strong></a>
    							<ul class="dropdown-menu" id="opcao_menu">
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
    							<ul class="dropdown-menu" id="opcao_menu">
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
						<ul class="nav navbar-nav navbar-right"><li id="opcaoNav"><a href="${pageContext.request.contextPath}/Logout">Sair</a></li></ul>
		        		</div>
		      		</nav>
		    	</div>
		  	</div>  
		  	<div class="container-fluid">
                            <div class="row">
                                <div id="caixa_conteudo">
                                    <h3>Turmas</h3>
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
                                <tbody>
				<tr>
					<td>Manhã</td>
					<td>3</td>
                                        <td>A05</td>
                                        <td>Professor 1</td>
                                        <td>20</td>
                                        <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_editar_turma" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                        <a role="button" data-target="#panelBasemaps" aria-haspopup="true"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                        </td>
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Manhã</td>
					<td>3</td>
                                        <td>A05</td>
                                        <td>Professor 1</td>
                                        <td>20</td>
                                        <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_editar_turma" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                        <a role="button" data-target="#panelBasemaps" aria-haspopup="true"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                        </td>
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Manhã</td>
					<td>3</td>
                                        <td>A05</td>
                                        <td>Professor 1</td>
                                        <td>20</td>
                                        <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_editar_turma" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                        <a role="button" data-target="#panelBasemaps" aria-haspopup="true"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                        </td>
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Manhã</td>
					<td>3</td>
                                        <td>A05</td>
                                        <td>Professor 1</td>
                                        <td>20</td>
                                        <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_editar_turma" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                        <a role="button" data-target="#panelBasemaps" aria-haspopup="true"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                        </td>
				</tr>
                                </tbody>
                             
                            </table>
                        </div>
        <div class="modal fade" id="modal_editar_turma" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content" id="caixa_modal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Editar Turma</h4>
                    </div>
                    <div class="modal-body" style="padding:40px 60px;">
                        
                        <form method="post" action="${pageContext.request.contextPath}">
                                        <div class="form-group">
                                            <label for="turno">Turno:</label>
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
                                            <input type="text" class="form-control" name="quantidade_alunos" id="quantidade_alunos_turma" value="teste" placeholder="Digite a quantidade máxima de alunos" required>
                                        </div>
                                        <div class="form-group">
                                            <input href="#" type="submit" class="btn btn-default" name="btn_cadastro_turma" value="Atualizar"/>
                                            
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