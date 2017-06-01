
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
@Table(name = "relatorioParental")
@XmlRootElement

public class Relatorioparental implements Serializable {

    @JoinColumn(name = "alunos_matricula", referencedColumnName = "matricula")
    @ManyToOne(optional = false)
    private Aluno alunosMatricula;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelatorioParental")
    private Integer idRelatorioParental;
    @Column(name = "observacoes")
    private String observacoes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "comportamento")
    private Float comportamento;
    @Column(name = "participacao_em_aula")
    private Float participacaoEmAula;
    @Column(name = "facilidade_com_disciplina")
    private Float facilidadeComDisciplina;
    @Column(name = "trabalho_em_equipe")
    private Float trabalhoEmEquipe;
    @Column(name = "lideranca")
    private Float lideranca;
    @Column(name = "motivacao")
    private Float motivacao;
    @Column(name = "criatividade")
    private Float criatividade;
    

    public Relatorioparental() {
    }

    public Relatorioparental(Integer idRelatorioParental) {
        this.idRelatorioParental = idRelatorioParental;
    }

    public Relatorioparental(Integer idRelatorioParental, int alunosMatricula, int professoresIdprofessores, int responsavelIdresponsavel) {
        this.idRelatorioParental = idRelatorioParental;
        this.alunosMatricula = alunosMatricula;
        this.professoresIdprofessores = professoresIdprofessores;
        this.responsavelIdresponsavel = responsavelIdresponsavel;
    }

    public Integer getIdRelatorioParental() {
        return idRelatorioParental;
    }

    public void setIdRelatorioParental(Integer idRelatorioParental) {
        this.idRelatorioParental = idRelatorioParental;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Float getComportamento() {
        return comportamento;
    }

    public void setComportamento(Float comportamento) {
        this.comportamento = comportamento;
    }

    public Float getParticipacaoEmAula() {
        return participacaoEmAula;
    }

    public void setParticipacaoEmAula(Float participacaoEmAula) {
        this.participacaoEmAula = participacaoEmAula;
    }

    public Float getFacilidadeComDisciplina() {
        return facilidadeComDisciplina;
    }

    public void setFacilidadeComDisciplina(Float facilidadeComDisciplina) {
        this.facilidadeComDisciplina = facilidadeComDisciplina;
    }

    public Float getTrabalhoEmEquipe() {
        return trabalhoEmEquipe;
    }

    public void setTrabalhoEmEquipe(Float trabalhoEmEquipe) {
        this.trabalhoEmEquipe = trabalhoEmEquipe;
    }

    public Float getLideranca() {
        return lideranca;
    }

    public void setLideranca(Float lideranca) {
        this.lideranca = lideranca;
    }

    public Float getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(Float motivacao) {
        this.motivacao = motivacao;
    }

    public Float getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(Float criatividade) {
        this.criatividade = criatividade;
    }

   

    public int getProfessoresIdprofessores() {
        return professoresIdprofessores;
    }

    public void setProfessoresIdprofessores(int professoresIdprofessores) {
        this.professoresIdprofessores = professoresIdprofessores;
    }

    public int getResponsavelIdresponsavel() {
        return responsavelIdresponsavel;
    }

    public void setResponsavelIdresponsavel(int responsavelIdresponsavel) {
        this.responsavelIdresponsavel = responsavelIdresponsavel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelatorioParental != null ? idRelatorioParental.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relatorioparental)) {
            return false;
        }
        Relatorioparental other = (Relatorioparental) object;
        if ((this.idRelatorioParental == null && other.idRelatorioParental != null) || (this.idRelatorioParental != null && !this.idRelatorioParental.equals(other.idRelatorioParental))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relatorioparental[ idRelatorioParental=" + idRelatorioParental + " ]";
    }

    public Aluno getAlunosMatricula() {
        return alunosMatricula;
    }

    public void setAlunosMatricula(Aluno alunosMatricula) {
        this.alunosMatricula = alunosMatricula;
    }
    
}
