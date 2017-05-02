<%-- 
    Document   : listar_alunos_admin
    Created on : 27/04/2017, 01:21:28
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
                                    <a href="#" class="dropdown-toggle active" data-toggle="dropdown">Alunos<strong class="caret"></strong></a>
                                    <ul class="dropdown-menu" id="opcao_menu">
                                        <li>
                                            <a href="Menu?acao=cadastrar_aluno" id="">Cadastrar Aluno</a>
                                        </li>
                                        <li>
                                            <a href="Menu?acao=alterar_alunos" id="">Editar Cadastro</a>
                                        </li>
                                        <li>
                                            <a class="active" href="Menu?acao=listar_alunos" id="">Listar Alunos</a>
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
