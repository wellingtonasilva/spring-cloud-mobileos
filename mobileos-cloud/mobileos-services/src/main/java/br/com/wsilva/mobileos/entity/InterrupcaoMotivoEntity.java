package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_interrupcao_motivo")
@Data
public class InterrupcaoMotivoEntity {
    @Id
    @Column(name = "inmo_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "inmo_dsinterrupcaomotivo")
    private String descricao;

    @Column(name = "inmo_dsabreviado")
    private String abreviado;

    @Column(name = "inmo_icenviarsmsinicio")
    private Integer indicadorEnviarSMSInicio;

    @Column(name = "inmo_icenviarsmsfim")
    private Integer indicadorEnviarSMSFim;

    @Column(name = "inmo_icinicioatividade")
    private Integer indicadorInicioAtividade;

    @Column(name = "inmo_icchecklistsaida")
    private Integer indicadorCheckListSaida;

    @Column(name = "inmo_icchecklistretorno")
    private Integer indicadorCheckListRetorno;

    @Column(name = "inmo_icsolicitakminicio")
    private Integer indicadorSolicitaKMInicio;

    @Column(name = "inmo_iccsolicitakmfim")
    private Integer indicadorSolicitaKMFim;

    public InterrupcaoMotivoEntity() {
    }
}

