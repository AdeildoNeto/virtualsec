<%-- 
    Document   : editar_turma_admin
    Created on : 13/07/2017, 01:09:22
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
                        <h3>Editar Turma</h3>
                        <a href="Menu?acao=alterar_turmas"> <img alt="voltar" src="imagens/previous.png" style="height: 30px; width: 30px;"></a>
                        <div id="mensagem" style="height: 40px;">
                            <c:if test="${mensagens.existeErros}">
                                <div id="erro" class="alert">
                                    <ul  id="ul_erro">
                                        <c:forEach var="erro" items="${mensagens.erros}">
                                            <li> ${erro} </li>
                                            </c:forEach>
                                    </ul>
                                </div>
                            </c:if>
                        </div>
                        <c:forEach var="turma" items="${turmaEditar}">
                            <form method="post" action="${pageContext.request.contextPath}/EditarTurmaServlet">
                                <div class="form-group">
                                    <label for="codigo">Código:</label>
                                    <input type="text" class="form-control" name="codigo" id="codigo_turma" value="${turma.idturma}" placeholder="Digite o código da turma" disabled>
                                </div>
                                <div class="form-group">
                                    <label for="turno">Turno:</label>
                                    <input type="text" class="form-control" name="turno" id="turno_turma" value="${turma.turno}" placeholder="Digite o turno" required>
                                </div>
                                <div class="form-group">
                                    <label for="serie">Série:</label>
                                    <input type="text" class="form-control" name="serie" id="serie_turma" value="${turma.nome}" placeholder="Digite a série" required>
                                </div>
                                <div class="form-group">
                                    <label for="sala">Sala:</label>
                                    <input type="text" class="form-control" name="sala" id="sala_turma" value="${turma.numerosala}" placeholder="Digite a sala" required>
                                </div>                     
                                <div class="form-group">
                                    <label for=quantidade_alunos">Quantidade Máxima de Alunos:</label>
                                    <input type="text" class="form-control" name="quantidade_alunos" id="quantidade_alunos_turma" value="${turma.qtdAluno}" placeholder="Digite a quantidade máxima de alunos" required>
                                </div>
                                <div class="form-group">
                                    <input type="submit" class="btn btn-default" name="btn_cadastro_turma" value="Atualizar"/>

                                    <!-- btn btn-success btn-block -->
                                </div>
                            </form>
                        </c:forEach>
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

