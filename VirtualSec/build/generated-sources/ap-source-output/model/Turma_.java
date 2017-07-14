package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Aluno;
import model.Professores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-13T18:19:24")
@StaticMetamodel(Turma.class)
public class Turma_ { 

    public static volatile CollectionAttribute<Turma, Aluno> alunoCollection;
    public static volatile SingularAttribute<Turma, Integer> idturma;
    public static volatile SingularAttribute<Turma, Integer> qtdAluno;
    public static volatile SingularAttribute<Turma, String> nome;
    public static volatile SingularAttribute<Turma, Integer> numerosala;
    public static volatile SingularAttribute<Turma, String> turno;
    public static volatile CollectionAttribute<Turma, Professores> professoresCollection;

}