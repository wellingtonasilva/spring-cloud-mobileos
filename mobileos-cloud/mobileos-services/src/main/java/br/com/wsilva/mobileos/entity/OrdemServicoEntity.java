package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_ordem_servico")
@Data
public class OrdemServicoEntity {
    @Id
    @Column(name = "orse_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "orse_cdsituacao")
    private Integer codigoSituacaoOS;

    @Column(name = "orse_dssituacao", length = 25)
    private Integer descricaoSituacaoOS;

    @Column(name = "orse_tmgeracao")
    private Date dataGeracaoOS;

    @Column(name = "orse_dsobservacao", length = 400)
    private String observacaoOS;

    @Column(name = "rgat_id")
    private Integer registroAtendimento;

    @Column(name = "rgat_cdsituacao")
    private Integer codigoSituacaoRA;

    @Column(name = "rgat_dssituacao")
    private Integer descricaoSituacaoRA;

    @Column(name = "rgat_tmregistroatendimento")
    private Date dataGeracaoRA;

    @Column(name = "rgat_dsobservacao")
    private String observacaoRA;

    @ManyToOne
    @JoinColumn(name = "svtp_id")
    private ServicoTipoEntity servicoTipo;

    @Column(name = "logr_nmlogradouro")
    private String logradouro;

    @Column(name = "bair_nmbairro")
    private String bairro;

    @Column(name = "rgat_nnimovel")
    private String numeroImovel;

    @Column(name = "clie_id")
    private Integer clienteId;

    @Column(name = "imov_id")
    private Integer imovelId;

    @Column(name = "clie_nmcliente")
    private String nomeCliente;

    @ManyToOne
    @JoinColumn(name = "svtp_idexecutado", referencedColumnName = "svtp_id")
    private ServicoTipoEntity servicoTipoExecutado;

    @Column(name = "orse_tmencerramento")
    private Date dataEncerramentoOS;

    @ManyToOne
    @JoinColumn(name = "mote_id")
    private MotivoEncerramentoEntity motivoEncerramento;

    @Column(name = "orse_dsparecerencerramento")
    private String parecerEncerramentoOS;

    @Column(name = "orse_dtexecucao")
    private Date dataExecucaoOS;

    @Column(name = "orse_tmexecucao_inicio")
    private String horaExecucaoInicio;

    @Column(name = "orse_tmexecucao_fim")
    private String horaExecucaoFim;

    @ManyToOne
    @JoinColumn(name = "eqpe_idexecucao")
    private EquipeEntity equipeExecucao;

    @Column(name = "orse_nnprofunidaderede")
    private String redeProfundidade;

    @Column(name = "orse_nnpressaorede")
    private String redePressao;

    @Column(name = "orse_tmcancelamento")
    private Date dataCancelamento;

    @ManyToOne
    @JoinColumn(name = "svtp_idgerar", referencedColumnName = "svtp_id")
    private ServicoTipoEntity servicoTipoGerar;

    @Column(name = "orse_nnkminicial")
    private Integer kmInicial;

    @Column(name = "orse_nnkmfinal")
    private Integer kmFinal;

    @Column(name = "orse_dtprogramacao")
    private Date dataProgracaoOS;

    @ManyToOne
    @JoinColumn(name = "eqpe_idprogramada")
    private EquipeEntity equipeProgramada;

    @Column(name = "hidr_nnanofabricacao")
    private Integer anoFabricaoHidrometro;

    @Column(name = "hidr_nnhidrometro")
    private String numeroHidrometro;

    @Column(name = "rgat_dscomplementoendereco")
    private String complementoEnderecoRA;

    @Column(name = "hidi_dtinstalacaohidrometro")
    private Date hidrometroDataInstalacao;

    @Column(name = "hidi_nnselo")
    private String hidrometroSelo;

    @Column(name = "imov_nnlote")
    private Integer numeroLote;

    @Column(name = "qdra_nnquadra")
    private String numeroQuadra;

    @Column(name = "imov_nnsequencialrota")
    private Integer sequencialRota;

    @Column(name = "imov_nnsublote")
    private Integer sublote;

    @Column(name = "stcm_id")
    private Integer setorComercial;

    public OrdemServicoEntity() {
    }
}

