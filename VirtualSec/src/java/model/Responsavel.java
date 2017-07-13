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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author carlo
 */
@Entity
@Table(name = "responsavel")
@XmlRootElement
@PrimaryKeyJoinColumn(name = "idresponsavel", referencedColumnName = "idusuarios")
public class Responsavel extends Usuario implements Serializable {

    @Basic(optional = false)
    @Column(name = "parentesco")
    private String parentesco;

    private static final long serialVersionUID = 1L;
    // @Id
    // @Basic(optional = false)
    //  @Column(name = "idresponsavel")
    //  private Integer idresponsavel;

    @JoinColumn(name = "alunos_matricula", referencedColumnName = "matricula")
    @ManyToOne(optional = false)
    private Aluno alunosMatricula;
    @JoinColumn(name = "idresponsavel", referencedColumnName = "idusuarios", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Responsavel() {
    }

    /*
    public Responsavel(Integer idresponsavel) {
        this.idresponsavel = idresponsavel;
    }

    public Integer getIdresponsavel() {
        return idresponsavel;
    }

    public void setIdresponsavel(Integer idresponsavel) {
        this.idresponsavel = idresponsavel;
    }*/

    /*
    @XmlTransient
    public Collection<Aluno> getAlunoCollection() {
        return alunoCollection;
    }

    public void setAlunoCollection(Collection<Aluno> alunoCollection) {
        this.alunoCollection = alunoCollection;
    }
    */

    public Aluno getAlunosMatricula() {
        return alunosMatricula;
    }

    public void setAlunosMatricula(Aluno alunosMatricula) {
        this.alunosMatricula = alunosMatricula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /*
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresponsavel != null ? idresponsavel.hashCode() : 0);
        return hash;
    }

    */
    
    /*
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
    */
    /*
    @Override
    public String toString() {
        return "model.Responsavel[ idresponsavel=" + idresponsavel + " ]";
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

*/
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

   

}
