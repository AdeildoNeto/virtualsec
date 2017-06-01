<%-- 
    Document   : alterar_aluno_admin
    Created on : 27/04/2017, 01:12:06
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
                                            <a class="active" href="Menu?acao=alterar_alunos" id="">Editar Cadastro</a>
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
                        <h3>Alunos</h3>
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
                                        <th>Opções</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="aluno" items="${listaAluno}">
                                        <tr>
                                            <td>${aluno.matricula}</td>

                                            <td>
                                                <a role="button" data-toggle="modal" data-target="#modal_editar_aluno" aria-haspopup="true"><span class="glyphicon glyphicon-pencil"></span> Editar</a>
                                                <a role="button" onclick="confirmacao('${aluno.matricula}')"><span class="glyphicon glyphicon-remove"></span> Excluir</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>

                            </table>
                        </div>
                        <div class="modal fade" id="modal_editar_aluno" role="dialog">
                            <div class="modal-dialog">
                                <div class="modal-content" id="caixa_modal">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title">Editar Aluno</h4>
                                    </div>
                                    <div class="modal-body" style="padding:40px 60px;">
                                        <h4>Aluno</h4>
                                        <form method="post" action="${pageContext.request.contextPath}/AlterarAlunoServlet">
                                            <div class="form-group">
                                                <label for="nome">Nome:</label>
                                                <input type="text" class="form-control" name="nome" id="nome_aluno" value="" placeholder="Digite o nome" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="data_nascimento">Data de nascimento:</label>
                                                <input type="text" class="form-control" name="data_nascimento" id="data_nascimento_aluno" value="" placeholder="Digite a data de nascimento" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="endereco">Endereço:</label>
                                                <input type="text" class="form-control" name="endereco" id="endereco_aluno" value="" placeholder="Digite o endereço" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="deficiencia">Deficiência:</label>
                                                <select class="form-control" id="deficiencia_aluno">
                                                    <option value="1" required>Sim</option>
                                                    <option value="0">Não</option>
                                                </select>
                                            </div>
                                            <h4>Responsável</h4>
                                            <div class="form-group">
                                                <label for="nome">Nome:</label>
                                                <input type="text" class="form-control" name="nome" id="nome_responsavel_aluno" value="" placeholder="Digite o nome" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="data_nascimento">Data de nascimento:</label>
                                                <input type="text" class="form-control" name="data_nascimento" id="data_nascimento_responsavel_aluno" value="" placeholder="Digite a data de nascimento" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="endereco">Endereço:</label>
                                                <input type="text" class="form-control" name="endereco" id="endereco_responsavel_aluno" value="" placeholder="Digite o endereço" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="telefone">Telefone:</label>
                                                <input type="tel" class="form-control" name="telefone" id="telefone_responsavel_aluno" value="" placeholder="Digite o telefone" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="email">Email:</label>
                                                <input type="email" class="form-control" name="email" id="email_responsavel_aluno" value="" placeholder="Digite o email" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="cpf">CPF:</label>
                                                <input type="text" class="form-control" name="cpf" id="cpf_responsavel_aluno" value="" placeholder="Digite o CPF" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="rg">RG:</label>
                                                <input type="text" class="form-control" name="rg" id="rg_responsavel_aluno" value="" placeholder="Digite o RG" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="grau_parentesco">Disciplina:</label>
                                                <input type="text" class="form-control" name="grau_parentesco" id="grau_parentesco_aluno" value="" placeholder="Digite o grau de parentesco" required>
                                            </div>
                                            <div class="form-group">
                                                <input href="#" type="submit" class="btn btn-default" name="btn_cadastro_aluno" value="Cadastrar"/>
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

        <script language="Javascript">
            function confirmacao(id) {
                var resposta = confirm("Deseja realmente remover o aluno?");
                //  $('#modal_excluir').modal('show'); 
                //document.getElementById("modal_excluir");

                if (resposta == true) {
                    window.location.href = "ExcluirAlunoServlet?aluno=" + id;
                }
            }
        </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    </body>
</html>
