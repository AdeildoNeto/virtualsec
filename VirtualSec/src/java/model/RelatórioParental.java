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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aldo_neto
 */
@Entity
@Table(name = "Relat\u00f3rioParental")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relat\u00f3rioParental.findAll", query = "SELECT r FROM Relat\u00f3rioParental r")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByIdRelat\u00f3rioParental", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.idRelat\u00f3rioParental = :idRelat\u00f3rioParental")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByObservacoes", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.observacoes = :observacoes")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByComportamento", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.comportamento = :comportamento")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByParticipacaoEmAula", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.participacaoEmAula = :participacaoEmAula")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByFacilidadeComDisciplina", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.facilidadeComDisciplina = :facilidadeComDisciplina")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByTrabalhoEmEquipe", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.trabalhoEmEquipe = :trabalhoEmEquipe")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByLideranca", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.lideranca = :lideranca")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByMotivacao", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.motivacao = :motivacao")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByCriatividade", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.criatividade = :criatividade")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByAlunosMatricula", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.alunosMatricula = :alunosMatricula")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByProfessoresIdprofessores", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.professoresIdprofessores = :professoresIdprofessores")
    , @NamedQuery(name = "Relat\u00f3rioParental.findByResponsavelIdresponsavel", query = "SELECT r FROM Relat\u00f3rioParental r WHERE r.responsavelIdresponsavel = :responsavelIdresponsavel")})
public class RelatórioParental implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idRelat\u00f3rioParental")
    private Integer idRelatórioParental;
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
    @Basic(optional = false)
    @Column(name = "alunos_matricula")
    private int alunosMatricula;
    @Basic(optional = false)
    @Column(name = "professores_idprofessores")
    private int professoresIdprofessores;
    @Basic(optional = false)
    @Column(name = "responsavel_idresponsavel")
    private int responsavelIdresponsavel;

    public RelatórioParental() {
    }

    public RelatórioParental(Integer idRelatórioParental) {
        this.idRelatórioParental = idRelatórioParental;
    }

    public RelatórioParental(Integer idRelatórioParental, int alunosMatricula, int professoresIdprofessores, int responsavelIdresponsavel) {
        this.idRelatórioParental = idRelatórioParental;
        this.alunosMatricula = alunosMatricula;
        this.professoresIdprofessores = professoresIdprofessores;
        this.responsavelIdresponsavel = responsavelIdresponsavel;
    }

    public Integer getIdRelatórioParental() {
        return idRelatórioParental;
    }

    public void setIdRelatórioParental(Integer idRelatórioParental) {
        this.idRelatórioParental = idRelatórioParental;
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

    public int getAlunosMatricula() {
        return alunosMatricula;
    }

    public void setAlunosMatricula(int alunosMatricula) {
        this.alunosMatricula = alunosMatricula;
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
        hash += (idRelatórioParental != null ? idRelatórioParental.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelatórioParental)) {
            return false;
        }
        RelatórioParental other = (RelatórioParental) object;
        if ((this.idRelatórioParental == null && other.idRelatórioParental != null) || (this.idRelatórioParental != null && !this.idRelatórioParental.equals(other.idRelatórioParental))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relat\u00f3rioParental[ idRelat\u00f3rioParental=" + idRelatórioParental + " ]";
    }
    
}
