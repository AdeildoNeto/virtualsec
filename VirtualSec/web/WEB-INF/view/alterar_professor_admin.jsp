<%-- 
    Document   : alterar_professor_admin
    Created on : 27/04/2017, 00:37:58
    Author     : carlo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Turmas<strong class="caret"></strong></a>
                                    <ul class="dropdown-menu" id="opcao_menu">
                                        <li>
                                            <a href="Menu?acao=cadastrar_turma" id="">Cadastrar Turma</a>
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
                                    <a href="#" class="dropdown-toggle active" data-toggle="dropdown">Professores<strong class="caret"></strong></a>
                                    <ul class="dropdown-menu" id="opcao_menu">
                                        <li>
                                            <a href="Menu?acao=cadastrar_prof" id="">Cadastrar Professor</a>
                                        </li>
                                        <li>
                                            <a class="active" href="Menu?acao=alterar_prof" id="">Editar Cadastro</a>
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
                                            <a href="Menu?acao=cadastro_aluno" id="">Cadastrar Aluno</a>
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
                    <div id="caixa_conteudo" style="width: 1100px">
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
                                    <c:forEach var="profEditar" items="${profEditar}">
                                        <tr>
                                            <td>${profEditar.nome}</td>
                                            <td>${profEditar.nascimento}</td>
                                            <td>${profEditar.endereco}</td>
                                            <td>${profEditar.telefone}}</td>
                                            <td>${profEditar.email}</td>
                                            <td>${profEditar.CPF}</td>
                                            <td>${profEditar.RG}</td>
                                            <td>${profEditar.disciplina}</td>
                                            <td>
                                                <a role="button" data-toggle="modal" data-target="#modal_editar_professor" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                                <a role="button" data-target="#panelBasemaps" aria-haspopup="true"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>

                                </table>
                            </div>
                            <div class="modal fade" id="modal_editar_professor" role="dialog">
                                <div class="modal-dialog">
                                    <div class="modal-content" id="caixa_modal">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h4 class="modal-title">Editar Professor</h4>
                                        </div>
                                        <div class="modal-body" style="padding:40px 60px;">

                                            <form method="post" action="${pageContext.request.contextPath}/AlterarProfServlet">
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