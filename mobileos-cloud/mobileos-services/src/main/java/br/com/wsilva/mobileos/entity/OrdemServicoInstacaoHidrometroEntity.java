package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_ordem_servico_insthm")
@Data
public class OrdemServicoInstacaoHidrometroEntity {
    @Id
    @Column(name = "osih_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "orse_id")
    private OrdemServicoEntity ordemServico;

    @ManyToOne
    @JoinColumn(name = "hloi_id")
    private HidrometroLocalInstalacaoEntity hidrometroLocalInstalacao;

    @ManyToOne
    @JoinColumn(name = "hpro_id")
    private HidrometroProtecaoEntity hidrometroProtecao;

    @ManyToOne
    @JoinColumn(name = "htpi_id")
    private HidrometroTipoInstalacaoEntity hidrometroTipoInstalacao;

    @Column(name = "osih_dtinstalacao")
    private Date dataInstalacao;

    @Column(name = "osih_ictipoprotecao")
    private String indicadorTipoProtecao;

    @Column(name = "osih_ictrocaprotecao")
    private String indicadorTrocaProtecao;

    @Column(name = "osih_ictrocaregistro")
    private String indicadorTrocaRegistro;

    @Column(name = "osih_nnleiturainstalacao")
    private String leituraInstalacao;

    @Column(name = "osih_nnselo")
    private String numeroSelo;

    @Column(name = "osih_iccavalete")
    private String indicadorCavalete;

    public OrdemServicoInstacaoHidrometroEntity() {
    }
}