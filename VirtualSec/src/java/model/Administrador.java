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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlo
 */
@Entity
@Table(name = "administrador")
@XmlRootElement
@PrimaryKeyJoinColumn(name="idadministrador", referencedColumnName = "idusuarios")
public class Administrador extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
   // @Basic(optional = false)
    
    @Column(name = "cargo")
    private String cargo;
    @JoinColumn(name = "idadministrador", referencedColumnName = "idusuarios", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Administrador() {
    }

   // public Administrador(Integer idadministrador) {
   //     this.idadministrador = idadministrador;
  //  }

  //  public Integer getIdadministrador() {
   //     return idadministrador;
  //  }

 //   public void setIdadministrador(Integer idadministrador) {
  //      this.idadministrador = idadministrador;
  //  }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idadministrador != null ? idadministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.idadministrador == null && other.idadministrador != null) || (this.idadministrador != null && !this.idadministrador.equals(other.idadministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Administrador[ idadministrador=" + idadministrador + " ]";
    }
    
}
