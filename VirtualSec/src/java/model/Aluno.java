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
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a")
    , @NamedQuery(name = "Aluno.findByMatricula", query = "SELECT a FROM Aluno a WHERE a.matricula = :matricula")})
public class Aluno implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alunosMatricula")
    private Collection<model.Relatorioparental> relatorioparentalCollection;

    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "data_nascimento")
    private String dataNascimento;
    @Basic(optional = false)
    @Column(name = "deficiencia")
    private String deficiencia;
    
    @JoinColumn(name = "id_turma", referencedColumnName = "idturma")
    @ManyToOne(optional = false)
    private Turma idTurma;
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "matricula")
    private Integer matricula;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alunosMatricula")
    private Collection<Responsavel> responsavelCollection;
    
    public Aluno() {
    }
    
    public Aluno(Integer matricula) {
        this.matricula = matricula;
    }
    
    public Integer getMatricula() {
        return matricula;
    }
    
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    
    /*
    public Responsavel getResponsavelIdresponsavel() {
        return responsavelIdresponsavel;
    }
    
    public void setResponsavelIdresponsavel(Responsavel responsavelIdresponsavel) {
        this.responsavelIdresponsavel = responsavelIdresponsavel;
    }
    */
    @XmlTransient
    public Collection<Responsavel> getResponsavelCollection() {
        return responsavelCollection;
    }
    
    public void setResponsavelCollection(Collection<Responsavel> responsavelCollection) {
        this.responsavelCollection = responsavelCollection;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "model.Aluno[ matricula=" + matricula + " ]";
    }
    
    public int getIdTurma() {
        return this.idTurma.getIdturma();
    }
    
    public void setIdTurma(Turma idTurma) {
        int id = idTurma.getIdturma();
        this.idTurma.setIdturma(id);
    }
    
    public int getTurmaIdInt(){
        return idTurma.getIdturma();
    }
    
    public void setTurmaIdInt(int id)
    {
         idTurma.setIdturma(id);
    }
    
      public Turma getTurma() {
        return idTurma;
    }

    public void setTurma(Turma idturma) {
        this.idTurma = idturma;
    }
    

    @XmlTransient
    public Collection<Relatorioparental> getRelatorioparentalCollection() {
        return relatorioparentalCollection;
    }

    public void setRelatorioparentalCollection(Collection<Relatorioparental> relatorioparentalCollection) {
        this.relatorioparentalCollection = relatorioparentalCollection;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    
}
