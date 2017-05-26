/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlo
 */
@Entity
@Table(name = "responsavel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsavel.findAll", query = "SELECT r FROM Responsavel r")
    , @NamedQuery(name = "Responsavel.findByIdresponsavel", query = "SELECT r FROM Responsavel r WHERE r.idresponsavel = :idresponsavel")})
public class Responsavel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idresponsavel")
    private Integer idresponsavel;
    @JoinColumn(name = "alunos_matricula", referencedColumnName = "matricula")
    @ManyToOne(optional = false)
    private Aluno alunosMatricula;
    @JoinColumn(name = "usuarios_idusuarios", referencedColumnName = "idusuarios")
    @ManyToOne(optional = false)
    private Usuario usuariosIdusuarios;

    public Responsavel() {
    }

    public Responsavel(Integer idresponsavel) {
        this.idresponsavel = idresponsavel;
    }

    public Integer getIdresponsavel() {
        return idresponsavel;
    }

    public void setIdresponsavel(Integer idresponsavel) {
        this.idresponsavel = idresponsavel;
    }

    public Aluno getAlunosMatricula() {
        return alunosMatricula;
    }

    public void setAlunosMatricula(Aluno alunosMatricula) {
        this.alunosMatricula = alunosMatricula;
    }

    public Usuario getUsuariosIdusuarios() {
        return usuariosIdusuarios;
    }

    public void setUsuariosIdusuarios(Usuario usuariosIdusuarios) {
        this.usuariosIdusuarios = usuariosIdusuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresponsavel != null ? idresponsavel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsavel)) {
            return false;
        }
        Responsavel other = (Responsavel) object;
        if ((this.idresponsavel == null && other.idresponsavel != null) || (this.idresponsavel != null && !this.idresponsavel.equals(other.idresponsavel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Responsavel[ idresponsavel=" + idresponsavel + " ]";
    }
    
}
