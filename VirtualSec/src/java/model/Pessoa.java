/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author joselima
 */
@Entity
@Table(name = "Pessoa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p"),
    @NamedQuery(name = "Pessoa.findByIdpessoas", query = "SELECT p FROM Pessoa p WHERE p.idpessoas = :idpessoas"),
    @NamedQuery(name = "Pessoa.findByCpf", query = "SELECT p FROM Pessoa p WHERE p.cpf = :cpf"),
    @NamedQuery(name = "Pessoa.findByTelefone", query = "SELECT p FROM Pessoa p WHERE p.telefone = :telefone"),
    @NamedQuery(name = "Pessoa.findByEmail", query = "SELECT p FROM Pessoa p WHERE p.email = :email"),
    @NamedQuery(name = "Pessoa.findByNomecompleto", query = "SELECT p FROM Pessoa p WHERE p.nomecompleto = :nomecompleto")})
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpessoas")
    private Integer idpessoas;
    @Column(name = "cpf")
    private Integer cpf;
    @Column(name = "telefone")
    private Integer telefone;
    @Column(name = "email")
    private String email;
    @Column(name = "nomecompleto")
    private String nomecompleto;
    @OneToMany(mappedBy = "pessoasIdpessoas")
    private Collection<Usuario> usuarioCollection;
    @JoinColumn(name = "endereco_idendereco", referencedColumnName = "idendereco")
    @ManyToOne
    private Endereco enderecoIdendereco;

    public Pessoa() {
    }

    public Pessoa(Integer idpessoas) {
        this.idpessoas = idpessoas;
    }

    public Integer getIdpessoas() {
        return idpessoas;
    }

    public void setIdpessoas(Integer idpessoas) {
        this.idpessoas = idpessoas;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    public Endereco getEnderecoIdendereco() {
        return enderecoIdendereco;
    }

    public void setEnderecoIdendereco(Endereco enderecoIdendereco) {
        this.enderecoIdendereco = enderecoIdendereco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpessoas != null ? idpessoas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idpessoas == null && other.idpessoas != null) || (this.idpessoas != null && !this.idpessoas.equals(other.idpessoas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pessoa[ idpessoas=" + idpessoas + " ]";
    }
    
}
