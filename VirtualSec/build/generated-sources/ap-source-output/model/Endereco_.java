package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-13T18:19:24")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, String> uf;
    public static volatile SingularAttribute<Endereco, String> cidade;
    public static volatile SingularAttribute<Endereco, Integer> numero;
    public static volatile SingularAttribute<Endereco, Integer> idendereco;
    public static volatile CollectionAttribute<Endereco, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Endereco, String> rua;
    public static volatile SingularAttribute<Endereco, Integer> cep;

}