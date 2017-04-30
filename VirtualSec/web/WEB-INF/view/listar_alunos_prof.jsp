<%-- 
    Document   : listar_alunos_prof
    Created on : 26/04/2017, 01:17:30
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
					            <li id="opcaoNav"><a class="active" href="Menu?acao=listar_turmas_prof">Turmas</a></li>
					        </ul>
						<ul class="nav navbar-nav navbar-right"><li id="opcaoNav"><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-off"></span> Sair</a></li></ul>
		        		</div>
		      		</nav>
		    	</div>
		  	</div>  
		  	<div class="container-fluid">
                            <div class="row">
                                <div id="caixa_conteudo">
                                    <h3>Alunos</h3>
                                    <a href="Menu?acao=listar_turmas_prof"> <img alt="voltar" src="imagens/previous.png" style="height: 30px; width: 30px;"></a>
                                    <div id="lista_turmas" class="table-responsive">
                                        
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Nome</th>
                                        <th>Matrícula</th>
                                        <th>Participação</th>
                                        <th>Aptidão</th>
                                        <th>Comportamento</th>
                                        <th>Trabalho em Equipe</th>
                                        <th>Liderança</th>
                                    </tr>
                                </thead>
                                <tbody>
				<tr>
					<td>Aluno 1</td>
					<td>0000000</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                       <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_inserir_notas" aria-haspopup="true"><span class="glyphicon glyphicon-list"></span> Inserir Notas</a>
                                       </td>
                                       
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Aluno 1</td>
					<td>0000000</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td></td>
                                        <td></td>
                                        
                                       <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_inserir_notas" aria-haspopup="true"><span class="glyphicon glyphicon-list"></span> Inserir Notas</a>
                                       </td>
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Aluno 1</td>
					<td>0000000</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td></td>
                                        <td></td>
                                        
                                       <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_inserir_notas" aria-haspopup="true"><span class="glyphicon glyphicon-list"></span> Inserir Notas</a>
                                       </td>
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Aluno 1</td>
					<td>0000000</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td></td>
                                        <td></td>
                                       <td>
                                        <a role="button" data-toggle="modal" data-target="#modal_inserir_notas" aria-haspopup="true"><span class="glyphicon glyphicon-list"></span> Inserir Notas</a>
                                       </td>
                                   
				</tr>
                                </tbody>
                             
                            </table>
                        </div>
                       <div class="modal fade" id="modal_inserir_notas" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content" id="caixa_modal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Inserir Notas</h4>
                    </div>
                    <div class="modal-body" style="padding:40px 240px;">
                        
                        <form method="post" action="${pageContext.request.contextPath}/ListarAlunoProfServlet">
                                        <div class="form-group">
                                            <label for="nota">Participação:</label>
                                            <input type="text" class="form-control" name="nota" id="nota_aluno" value="" placeholder="">
                                        </div>
                                        <div class="form-group">
                                            <label for="nota">Aptidão:</label>
                                            <input type="text" class="form-control" name="nota" id="nota_aluno" value="" placeholder="">
                                        </div>
                                        <div class="form-group">
                                            <label for="nota">Comportamento</label>
                                            <input type="text" class="form-control" name="nota" id="nota_aluno" value="" placeholder="">
                                        </div>
                                        <div class="form-group">

                                            <label for="nota">Trabalho em equipe:</label>
                                            <input type="text" class="form-control" name="nota" id="nota_aluno" value="" placeholder="">
                                        </div>
                                        <div class="form-group">
                                            <label for="nota">Liderança</label>
                                            <input type="text" class="form-control" name="nota" id="nota_aluno" value="" placeholder="">
                                        </div>
                                        <div class="form-group">
                                            <input href="#" type="submit" class="btn btn-default" name="btn_insere_nota" value="Inserir"/>

                                            
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
