package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Relatorioparental;
import model.Responsavel;
import model.Turma;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-13T18:19:24")
@StaticMetamodel(Aluno.class)
public class Aluno_ { 

    public static volatile SingularAttribute<Aluno, Turma> idTurma;
    public static volatile SingularAttribute<Aluno, Integer> matricula;
    public static volatile SingularAttribute<Aluno, String> nome;
    public static volatile SingularAttribute<Aluno, String> dataNascimento;
    public static volatile CollectionAttribute<Aluno, Relatorioparental> relatorioparentalCollection;
    public static volatile CollectionAttribute<Aluno, Responsavel> responsavelCollection;
    public static volatile SingularAttribute<Aluno, String> deficiencia;

}