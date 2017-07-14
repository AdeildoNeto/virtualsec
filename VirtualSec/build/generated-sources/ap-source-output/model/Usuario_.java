package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Endereco;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-13T18:19:24")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, Integer> telefone;
    public static volatile SingularAttribute<Usuario, Integer> idusuarios;
    public static volatile SingularAttribute<Usuario, String> nomecompleto;
    public static volatile SingularAttribute<Usuario, String> rg;
    public static volatile SingularAttribute<Usuario, Integer> cpf;
    public static volatile SingularAttribute<Usuario, String> dtype;
    public static volatile SingularAttribute<Usuario, Integer> tipousuarios;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, String> dataNascimento;
    public static volatile SingularAttribute<Usuario, Endereco> enderecoIdendereco;
    public static volatile SingularAttribute<Usuario, String> email;

}