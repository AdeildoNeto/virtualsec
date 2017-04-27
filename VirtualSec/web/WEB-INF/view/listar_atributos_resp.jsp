<%-- 
    Document   : listar_atributos_resp
    Created on : 27/04/2017, 01:27:11
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
					            <li id="opcaoNav"><a class="active" href="#">Atributos</a></li>
					        </ul>
						<ul class="nav navbar-nav navbar-right"><li id="opcaoNav"><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-off"></span>Sair</a></li></ul>
		        		</div>
		      		</nav>
		    	</div>
		  	</div>  
		  	<div class="container-fluid">
                            <div class="row">
                                <div id="caixa_conteudo">
                                    <h3>Atributos</h3>
                                    <div id="lista_atributos" class="table-responsive">
                            <h4>Aluno 1</h4>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Disciplina</th>
                                        <th>Professor/th>
                                        <th>Nota</th>
                                        <th>Nota</th>
                                        <th>Nota</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
				<tr>
					<td>Disciplina 1</td>
					<td>Professor</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td>5</td> 
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Disciplina 1</td>
					<td>Professor</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td>5</td> 
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Disciplina 1</td>
					<td>Professor</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td>5</td> 
				</tr>
                                </tbody>
                                <tbody>
				<tr>
					<td>Disciplina 1</td>
					<td>Professor</td>
                                        <td>10</td>
                                        <td>10</td>
                                        <td>5</td> 
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
