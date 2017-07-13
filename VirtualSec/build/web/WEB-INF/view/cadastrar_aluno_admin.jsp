<%-- 
    Document   : admin_responsaveis
    Created on : 25/04/2017, 00:03:01
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
                                            <a class="active" href="Menu?acao=cadastrar_aluno" id="">Cadastrar Aluno</a>
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
                        <h3>Cadastrar Aluno</h3>
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
                        <form method="post" action="${pageContext.request.contextPath}/CadastroAlunoServlet">
                            <div class="form-group">
                                <label for="matricula">Matrícula:</label>
                                <input type="text" class="form-control" name="matricula" id="matricula_aluno" value="" placeholder="Digite a matricula" required>
                            </div>
                            <div class="form-group">
                                <label for="nome">Nome:</label>
                                <input type="text" class="form-control" name="nome" id="nome_aluno" value="" placeholder="Digite o nome" required>
                            </div>
                            <div class="form-group">
                                <label for="turma">Turma:</label>
                                <select class="form-control" name="id_turma">
                                    <option></option>
                                    <c:forEach var="Turma" items="${listaTurmas}">
                                    <option value="${Turma.idturma}">${Turma.nome} / ${Turma.turno}</option>
                                </c:forEach>
                                </select>
                            </div> 
                            <div class="form-group">
                                <label for="data_nascimento">Data de nascimento:</label>
                                <input type="text" class="form-control" name="data_nascimento" id="data_nascimento_aluno" value="" placeholder="Digite a data de nascimento" required>
                            </div>
                            <div class="form-group">
                                <label for="deficiencia">Deficiência:</label>
                                <select class="form-control" name="deficiencia_aluno">
                                     <option></option>
                                    <option value="Sim" required>Sim</option>
                                    <option value="Nao">Não</option>
                                </select>
                            </div>
                            <h4>Responsável</h4>
                            <div class="form-group">
                                
                                <label for="nome">Nome:</label>
                                <input type="text" class="form-control" name="nome_resp" id="nome_responsavel_aluno" value="" placeholder="Digite o nome" required>
                            </div>
                            <div class="form-group">
                                <label for="data_nascimento">Data de nascimento:</label>
                                <input type="text" class="form-control" name="data_nascimento_resp" id="data_nascimento_responsavel_aluno" value="" placeholder="Digite a data de nascimento" required>
                            </div>
                            <div class="form-group">
                                <label for="endereco">Endereço:</label>
                                <input type="text" class="form-control" name="endereco_resp" id="endereco_professor" value="" placeholder="Digite o endereço" required>
                            </div>
                            <div class="form-group">
                                <label for="cep">CEP:</label>
                                <input type="text" class="form-control" name="cep_resp" id="cep_professor" value="" placeholder="Digite o cep" required>
                            </div>
                            <div class="form-group">
                                <label for="cidade">Cidade:</label>
                                <input type="text" class="form-control" name="cidade_resp" id="cidade_professor" value="" placeholder="Digite a cidade" required>
                            </div>
                            <div class="form-group">
                                <label for="numero">Número:</label>
                                <input type="text" class="form-control" name="numero_resp" id="numero_professor" value="" placeholder="Digite o numero" required>
                            </div>
                            <div class="form-group">
                                <label for="UF">UF:</label>
                                <input type="text" class="form-control" name="UF_resp" id="UF_professor" value="" placeholder="Digite a UF" required>
                            </div>
                            <div class="form-group">
                                <label for="telefone">Telefone:</label>
                                <input type="tel" class="form-control" name="telefone_resp" id="telefone_responsavel_aluno" value="" placeholder="Digite o telefone" required>
                            </div>
                            <div class="form-group">
                                <label for="email">Email:</label>
                                <input type="email" class="form-control" name="email_resp" id="email_responsavel_aluno" value="" placeholder="Digite o email" required>
                            </div>
                            <div class="form-group">
                                <label for="cpf">CPF:</label>
                                <input type="text" class="form-control" name="cpf_resp" id="cpf_responsavel_aluno" value="" placeholder="Digite o CPF" required>
                            </div>
                            <div class="form-group">
                                <label for="rg">RG:</label>
                                <input type="text" class="form-control" name="rg_resp" id="rg_responsavel_aluno" value="" placeholder="Digite o RG" required>
                            </div>
                            <div class="form-group">
                                <label for="grau_parentesco">Parentesco:</label>
                                <input type="text" class="form-control" name="grau_parentesco_resp" id="grau_parentesco_aluno" value="" placeholder="Digite o grau de parentesco" required>
                            </div>
                            <div class="form-group">
                                <label for="login_resp">Login:</label>
                                <input type="text" class="form-control" name="login_resp" id="login_resp" value="" placeholder="Digite o login" required>
                            </div>
                            <div class="form-group">
                                <label for="senha">Senha:</label>
                                <input type="password" class="form-control" name="senha_resp" id="senha_responsavel_aluno" value="" placeholder="Digite a sennha - Min. 08 Max. 12 caracteres" required>
                            </div>
                            <div class="form-group">
                                <label for="senha">Confirmar senha:</label>
                                <input type="password" class="form-control" name="senha_resp" id="senha_responsavel_aluno" value="" placeholder="Digite a sennha - Min. 08 Max. 12 caracteres" required>
                            </div>
                            <div class="form-group">
                                <input href="CadastroAlunoServlet" type="submit" class="btn btn-default" name="btn_cadastro_aluno" value="Cadastrar"/>
                                <input href="#" type="reset" class="btn btn-default" name="btn_limpar_cadastro" value="Limpar"/>
                                <!-- btn btn-success btn-block -->
                            </div>
                        </form>
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
