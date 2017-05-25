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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aldo_neto
 */
@Entity
@Table(name = "Professores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professores.findAll", query = "SELECT p FROM Professores p")
    , @NamedQuery(name = "Professores.findByIdprofessores", query = "SELECT p FROM Professores p WHERE p.idprofessores = :idprofessores")
    , @NamedQuery(name = "Professores.findByDisciplina", query = "SELECT p FROM Professores p WHERE p.disciplina = :disciplina")})
public class Professores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idprofessores")
    private Integer idprofessores;
    @Column(name = "disciplina")
    private String disciplina;
    @JoinColumn(name = "usuarios_idusuarios", referencedColumnName = "idusuarios")
    @ManyToOne(optional = false)
    private Usuario usuariosIdusuarios;

    public Professores() {
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
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
        hash += (idprofessores != null ? idprofessores.hashCode() : 0);
        return hash;
    }

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
    
}
