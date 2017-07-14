package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Aluno;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-13T18:19:24")
@StaticMetamodel(Relatorioparental.class)
public class Relatorioparental_ { 

    public static volatile SingularAttribute<Relatorioparental, String> observacoes;
    public static volatile SingularAttribute<Relatorioparental, Integer> idRelatorioParental;
    public static volatile SingularAttribute<Relatorioparental, Float> facilidadeComDisciplina;
    public static volatile SingularAttribute<Relatorioparental, Float> participacaoEmAula;
    public static volatile SingularAttribute<Relatorioparental, Float> lideranca;
    public static volatile SingularAttribute<Relatorioparental, Float> comportamento;
    public static volatile SingularAttribute<Relatorioparental, Float> trabalhoEmEquipe;
    public static volatile SingularAttribute<Relatorioparental, Float> criatividade;
    public static volatile SingularAttribute<Relatorioparental, Aluno> alunosMatricula;
    public static volatile SingularAttribute<Relatorioparental, Float> motivacao;

}