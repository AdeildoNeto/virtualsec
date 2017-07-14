package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Aluno;
import model.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-13T18:19:24")
@StaticMetamodel(Responsavel.class)
public class Responsavel_ extends Usuario_ {

    public static volatile SingularAttribute<Responsavel, String> parentesco;
    public static volatile SingularAttribute<Responsavel, Usuario> usuario;
    public static volatile SingularAttribute<Responsavel, Aluno> alunosMatricula;

}