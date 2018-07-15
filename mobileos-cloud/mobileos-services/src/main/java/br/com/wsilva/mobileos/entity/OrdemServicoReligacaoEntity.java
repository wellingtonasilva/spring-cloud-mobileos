package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_ordem_servico_religacao")
@Data
public class OrdemServicoReligacaoEntity {
    @Id
    @Column(name = "osre_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "orse_id")
    private OrdemServicoEntity ordemServico;

    @Column(name = "osre_dtreligacao")
    private Date dataReligacao;

    @Column(name = "osre_tmreligacao")
    private String horaReligacao;

    @Column(name = "osre_nnhidrometro")
    private String numeroHidrometro;

    @Column(name = "osre_dtinstalacao")
    private String dataInstalacao;

    @Column(name = "osre_nneiturainstalacao")
    private Integer leituraInstalcao;

    @Column(name = "osre_nnselo")
    private String numeroSelo;

    @Column(name = "osre_iccavelete")
    private String indicadorCavalete;

    @Column(name = "osre_ictrocaprotecao")
    private Integer indicadorTrocaProtecao;

    @Column(name = "osre_ictrocaregistro")
    private Integer indicadorTrocaRegistro;

    @ManyToOne
    @JoinColumn(name = "hloi_id")
    private HidrometroLocalInstalacaoEntity hidrometroLocalInstalacao;

    @ManyToOne
    @JoinColumn(name = "hpro_id")
    private HidrometroProtecaoEntity hidrometroProtecao;

    @ManyToOne
    @JoinColumn(name = "retp_id")
    private ReligacaoTipoEntity religacaoTipo;

    public OrdemServicoReligacaoEntity() {
    }
}