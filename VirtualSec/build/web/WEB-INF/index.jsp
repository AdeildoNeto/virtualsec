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
	<div id="wrapper" class="">
            <div id="logo" class="">
                <img id="imagem_titulo" alt="logo VirtualSec" src="imagens/LOGO1.png" >
                <h1 id="titulo_login">VirtualSec</h1>
                <p id="titulo_login">Gerenciamento acadêmico</p>
            </div>
            <div class="caixa_login">
                <form method="post" action="Login">										
                    <div class="form-group">
                        <label class="control-label" id="nomeCaixa">Login:</label>
                        <input class="form-control" type="text" name="login" id="login" value="" placeholder="Insira seu login" required/>
                    </div>
                    <div class="form-group">
                        <label class="control-label" id="nomeCaixa">Senha:</label>
                        <input class="form-control" type="password" name="senha" id="senha" value="" placeholder="Insira sua senha" required/>
                    </div>
                    <div class="form-group">
                        <input href="#" class="form-control btn btn-default" type="submit" name="btn_login" value="Entrar"/>	
                    </div>
                </form>
            </div>
            <div id="conteudo">
                
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