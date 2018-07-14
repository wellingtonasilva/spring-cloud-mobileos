package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_interrupcao")
@Data
public class InterrupcaoEntity {
    @Id
    @Column(name = "inte_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "inmo_id")
    private InterrupcaoMotivoEntity interrupcaoMotivo;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @ManyToOne
    @JoinColumn(name = "eqpe_id")
    private EquipeEntity equipe;

    @Column(name = "inte_dtmovimento")
    private Date dataMovimento;

    @Column(name = "inte_nmequipe")
    private String nomeEquipe;

    @Column(name = "inte_nnmatricula")
    private String numeroMatricula;

    @Column(name = "inte_nnos")
    private Integer numerOS;

    @Column(name = "inte_dsinterrupcaomotivo")
    private String descricaoInterrupcaoMotivo;

    @Column(name = "inte_dsobervacaoinicio")
    private String observacaoInicio;

    @Column(name = "inte_dsobervacaofim")
    private String observacaoFim;

    @Column(name = "inte_dtinicio")
    private Date dataInicio;

    @Column(name = "inte_hrinicio")
    private String horaInicio;

    @Column(name = "inte_dtfim")
    private Date dataFim;

    @Column(name = "inte_hrfim")
    private String horaFim;

    @Column(name = "inte_icenviousmsinicio")
    private Integer indicadorEnviouSMSInicio;

    @Column(name = "inte_icenviousmsfim")
    private Integer indicadorEnviouSMSFim;

    public InterrupcaoEntity() {
    }
}

