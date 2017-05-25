/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author aldo_neto
 */
@Entity
@Table(name = "Usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdusuarios", query = "SELECT u FROM Usuario u WHERE u.idusuarios = :idusuarios")
    , @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login")
    , @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha")
    , @NamedQuery(name = "Usuario.findByTipousuarios", query = "SELECT u FROM Usuario u WHERE u.tipousuarios = :tipousuarios")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuarios")
    private Integer idusuarios;
    @Column(name = "login")
    private String login;
    @Column(name = "senha")
    private String senha;
    @Column(name = "tipousuarios")
    private Integer tipousuarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuariosIdusuarios")
    private Collection<Turma> turmaCollection;
    @JoinColumn(name = "pessoas_idpessoas", referencedColumnName = "idpessoas")
    @ManyToOne(optional = false)
    private Pessoa pessoasIdpessoas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuariosIdusuarios")
    private Collection<Professores> professoresCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuariosIdusuarios")
    private Collection<Responsavel> responsavelCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuariosIdusuarios")
    private Collection<Aluno> alunoCollection;

    public Usuario() {
    }

    public Usuario(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public Integer getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getTipousuarios() {
        return tipousuarios;
    }

    public void setTipousuarios(Integer tipousuarios) {
        this.tipousuarios = tipousuarios;
    }

    @XmlTransient
    public Collection<Turma> getTurmaCollection() {
        return turmaCollection;
    }

    public void setTurmaCollection(Collection<Turma> turmaCollection) {
        this.turmaCollection = turmaCollection;
    }

    public Pessoa getPessoasIdpessoas() {
        return pessoasIdpessoas;
    }

    public void setPessoasIdpessoas(Pessoa pessoasIdpessoas) {
        this.pessoasIdpessoas = pessoasIdpessoas;
    }

    @XmlTransient
    public Collection<Professores> getProfessoresCollection() {
        return professoresCollection;
    }

    public void setProfessoresCollection(Collection<Professores> professoresCollection) {
        this.professoresCollection = professoresCollection;
    }

    @XmlTransient
    public Collection<Responsavel> getResponsavelCollection() {
        return responsavelCollection;
    }

    public void setResponsavelCollection(Collection<Responsavel> responsavelCollection) {
        this.responsavelCollection = responsavelCollection;
    }

    @XmlTransient
    public Collection<Aluno> getAlunoCollection() {
        return alunoCollection;
    }

    public void setAlunoCollection(Collection<Aluno> alunoCollection) {
        this.alunoCollection = alunoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuarios != null ? idusuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuarios == null && other.idusuarios != null) || (this.idusuarios != null && !this.idusuarios.equals(other.idusuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Usuario[ idusuarios=" + idusuarios + " ]";
    }
    
}
