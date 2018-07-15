package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_ordem_servico_subshm")
@Data
public class OrdemServicoSubstituicaoHidrometroEntity {
    @Id
    @Column(name = "ossh_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "orse_id")
    private OrdemServicoEntity ordemServico;

    @Column(name = "ossh_nnhidrometroatual", length = 20)
    private String numeroHidrometroAtual;

    @Column(name = "ossh_ictipomedicaoatual")
    private Integer indicadorTipoMedicaoAtual;

    @Temporal(TemporalType.DATE)
    @Column(name = "ossh_dtretirada")
    private Date dataRetirada;

    @Column(name = "ossh_nnleituraretirada")
    private Date numeroLeituraRetirada;

    @ManyToOne
    @JoinColumn(name = "hdst_id")
    private HidrometroSituacaoEntity hidrometroSituacao;

    @ManyToOne
    @JoinColumn(name = "hdla_id")
    private HidrometroLocalArmazenamentoEntity hidrometroLocalArmazenamento;

    @Column(name = "ossh_nnhidrometronovo", length = 20)
    private String numeroHidrometroNovo;

    @Column(name = "ossh_dtinstalacao")
    private Date dataInstalacao;

    @Column(name = "ossh_ictipomedicao")
    private Integer indicadorTipoMedicao;

    @ManyToOne
    @JoinColumn(name = "hloi_id")
    private HidrometroLocalInstalacaoEntity hidrometroLocalInstalacao;

    @ManyToOne
    @JoinColumn(name = "hpro_id")
    private HidrometroProtecaoEntity hidrometroProtecao;

    @Column(name = "ossh_ictrocaprotecao")
    private Integer indicadorTrocaProtecao;

    @Column(name = "ossh_ictrocaregistro")
    private Integer indicadorTrocaRegistro;

    @Column(name = "ossh_nnleiturainstalacao")
    private Integer leituraInstalacao;

    @Column(name = "ossh_nnselo", length = 20)
    private Integer numeroSelo;

    @Column(name = "ossh_iccavalete", length = 1)
    private String indicadorCavalete;

    @ManyToOne
    @JoinColumn(name = "hits_id")
    private HidrometroTipoSubstituicaoEntity hidrometroTipoSubstituicao;

    @Column(name = "ossh_tminstalacao", length = 10)
    private String ossh_tminstalacao;

    public OrdemServicoSubstituicaoHidrometroEntity() {
    }
}

