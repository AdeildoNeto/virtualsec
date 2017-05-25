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
 * @author joselima
 */
@Entity
@Table(name = "RelatorioParental")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelatorioParental.findAll", query = "SELECT r FROM RelatorioParental r"),
    @NamedQuery(name = "RelatorioParental.findByIdrelatorioparental", query = "SELECT r FROM RelatorioParental r WHERE r.idrelatorioparental = :idrelatorioparental"),
    @NamedQuery(name = "RelatorioParental.findByObservacoes", query = "SELECT r FROM RelatorioParental r WHERE r.observacoes = :observacoes"),
    @NamedQuery(name = "RelatorioParental.findByComportamento", query = "SELECT r FROM RelatorioParental r WHERE r.comportamento = :comportamento"),
    @NamedQuery(name = "RelatorioParental.findByParticipacaoEmAula", query = "SELECT r FROM RelatorioParental r WHERE r.participacaoEmAula = :participacaoEmAula"),
    @NamedQuery(name = "RelatorioParental.findByFacilidadeComDisciplina", query = "SELECT r FROM RelatorioParental r WHERE r.facilidadeComDisciplina = :facilidadeComDisciplina"),
    @NamedQuery(name = "RelatorioParental.findByTrabalhoEmEquipe", query = "SELECT r FROM RelatorioParental r WHERE r.trabalhoEmEquipe = :trabalhoEmEquipe"),
    @NamedQuery(name = "RelatorioParental.findByLideranca", query = "SELECT r FROM RelatorioParental r WHERE r.lideranca = :lideranca"),
    @NamedQuery(name = "RelatorioParental.findByMotivacao", query = "SELECT r FROM RelatorioParental r WHERE r.motivacao = :motivacao"),
    @NamedQuery(name = "RelatorioParental.findByCriatividade", query = "SELECT r FROM RelatorioParental r WHERE r.criatividade = :criatividade")})
public class RelatorioParental implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrelatorioparental")
    private Integer idrelatorioparental;
    @Column(name = "observacoes")
    private String observacoes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "comportamento")
    private Double comportamento;
    @Column(name = "participacao_em_aula")
    private Double participacaoEmAula;
    @Column(name = "facilidade_com_disciplina")
    private Double facilidadeComDisciplina;
    @Column(name = "trabalho_em_equipe")
    private Double trabalhoEmEquipe;
    @Column(name = "lideranca")
    private Double lideranca;
    @Column(name = "motivacao")
    private Double motivacao;
    @Column(name = "criatividade")
    private Double criatividade;
    @JoinColumn(name = "alunos_matricula", referencedColumnName = "matricula")
    @ManyToOne
    private Aluno alunosMatricula;
    @JoinColumn(name = "professores_idprofessores", referencedColumnName = "idprofessores")
    @ManyToOne
    private Professores professoresIdprofessores;
    @JoinColumn(name = "responsavel_idresponsavel", referencedColumnName = "idresponsavel")
    @ManyToOne
    private Responsavel responsavelIdresponsavel;

    public RelatorioParental() {
    }

    public RelatorioParental(Integer idrelatorioparental) {
        this.idrelatorioparental = idrelatorioparental;
    }

    public Integer getIdrelatorioparental() {
        return idrelatorioparental;
    }

    public void setIdrelatorioparental(Integer idrelatorioparental) {
        this.idrelatorioparental = idrelatorioparental;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Double getComportamento() {
        return comportamento;
    }

    public void setComportamento(Double comportamento) {
        this.comportamento = comportamento;
    }

    public Double getParticipacaoEmAula() {
        return participacaoEmAula;
    }

    public void setParticipacaoEmAula(Double participacaoEmAula) {
        this.participacaoEmAula = participacaoEmAula;
    }

    public Double getFacilidadeComDisciplina() {
        return facilidadeComDisciplina;
    }

    public void setFacilidadeComDisciplina(Double facilidadeComDisciplina) {
        this.facilidadeComDisciplina = facilidadeComDisciplina;
    }

    public Double getTrabalhoEmEquipe() {
        return trabalhoEmEquipe;
    }

    public void setTrabalhoEmEquipe(Double trabalhoEmEquipe) {
        this.trabalhoEmEquipe = trabalhoEmEquipe;
    }

    public Double getLideranca() {
        return lideranca;
    }

    public void setLideranca(Double lideranca) {
        this.lideranca = lideranca;
    }

    public Double getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(Double motivacao) {
        this.motivacao = motivacao;
    }

    public Double getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(Double criatividade) {
        this.criatividade = criatividade;
    }

    public Aluno getAlunosMatricula() {
        return alunosMatricula;
    }

    public void setAlunosMatricula(Aluno alunosMatricula) {
        this.alunosMatricula = alunosMatricula;
    }

    public Professores getProfessoresIdprofessores() {
        return professoresIdprofessores;
    }

    public void setProfessoresIdprofessores(Professores professoresIdprofessores) {
        this.professoresIdprofessores = professoresIdprofessores;
    }

    public Responsavel getResponsavelIdresponsavel() {
        return responsavelIdresponsavel;
    }

    public void setResponsavelIdresponsavel(Responsavel responsavelIdresponsavel) {
        this.responsavelIdresponsavel = responsavelIdresponsavel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrelatorioparental != null ? idrelatorioparental.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelatorioParental)) {
            return false;
        }
        RelatorioParental other = (RelatorioParental) object;
        if ((this.idrelatorioparental == null && other.idrelatorioparental != null) || (this.idrelatorioparental != null && !this.idrelatorioparental.equals(other.idrelatorioparental))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.RelatorioParental[ idrelatorioparental=" + idrelatorioparental + " ]";
    }
    
}
