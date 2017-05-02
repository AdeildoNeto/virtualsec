<%-- 
    Document   : listar_turmas_prof
    Created on : 26/04/2017, 00:58:03
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
                        <h3>Turmas</h3>
                        <div id="lista_turmas" class="table-responsive">

                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Turno</th>
                                        <th>Série</th>
                                        <th>Sala</th>
                                        <th>Disciplina</th>
                                        <th>Quantidade de Alunos</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Manhã</td>
                                        <td>3</td>
                                        <td>A05</td>
                                        <td>Disciplina 1</td>
                                        <td>20</td>
                                        <td>
                                            <a role="button" href="ListarAlunoProfServlet" aria-haspopup="true"><span class="glyphicon glyphicon-list"></span> Exibir Alunos</a>
                                        </td>

                                    </tr>
                                </tbody>
                                <tbody>
                                    <tr>
                                        <td>Manhã</td>
                                        <td>3</td>
                                        <td>A05</td>
                                        <td>Disciplina 1</td>
                                        <td>20</td>
                                        <td>
                                            <a role="button" href="ListarAlunoProfServlet" aria-haspopup="true"><span class="glyphicon glyphicon-list"></span> Exibir Alunos</a>
                                        </td>
                                    </tr>
                                </tbody>
                                <tbody>
                                    <tr>
                                        <td>Manhã</td>
                                        <td>3</td>
                                        <td>A05</td>
                                        <td>Disciplina 1</td>
                                        <td>20</td>
                                        <td>
                                            <a role="button" href="ListarAlunoProfServlet" aria-haspopup="true"><span class="glyphicon glyphicon-list"></span> Exibir Alunos</a>
                                        </td>
                                    </tr>
                                </tbody>
                                <tbody>
                                    <tr>
                                        <td>Manhã</td>
                                        <td>3</td>
                                        <td>A05</td>
                                        <td>Disciplina 1</td>
                                        <td>20</td>
                                        <td>
                                            <a role="button" href="ListarAlunoProfServlet" aria-haspopup="true"><span class="glyphicon glyphicon-list"></span> Exibir Alunos</a>
                                        </td>

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
