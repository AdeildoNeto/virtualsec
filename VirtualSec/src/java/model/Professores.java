/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlo
 */
@Entity
@Table(name = "professores")
@XmlRootElement
@PrimaryKeyJoinColumn(name="idprofessores", referencedColumnName = "idusuarios")
public class Professores extends Usuario implements Serializable {

    @JoinColumn(name = "idturma", referencedColumnName = "idturma")
    @ManyToOne(optional = false)
    private Turma idturma;


    private static final long serialVersionUID = 1L;
 //   @Id
 //   @Basic(optional = false)
 //   @Column(name = "idprofessores")
 //   private Integer idprofessores;

    @JoinColumn(name = "idprofessores", referencedColumnName = "idusuarios", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Professores() {
    }
/*
    public Professores(Integer idprofessores) {
        this.idprofessores = idprofessores;
    }

    public Integer getIdprofessores() {
        return idprofessores;
    }

    public void setIdprofessores(Integer idprofessores) {
        this.idprofessores = idprofessores;
    }
*/
   /*
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    */
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
        hash += (idprofessores != null ? idprofessores.hashCode() : 0);
        return hash;
    }

    */
    /*
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professores)) {
            return false;
        }
        Professores other = (Professores) object;
        if ((this.idprofessores == null && other.idprofessores != null) || (this.idprofessores != null && !this.idprofessores.equals(other.idprofessores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Professores[ idprofessores=" + idprofessores + " ]";
    }

    public Professores(Integer idprofessores) {
        this.idprofessores = idprofessores;
    }

    public Integer getIdprofessores() {
        return idprofessores;
    }

    public void setIdprofessores(Integer idprofessores) {
        this.idprofessores = idprofessores;
    }
    */

    public int getIdturma() {
       
       return idturma.getIdturma();
        
        
    }

    public void setIdturma(Turma turma) {
       int id = turma.getIdturma();
       this.idturma.setIdturma(id);
    }
    
    public Turma getTurma() {
       
       return idturma;
        
        
    }

    public void setTurma(Turma turma) {
       this.idturma = turma;
    }
   
}
