
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
 * @author carlo
 */
@Entity
@Table(name = "turma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t")
    , @NamedQuery(name = "Turma.findByNome", query = "SELECT t FROM Turma t WHERE t.nome = :nome")
    , @NamedQuery(name = "Turma.findByIdturma", query = "SELECT t FROM Turma t WHERE t.idturma = :idturma")
    , @NamedQuery(name = "Turma.findByTurno", query = "SELECT t FROM Turma t WHERE t.turno = :turno")
    , @NamedQuery(name = "Turma.findByNumerosala", query = "SELECT t FROM Turma t WHERE t.numerosala = :numerosala")})
public class Turma implements Serializable {

    @Column(name = "qtdAluno")
    private Integer qtdAluno;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTurma")
    private Collection<Aluno> alunoCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idturma")
    private Collection<Professores> professoresCollection;

    

    private static final long serialVersionUID = 1L;
    @Column(name = "nome")
    private String nome;
    @Id
    @Basic(optional = false)
    @Column(name = "idturma")
    private Integer idturma;
    @Column(name = "turno")
    private String turno;
    @Column(name = "numerosala")
    private Integer numerosala;

    public Turma() {
    }

    public Turma(Integer idturma) {
        this.idturma = idturma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdturma() {
        return idturma;
    }

    public void setIdturma(Integer idturma) {
        this.idturma = idturma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getNumerosala() {
        return numerosala;
    }

    public void setNumerosala(Integer numerosala) {
        this.numerosala = numerosala;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idturma != null ? idturma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.idturma == null && other.idturma != null) || (this.idturma != null && !this.idturma.equals(other.idturma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Turma[ idturma=" + idturma + " ]";
    }

    @XmlTransient
    public Collection<Professores> getProfessoresCollection() {
        return professoresCollection;
    }

    public void setProfessoresCollection(Collection<Professores> professoresCollection) {
        this.professoresCollection = professoresCollection;
    }

    @XmlTransient
    public Collection<Aluno> getAlunoCollection() {
        return alunoCollection;
    }

    public void setAlunoCollection(Collection<Aluno> alunoCollection) {
        this.alunoCollection = alunoCollection;
    }

    public Integer getQtdAluno() {
        return qtdAluno;
    }

    public void setQtdAluno(Integer qtdAluno) {
        this.qtdAluno = qtdAluno;
    }

    
    
}
