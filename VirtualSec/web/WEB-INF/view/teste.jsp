<%-- 
    Document   : teste
    Created on : 31/05/2017, 15:38:56
    Author     : carlo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h4 class="modal-title">Editar Professor</h4>

        <div class="modal-body" style="padding:40px 60px;">
            <c:forEach var="professor" items="${Prof}">
                <form method="post" action="${pageContext.request.contextPath}/AlterarProfServlet">                  
                    <div class="form-group">
                        <label for="nome">Nome:</label>
                        <input type="text" class="form-control" name="nome" id="nome_professor" value="${professor.nomecompleto}" placeholder="Digite o nome" required>
                    </div>
                    <div class="form-group">
                        <label for="data_nascimento">Data de nascimento:</label>
                        <input type="text" class="form-control" name="data_nascimento" id="data_nascimento_professor" value="${professor.login}" placeholder="Digite a data de nascimento" required>
                    </div>
                    <div class="form-group">
                        <label for="telefone">Telefone:</label>
                        <input type="tel" class="form-control" name="telefone" id="telefone_professor" value="${professor.telefone}" placeholder="Digite o telefone" required>
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" name="email" id="email_professor" value="${professor.email}" placeholder="Digite o email" required>
                    </div>
                    <div class="form-group">
                        <label for="cpf">CPF:</label>
                        <input type="text" class="form-control" name="cpf" id="cpf_professor" value="${professor.cpf}" placeholder="Digite o CPF" required>
                    </div>
                    <div class="form-group">
                        <label for="rg">RG:</label>
                        <input type="text" class="form-control" name="rg" id="rg_professor" value="" placeholder="Digite o RG" required>
                    </div>
                    <div class="form-group">
                        <label for="login">Login:</label>
                        <input type="text" class="form-control" name="login" id="login_professor" value="${professor.login}" placeholder="Digite o Login" required>
                    </div>
                    <div class="form-group">
                        <label for="disciplina">Disciplina:</label>
                        <input type="text" class="form-control" name="disciplina" id="disciplina_professor" value="${professor.disciplina}" placeholder="Digite a disciplina" required>
                    </div>
                    <div class="form-group">
                        <input href="CadastroProfServlet" type="submit" class="btn btn-default" name="btn_cadastro_turma" value="Cadastrar"/>
                        <input href="#" type="reset" class="btn btn-default" name="btn_limpar_cadastro" value="Limpar"/>
                        <!-- btn btn-success btn-block -->
                    </div>
                </form>
            </c:forEach>
        </div>
    </body>
</html>
