CREATE TABLE usuario (idusuarios INTEGER AUTO_INCREMENT NOT NULL, DTYPE VARCHAR(31), cpf INTEGER, email VARCHAR(255), login VARCHAR(255), nomecompleto VARCHAR(255), senha VARCHAR(255), telefone INTEGER, tipousuarios INTEGER, endereco_idendereco INTEGER, PRIMARY KEY (idusuarios))
CREATE TABLE professores (idprofessores INTEGER NOT NULL, disciplina VARCHAR(255), PRIMARY KEY (idprofessores))
CREATE TABLE turma (idturma INTEGER NOT NULL, nome VARCHAR(255), numerosala INTEGER, turno VARCHAR(255), usuarios_idusuarios INTEGER, PRIMARY KEY (idturma))
CREATE TABLE relatorioparental (idRelatorioParental INTEGER AUTO_INCREMENT NOT NULL, alunos_matricula INTEGER, comportamento FLOAT, criatividade FLOAT, facilidade_com_disciplina FLOAT, lideranca FLOAT, motivacao FLOAT, observacoes VARCHAR(255), participacao_em_aula FLOAT, professores_idprofessores INTEGER, responsavel_idresponsavel INTEGER, trabalho_em_equipe FLOAT, PRIMARY KEY (idRelatorioParental))
CREATE TABLE aluno (matricula INTEGER NOT NULL, responsavel_idresponsavel INTEGER, PRIMARY KEY (matricula))
CREATE TABLE administrador (idadministrador INTEGER NOT NULL, cargo VARCHAR(255), PRIMARY KEY (idadministrador))
CREATE TABLE endereco (idendereco INTEGER AUTO_INCREMENT NOT NULL, cep INTEGER, cidade VARCHAR(255), numero INTEGER, rua VARCHAR(255), UF VARCHAR(255), PRIMARY KEY (idendereco))
CREATE TABLE responsavel (idresponsavel INTEGER NOT NULL, alunos_matricula INTEGER, PRIMARY KEY (idresponsavel))
ALTER TABLE usuario ADD CONSTRAINT FK_usuario_endereco_idendereco FOREIGN KEY (endereco_idendereco) REFERENCES endereco (idendereco)
ALTER TABLE professores ADD CONSTRAINT FK_professores_idprofessores FOREIGN KEY (idprofessores) REFERENCES usuario (idusuarios)
ALTER TABLE turma ADD CONSTRAINT FK_turma_usuarios_idusuarios FOREIGN KEY (usuarios_idusuarios) REFERENCES usuario (idusuarios)
ALTER TABLE aluno ADD CONSTRAINT FK_aluno_responsavel_idresponsavel FOREIGN KEY (responsavel_idresponsavel) REFERENCES responsavel (idresponsavel)
ALTER TABLE administrador ADD CONSTRAINT FK_administrador_idadministrador FOREIGN KEY (idadministrador) REFERENCES usuario (idusuarios)
ALTER TABLE responsavel ADD CONSTRAINT FK_responsavel_idresponsavel FOREIGN KEY (idresponsavel) REFERENCES usuario (idusuarios)
ALTER TABLE responsavel ADD CONSTRAINT FK_responsavel_alunos_matricula FOREIGN KEY (alunos_matricula) REFERENCES aluno (matricula)
