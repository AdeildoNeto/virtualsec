<%-- 
    Document   : menu
    Created on : 13/04/2017, 20:56:15
    Author     : Aldo-pc
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
                                <li id="opcaoNav"><a href="Menu?acao=Home" class="active" >Home</a></li>
                                <li id="opcaoNav" class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Turmas<strong class="caret"></strong></a>
                                    <ul class="dropdown-menu" id="opcao_menu">
                                        <li>
                                            <a href="Menu?acao=cadastrar_turma" id="cadastrar_turma">Cadastrar Turma</a>
                                        </li>
                                        <li>
                                            <a href="Menu?acao=alterar_turmas" id="alterar_turma">Alterar Turma</a>
                                        </li>
                                        <li>
                                            <a href="Menu?acao=listar_turmas" id="listar_turma_admin">Listar Turmas</a>
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
                                            <a href="Menu?acao=cadastrar_aluno" id="">Cadastrar aluno</a>
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
                        <div id="caixa_opcao">
                            <h4>Turmas</h4>
                            <ul id="opcao_menu">
                                <li>
                                    <a href="Menu?acao=cadastrar_turma" id="cadastrar_turma">Cadastrar Turma</a>
                                </li>
                                <li>
                                    <a href="Menu?acao=alterar_turmas" id="alterar_turma">Alterar Turma</a>
                                </li>
                                <li>
                                    <a href="Menu?acao=listar_turmas" id="listar_turma_admin">Listar Turmas</a>
                                </li>
                            </ul>
                        </div>
                        <div id="caixa_opcao">
                            <h4>Professores</h4>
                            <ul id="opcao_menu">
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
                        </div>
                        <div id="caixa_opcao">
                            <h4>Alunos</h4>
                            <ul id="opcao_menu">
                                <li>
                                    <a href="Menu?acao=cadastrar_aluno" id="">Cadastrar aluno</a>
                                </li>
                                <li>
                                    <a href="Menu?acao=alterar_alunos" id="">Editar Cadastro</a>
                                </li>
                                <li>
                                    <a href="Menu?acao=listar_alunos" id="">Listar Alunos</a>
                                </li>
                            </ul>
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