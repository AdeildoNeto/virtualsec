<%-- 
    Document   : listar_alunos_prof
    Created on : 26/04/2017, 01:17:30
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
                        <h3>Notas</h3>
                        <a href="Menu?acao=listar_turmas_prof"> <img alt="voltar" src="imagens/previous.png" style="height: 30px; width: 30px;"></a>
                        <div id="mensagem" style="height: 50px;">
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
                        <c:forEach var="nota" items="${relatorioAluno}">
                        <form method="post" action="${pageContext.request.contextPath}/SalvarNotas">
                            <div class="form-group">
                                <label for="nota">Participação:</label>
                                <input type="text" class="form-control" name="part" id="nota_aluno" value="${nota.participacaoEmAula}" placeholder="">
                            </div>
                            <div class="form-group">
                                <label for="nota">Facilidade com a disciplina:</label>
                                <input type="text" class="form-control" name="fac" id="nota_aluno" value="${nota.facilidadeComDisciplina}" placeholder="">
                            </div>
                            <div class="form-group">
                                <label for="nota">Comportamento</label>
                                <input type="text" class="form-control" name="comp" id="nota_aluno" value="${nota.comportamento}" placeholder="">
                            </div>
                            <div class="form-group">

                                <label for="nota">Trabalho em equipe:</label>
                                <input type="text" class="form-control" name="eqp" id="nota_aluno" value="${nota.trabalhoEmEquipe}" placeholder="">
                            </div>
                            <div class="form-group">
                                <label for="nota">Liderança</label>
                                <input type="text" class="form-control" name="lider" id="nota_aluno" value="${nota.lideranca}" placeholder="">
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-default" name="btn_insere_nota" value="Salvar"/>
                                <!-- btn btn-success btn-block -->
                            </div>
                            <input type="hidden" class="form-control" name="id"  value="${nota.idRelatorioParental}">
       
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

